package ar.edu.unahur.obj2;

import java.util.List;

public class Infierno extends Lugar {

    public Infierno() {

    }

    @Override
    public boolean puedeEsconder(Alma a1) {
        return almasEscondidas.size()<2 && (!a1.isFriolenta()) && a1.getBondad()==a1.getValor();
    }
    //aca iba a poner un Throw con una  Exception pero me quede corto de tiempo.
    @Override
    public void esconderAlma(Alma a1) {
        if(puedeEsconder(a1)){
            almasEscondidas.add(a1);a1.setFriolenta(false);}
        else {
            System.out.println("No se puedo esconder al alma");
        }
    }
}
