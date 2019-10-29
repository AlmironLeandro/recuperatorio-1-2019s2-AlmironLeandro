package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Paraiso extends Lugar {
    //    Tiene 10 lugares para esconderse
    //    Lugar muy seguro para las almas, si hay lugar y el alma tiene bondad > 0, puede esconderse
    //    Solo se la penaliza descontando 1 en su bondad

    @Override
    public boolean puedeEsconder(Alma a1) {
        return almasEscondidas.size()<10 && a1.getBondad()>0;
    }

    @Override
    public boolean esconderAlma(Alma a1){
        if(puedeEsconder(a1)){
            almasEscondidas.add(a1);
            a1.setBondad(a1.getBondad() - 1);
            return true;
        }
    else {
        System.out.println("No se puedo esconder al alma");
        return false;}
    }
}
