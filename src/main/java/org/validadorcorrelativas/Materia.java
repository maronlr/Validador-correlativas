package org.validadorcorrelativas;

import java.util.Arrays;
import java.util.List;

public class Materia {
    private final List<Materia> correlativas;

    public Materia(Materia ... correlativas) {
        this.correlativas = Arrays.asList(correlativas);
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        return correlativas.stream().allMatch(alumno::estaAprobada);
    }
}
