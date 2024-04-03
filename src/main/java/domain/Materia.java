package domain;

import java.util.ArrayList;

public class Materia {

    public Materia() {
    }

    public Materia(String nombre, ArrayList<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String nombre;

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public ArrayList<Materia> correlativas;
}
