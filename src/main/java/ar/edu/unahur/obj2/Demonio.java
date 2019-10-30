package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private int maldad;
    private ObtieneArma a1;

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public void elegirArma(ObtieneArma a1) {
        this.a1 = a1;
    }
    public int getPoder() {
        return a1.poder() * maldad * almasCazadas.size();
    }

    public List<Alma> almasCazadas = new ArrayList<>();

    public Demonio(int maldad) {
        this.maldad = maldad;
    }

    public void cazar(Lugar lugar) {
        // para evitar el error de concurrent modification
        List<Alma> copiaDeAlmas = new ArrayList<>(lugar.getAlmas());
        copiaDeAlmas.stream().forEach(alma -> cazarOAtormentar(lugar, alma));
    }

    protected void cazarOAtormentar(Lugar lugar, Alma alma) {
        int almasAtormentadas=0;
        int almasCazadas=0;
    //Condicion Para poder cazarlo
        if (alma.getValor() <this.maldad && puedoCazarlo(alma) && !(lugar.esconderAlma(alma))) {
            almasCazadas++;
            cazar(lugar, alma);
        } else {
            almasAtormentadas++;
            atormentarAlma(alma);
        }
        incrementarNivelMaldad(almasCazadas, almasAtormentadas);
    }

    private void incrementarNivelMaldad(int almasCazadas, int almasAtormentadas) {
        maldad+=almasAtormentadas + 2*almasCazadas;
    }

    protected void cazar(Lugar lugar, Alma alma) {
        lugar.quitarAlma(alma);
        almasCazadas.add(alma);
    }
    protected void atormentarAlma(Alma alma) {
        alma.setValor(alma.getValor()-5);
        atormentar(alma);
    }

    protected abstract void atormentar(Alma a);
    protected abstract boolean puedoCazarlo(Alma a);

}
