package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class Infierno extends LugaresNuevos {

    @Override
    public void agregarAlma(Alma a1) {
        if(almasEscondidas.size()<2 && (!a1.isFriolenta()) && a1.getBondad()==a1.getValor()){
            almasEscondidas.add(a1);a1.setFriolenta(false);}
    }
}
