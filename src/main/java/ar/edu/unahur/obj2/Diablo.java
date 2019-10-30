package ar.edu.unahur.obj2;

import java.util.List;

public class Diablo {

    private List<Demonio> demonios;

    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
    }
    public boolean iscontento(){return true;}
    public void enviarACazar(Demonio demonio, Lugar lugar) {
        demonio.cazar(lugar);
    }
    public void premioParaGanador(Demonio d1){
        if(iscontento()){
            d1.setMaldad(d1.getMaldad()+10);
        }
        else {
            d1.setMaldad(d1.getMaldad()+1);
        }
    }
    public void premioParaPerdedor(Demonio d1){
        if(iscontento()){
            d1.almasCazadas.remove(2);
        }
        else {
            d1.almasCazadas.clear();
        }
    }
    public void batalla(Demonio d1, Demonio d2){
        if(d1.getPoder()> d2.getPoder()) {
            System.out.println("el ganador es:"+ d1);
            premioParaGanador(d1);
            premioParaPerdedor(d2);
        }

        if(d1.getPoder()==d2.getPoder()){
            System.out.println("Hay empate");
        }
        else {
            System.out.println("el ganador es:" + d2);
            premioParaGanador(d2);
            premioParaPerdedor(d1);
            }
    }
}

