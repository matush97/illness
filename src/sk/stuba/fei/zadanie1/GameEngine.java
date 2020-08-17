package sk.stuba.fei.zadanie1;


import sk.stuba.fei.zadanie1.sir.Sir;

public class GameEngine {
    private Sir sir;

    public boolean checkGame(){
        if(sir.makeRo() > 1){
            //choroba sa nesiri
            //kodik
            return true;
        }else if (sir.makeRo() < 1){
            //vznika pandemia
            //kodik
            return false;
        }
        return false;
    }

}
