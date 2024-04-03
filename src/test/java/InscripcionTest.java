import org.junit.Assert;
import org.junit.Test;

import domain.*;

import java.util.ArrayList;

public class InscripcionTest {

    @Test
    public void inscripcionCorrecta(){
        ArrayList<Materia> correlativasDDS = new ArrayList<>();
        ArrayList<Materia> materiasAprobadasAlumno = new ArrayList<>();
        ArrayList<Materia> listaMateriasInscripcion = new ArrayList<>();
        Materia algoritmosYEstructuraDeDatos = new Materia("AyED", null);

        correlativasDDS.add(algoritmosYEstructuraDeDatos);
        materiasAprobadasAlumno.add(algoritmosYEstructuraDeDatos);

        Materia disenoDeSistemas = new Materia("DDS", correlativasDDS);

        Alumno nahuel = new Alumno("nahuel", materiasAprobadasAlumno);

        listaMateriasInscripcion.add(disenoDeSistemas);

        Inscripcion inscripcion = new Inscripcion();

        Assert.assertTrue(inscripcion.aprobada(nahuel, listaMateriasInscripcion));
    }

    @Test
    public void inscripcionIncorrecta(){
        ArrayList<Materia> correlativasDDS = new ArrayList<>();
        ArrayList<Materia> materiasAprobadasAlumno = new ArrayList<>();
        ArrayList<Materia> listaMateriasInscripcion = new ArrayList<>();
        Materia algoritmosYEstructuraDeDatos = new Materia("AyED", null);

        correlativasDDS.add(algoritmosYEstructuraDeDatos);
        //materiasAprobadasAlumno.add(algoritmosYEstructuraDeDatos);

        Materia disenoDeSistemas = new Materia("DDS", correlativasDDS);

        Alumno nahuel = new Alumno("nahuel", materiasAprobadasAlumno);

        listaMateriasInscripcion.add(disenoDeSistemas);

        Inscripcion inscripcion = new Inscripcion();

        Assert.assertFalse(inscripcion.aprobada(nahuel, listaMateriasInscripcion));
    }
}
