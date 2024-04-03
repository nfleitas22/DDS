package domain;

import java.util.ArrayList;

public class Inscripcion {

    public boolean aprobada(Alumno alumno, ArrayList<Materia> asignaturas){
        return asignaturas.stream().allMatch(materia -> this.correlativasControladas(alumno, materia));
    }

    public boolean correlativasControladas(Alumno alumno, Materia materia){
        return materia.getCorrelativas().stream().allMatch(alumno::tieneAprobada);
    }
}

