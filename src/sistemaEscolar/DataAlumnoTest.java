package sistemaEscolar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataAlumnoTest {

	@Test
	void testInsertarAlumno() {
		// fail("Not yet implemented");

		NegocioAlumno Alumno = new NegocioAlumno();

		Alumno.setNumeroControl("6");
		Alumno.setNombreAlumno("MIKE");
		Alumno.setApellidoPaterno("HERNANDEZ");
		Alumno.setApellidoMaterno("MARTINEZ");
		Alumno.setCarrera("ING ATUMOTRIZ");
		Alumno.setGrupo("610");

		assertEquals(Alumno.insertar(), true);

	}

	@Test
	void testEliminarAlumno() {
		// fail("Not yet implemented");

		NegocioAlumno Alumno = new NegocioAlumno();

		Alumno.setNumeroControl("4");

		assertEquals(Alumno.eliminar(), false);

	}

	@Test
	void testCargarAlumno() {
		// fail("Not yet implemented");

		NegocioAlumno Alumno = new NegocioAlumno();

		Alumno.setNumeroControl("3");

		assertEquals(Alumno.cargar(), false);

	}

	@Test
	void testActualizarAlumno() {
		// fail("Not yet implemented");
		
		NegocioAlumno Alumno = new NegocioAlumno();

		Alumno.setNumeroControl("1");
		Alumno.setNombreAlumno("ANGEL A");
		Alumno.setApellidoPaterno("JIMENEZ");
		Alumno.setApellidoMaterno("CORREA");
		Alumno.setCarrera("ING SOFTWARE");
		Alumno.setGrupo("609");

		assertEquals(Alumno.actualizar(), false);
		
	}

}
