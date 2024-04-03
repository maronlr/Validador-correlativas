package org.validadorcorrelativas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inscripcion {
    private final List<Materia> materias = new ArrayList<>();
    private final Alumno alumno;

    public Inscripcion(Alumno alumno, Materia materia, Materia... materias) {
        this.alumno = alumno;
        this.materias.add(materia);
        this.materias.addAll(Arrays.asList(materias));
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> materia.cumpleCorrelativas(alumno));
    }
}
