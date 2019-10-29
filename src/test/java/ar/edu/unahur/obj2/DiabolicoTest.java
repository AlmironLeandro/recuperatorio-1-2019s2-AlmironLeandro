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
    public void PrimeraParte(){
        AlmaSimple alma = new AlmaSimple(10,20,true);
        Paraiso p1 = new Paraiso();
        assertTrue(p1.puedeEsconder(alma));
        AlmaSimple alma1 = new AlmaSimple(10,20,true);

    }
}