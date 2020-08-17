package sk.stuba.fei.zadanie1.sir;

import sk.stuba.fei.zadanie1.Population;
import sk.stuba.fei.zadanie1.disease.Disease;

public abstract class Sir {
    // TODO Podľa jednoduchého modelu SIR existujú tri skupiny ľudí
    protected float susceprible; //vnimavy
    protected float infectious; //infekcny
    protected float recovered; //vylieceny

    protected Disease disease;
    protected Population population;

    protected abstract float changeInfectious();
    protected abstract float changeRecovered();

    public final float makeRo() {
        return  (changeInfectious() / changeRecovered());
    }


}
