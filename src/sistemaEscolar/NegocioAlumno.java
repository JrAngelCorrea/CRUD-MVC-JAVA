package sistemaEscolar;

public class NegocioAlumno {

	String numeroControl;
	String nombreAlumno;
	String apellidoPaterno;
	String apellidoMaterno;
	String carrera;
	String grupo;

	DataAlumno dt = null;

	public NegocioAlumno() {

		dt = new DataAlumno();

	}

	public boolean insertar() {

		if (dt.insertarAlumno(this)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean eliminar() {

		if (dt.eliminarAlumno(this.numeroControl)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean cargar() {

		if (dt.cargarAlumno(this)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean actualizar() {

		if (dt.actualizarAlumno(this)) {

			return true;

		} else {

			return false;

		}

	}

	public String getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
