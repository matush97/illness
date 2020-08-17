package sk.stuba.fei.zadanie1.disease;

import sk.stuba.fei.zadanie1.sir.Sir;

public   abstract class Disease {
    private float beta; //miera prenosu medzi S a I skupinou (β)
    private float gama; //miera prenosu medzi I a R skupinou (γ)

    public Disease(){}

    public Disease(float beta, float gama) {
        setBeta(beta);
        setGama(gama);
    }

    public float getBeta() { return beta; }
    public void setBeta(float beta) {
        if(beta < 0 ){
            throw new IllegalArgumentException("zla beta");
        }
        this.beta = beta;
    }

    public float getGama() { return gama; }
    public void setGama(float gama) {
        if(gama < 0 ){
            throw new IllegalArgumentException("zla gama");
        }
        this.gama = gama;
    }
}