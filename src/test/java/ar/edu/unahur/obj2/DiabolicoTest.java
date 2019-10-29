package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void entrenamiento() {
        Alma alma = new AlmaSimple(50, 100, true);
        Alma almaEntrenadaSupervivencia = new Supervivencia(alma);
        Alma almaCruzRoja = new CruzRoja(almaEntrenadaSupervivencia);
    }
    @Test
    public void pruebaParaoiso(){
        AlmaSimple alma = new AlmaSimple(10,20,true);
        Paraiso p1 = new Paraiso();
        assertTrue(p1.puedeEsconder(alma));
        AlmaSimple alma1 = new AlmaSimple(0,20,true);
        assertFalse(p1.puedeEsconder(alma1));
    }
    @Test
    public void pruebaInfierno(){
        AlmaSimple alma = new AlmaSimple(10,10,false);
        Infierno p1 = new Infierno();
        assertTrue(p1.puedeEsconder(alma));
        AlmaSimple alma1 = new AlmaSimple(0,20,true);
        assertFalse(p1.puedeEsconder(alma1));
    }
    @Test
    public void pruebaPurgatorio(){
        AlmaSimple alma = new AlmaSimple(10,10,false);
        Infierno p1 = new Infierno();
        assertTrue(p1.puedeEsconder(alma));
        AlmaSimple alma1 = new AlmaSimple(9,4,true);
        assertFalse(p1.puedeEsconder(alma1));
    }
    @Test
    public void pruebaDemonioCazar(){
        Infierno p1 = new Infierno();
        AlmaSimple alma = new AlmaSimple(10,10,false);
        AlmaSimple alma1 = new AlmaSimple(0,20,false);
        p1.agregarAlmaAlLugar(alma);
        p1.agregarAlmaAlLugar(alma1);
        DemonioFuego demonio = new DemonioFuego(30);
        demonio.cazar(p1);
        assertEquals(demonio.almasCazadas.size(),1);
    }

}