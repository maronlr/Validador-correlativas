package org.validadorcorrelativas;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void inscripcionAprobada() {
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia(algoritmos);
        Materia algebra = new Materia();
        Inscripcion inscripcion = new Inscripcion(alumno, paradigmas, algebra);

        alumno.aproboMateria(algoritmos);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionNoAprobada() {
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia(algoritmos);
        Materia algebra = new Materia();
        Inscripcion inscripcion = new Inscripcion(alumno, paradigmas, algebra);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
