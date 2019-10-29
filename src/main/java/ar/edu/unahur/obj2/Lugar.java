package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Lugar {
    //Observacion: Podria haber creado una interfaz e implementarlas en los lugares nuevos(infierno,paraiso,purgatorio) para no hacer esta clase abstract.
    private List<Alma> almas;
    protected List<Alma> almasEscondidas = new ArrayList<Alma>();
    public void agregarAlmaAlLugar(Alma a1){almas.add(a1);}
    public Lugar(List<Alma> almas) {
        this.almas = almas;
    }

    public Lugar() {
        almas= new ArrayList<>();
    }

    public abstract boolean puedeEsconder(Alma a1);
    public abstract boolean esconderAlma(Alma a1);

    public List<Alma> getAlmas() {
        return almas;
    }

    public void quitarAlma(Alma alma) {
        almas.remove(alma);
    }

}
