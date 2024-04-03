package org.validadorcorrelativas;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void cumpleCorrelativasMateriaSinCorrelativas() {
        Materia algoritmos = new Materia();
        Alumno alumno = new Alumno();

        Assert.assertTrue(algoritmos.cumpleCorrelativas(alumno));
    }

    @Test
    public void cumpleCorrelativasMateriaConCorrelativas() {
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia(algoritmos);
        Alumno alumno = new Alumno();

        alumno.aproboMateria(algoritmos);

        Assert.assertTrue(paradigmas.cumpleCorrelativas(alumno));
    }

    @Test
    public void noCumpleCorrelativas() {
        Materia algoritmos = new Materia();
        Materia paradigmas = new Materia(algoritmos);
        Alumno alumno = new Alumno();

        Assert.assertFalse(paradigmas.cumpleCorrelativas(alumno));
    }
}
