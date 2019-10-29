package ar.edu.unahur.obj2;

import java.util.List;

public class Lugar {

    private List<Alma> almas;

    public Lugar(List<Alma> almas) {
        this.almas = almas;
    }

    public List<Alma> getAlmas() {
        return almas;
    }

    public void quitarAlma(Alma alma) {
        almas.remove(alma);
    }

}
