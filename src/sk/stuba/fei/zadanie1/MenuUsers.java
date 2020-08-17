package sk.stuba.fei.zadanie1;

import sk.stuba.fei.zadanie1.disease.Disease;
import sk.stuba.fei.zadanie1.disease.Flu;
import sk.stuba.fei.zadanie1.disease.Measles;
import sk.stuba.fei.zadanie1.disease.Plague;

import java.util.Scanner;

public class MenuUsers {

    public int pushKeyPopulation(){
        Scanner fromKey = new Scanner(System.in);
        System.out.println("Choose the size of the population ");
        int population = (int) fromKey.nextInt();
        return population;
    }

    //Toto vybranie choroby by trebaloa si spravit nejako cez Button
    public void pushKeyDisease(){
        System.out.println("Choose disease for game ");
        System.out.println("Number 1. Flu");
        System.out.println("Number 2. Measles");
        System.out.println("Number 3. Plague");
        Scanner fromKey = new Scanner(System.in);
        int diseaseKey = (int) fromKey.nextInt();
        chooseDisease(diseaseKey);
    }
    public Disease chooseDisease(int diseaseKey){
        switch (diseaseKey) {
            case 1:
                System.out.println("You choose Flu");
                return new Flu();
            case 2:
                System.out.println("You choose Measles");
                return new Measles();
            case 3:
                System.out.println("You choose Plague");
                return new Plague();
            default:
                System.out.println("You choose nothnig");
        }
        return null;
    }

    public void wantVaccination(){
        System.out.println("Do you want vaccination?");
        System.out.println("Press Y or N");
        Scanner fromKey = new Scanner(System.in);
        String want = (String) fromKey.nextLine();

        switch (want){
            case "Y":
                System.out.println("you choose vaccination");
                break;
            default:
                System.out.println("You choose nothnig");
        }
    }

}
