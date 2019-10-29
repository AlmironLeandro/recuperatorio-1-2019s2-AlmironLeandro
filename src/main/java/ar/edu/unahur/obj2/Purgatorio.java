package ar.edu.unahur.obj2;

import java.util.List;

public class Purgatorio extends Lugar {
    public Purgatorio() {

    }
    //El enunciado estaba incompleto, por lo tanto interprete : Se la penaliza descontando 5 en su bondad y 1 en su "valor".
    @Override
    public boolean puedeEsconder(Alma a1) {
        return almasEscondidas.size()<5 && a1.getBondad()>10 && a1.getValor()>5;
    }
    //aca iba a poner un Throw con una  Exception pero me quede corto de tiempo.
    @Override
    public void esconderAlma(Alma a1){if(puedeEsconder(a1)){
        almasEscondidas.add(a1);a1.setBondad(a1.getBondad()-5);a1.setValor(a1.getValor()-1);}
    else {
        System.out.println("No se puedo esconder al alma");
    }
    }
}
