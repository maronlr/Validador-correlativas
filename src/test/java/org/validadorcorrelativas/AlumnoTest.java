package org.validadorcorrelativas;

import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {

    @Test
    public void materiaAprobada() {
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia();

        alumno.aproboMateria(algoritmos);

        Assert.assertTrue(alumno.estaAprobada(algoritmos));
    }

    @Test
    public void materiaNoAprobada() {
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia();
        Materia algebra = new Materia();

        alumno.aproboMateria(algebra);

        Assert.assertFalse(alumno.estaAprobada(algoritmos));
    }

    @Test
    public void sinMateriasAprobadas() {
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia();

        Assert.assertFalse(alumno.estaAprobada(algoritmos));
    }

}
