package ar.edu.unahur.obj2;

public abstract class ObtieneArma {
    Demonio d1;

    public ObtieneArma(Demonio d1) {
        this.d1 = d1;
    }

    public abstract int poder();
}
