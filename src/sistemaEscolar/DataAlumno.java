package sistemaEscolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAlumno {

	private static final String conector = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/alumno";
	private static final String user = "root";
	private static final String password = "123456789";

	static {

		try {

			Class.forName(conector);

			System.out.println("CONEXION EXITOSA");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

			System.out.println("CONEXION NO EXITOSA");

		}

	}

	public Connection conectar() {

		Connection conex = null;

		try {

			conex = DriverManager.getConnection(url, user, password);

			System.out.println("CONEXION EXITOSA");

		} catch (SQLException e) {

			e.printStackTrace();

			System.out.println("CONEXION NO EXITOSA");

		}

		return conex;

	}

	public boolean insertarAlumno(NegocioAlumno ng) {

		PreparedStatement ps = null;

		try {

			ps = conectar().prepareStatement("INSERT INTO alumno VALUES (?,?,?,?,?,?)");

			ps.setString(1, ng.getNumeroControl());
			ps.setString(2, ng.getNombreAlumno());
			ps.setString(3, ng.getApellidoPaterno());
			ps.setString(4, ng.getApellidoMaterno());
			ps.setString(5, ng.getCarrera());
			ps.setString(6, ng.getGrupo());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {

			e.printStackTrace();

			return false;

		}

	}

	public boolean eliminarAlumno(String NumeroControl) {

		PreparedStatement ps = null;

		try {

			ps = conectar().prepareStatement("DELETE FROM alumno WHERE NumeroControl = ?");

			ps.setString(1, NumeroControl);

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {

			e.printStackTrace();

			return false;

		}

	}

	public boolean cargarAlumno(NegocioAlumno ng) {

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = conectar().prepareStatement("SELECT * FROM alumno WHERE NumeroControl = ?");

			ps.setString(1, ng.getNumeroControl());

			rs = ps.executeQuery();

			if (rs.next()) {

				ng.setNumeroControl(rs.getString("NumeroControl"));
				ng.setNombreAlumno(rs.getString("NombreAlumno"));
				ng.setApellidoPaterno(rs.getString("ApellidoPaterno"));
				ng.setApellidoMaterno(rs.getString("ApellidoMaterno"));
				ng.setCarrera(rs.getString("Carrera"));
				ng.setGrupo(rs.getString("Grupo"));

			}

			return true;

		} catch (SQLException e) {

			e.printStackTrace();

			return false;

		}

	}

	public boolean actualizarAlumno(NegocioAlumno ng) {

		PreparedStatement ps = null;

		try {

			ps = conectar().prepareStatement("UPDATE alumno SET NombreAlumno = ?, ApellidoPaterno = ?, ApellidoMaterno = ?, Carrera = ?, Grupo = ? WHERE NumeroControl = ?");

			ps.setString(1, ng.getNombreAlumno());
			ps.setString(2, ng.getApellidoPaterno());
			ps.setString(3, ng.getApellidoMaterno());
			ps.setString(4, ng.getCarrera());
			ps.setString(5, ng.getGrupo());
			ps.setString(6, ng.getNumeroControl());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {

			e.printStackTrace();

			return false;

		}

	}

}
