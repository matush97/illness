package sk.stuba.fei.zadanie1;

import java.util.Random;

public class Population {
    private MenuUsers menu;
    private  int population = menu.pushKeyPopulation(); //
    public Population() {
        setPopulation(population);
    }



    public int firstInfectid(int population){
       // Random rand = new Random();
       // float number =  rand.nextFloat() * (max - min) + min;
        //Spravit kod na zistenie prvych nakazenych
        return (int) (population - (population * 0.9));
    }



    public int firstS(int population){ //first  susceprible
        //Spravit kod na zistenie tych ktori su OK
        return population - firstInfectid(population);
    }


    public  int getPopulation() { return population; }

    public void setPopulation(int population) {
        this.population = population;
    }
}
