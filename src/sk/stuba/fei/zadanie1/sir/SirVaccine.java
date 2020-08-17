package sk.stuba.fei.zadanie1.sir;

public class SirVaccine extends Sir {
    private float vaccinePeaople; //moje

//    public SirVaccine(float beta, float gama, float vaccinePeaople) {
//        super(beta, gama);
//        setVaccinePeaople(vaccinePeaople);
//    }


    @Override
    protected float changeInfectious() {
        //TODO
        return 0;
    }

    @Override
    protected float changeRecovered() {
        //TODO
         return 0;
    }

    public float getVaccinePeaople() { return vaccinePeaople; }
    public void setVaccinePeaople(float vaccinePeaople) {
        this.vaccinePeaople = vaccinePeaople;
    }
}
