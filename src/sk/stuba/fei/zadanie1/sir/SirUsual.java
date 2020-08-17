package sk.stuba.fei.zadanie1.sir;

public class SirUsual  extends Sir{


    protected float changeInfectious(){
        infectious =   (susceprible *  disease.getBeta());
        //TODO

        return  infectious;
    }
    protected  float changeRecovered(){
        //TODO
        recovered =  (infectious* disease.getGama());
        return recovered;
    }

}
