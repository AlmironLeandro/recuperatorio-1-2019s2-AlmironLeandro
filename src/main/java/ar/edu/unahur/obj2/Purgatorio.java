package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Purgatorio extends LugaresNuevos  {
    //El enunciado estaba incompleto, por lo tanto interprete : Se la penaliza descontando 5 en su bondad y 1 en su "valor".
    @Override
    public void agregarAlma(Alma a1){if(almasEscondidas.size()<5 && a1.getBondad()>10 && a1.getValor()>5){
        almasEscondidas.add(a1);a1.setBondad(a1.getBondad()-5);a1.setValor(a1.getValor()-1);}}
}
