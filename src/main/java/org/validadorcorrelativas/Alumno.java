package org.validadorcorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private final List<Materia> materiasAprobadas = new ArrayList<>();

    public void aproboMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public boolean estaAprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
