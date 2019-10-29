package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Paraiso extends LugaresNuevos {
    //    Tiene 10 lugares para esconderse
    //    Lugar muy seguro para las almas, si hay lugar y el alma tiene bondad > 0, puede esconderse
    //    Solo se la penaliza descontando 1 en su bondad
    public void agregarAlma(Alma a1){if(almasEscondidas.size()<10 && a1.getBondad()>0){ almasEscondidas.add(a1); a1.setBondad(a1.getBondad()-1);}}
}
