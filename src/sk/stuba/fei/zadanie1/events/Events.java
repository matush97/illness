package sk.stuba.fei.zadanie1.events;

public  class Events {
    //TODO pre classy Deaths,speed a InfecionNewPoeple som nevedel
    // ake atributy a metody dat zatial si to nechavam tak volne
    private boolean quarantine;
    private boolean socialDistancing;

    protected boolean events(boolean quarantine) {
        if (quarantine){
            return true;
        }
        if (socialDistancing){
            return true;
        }
        return false;
    }
    public Events(boolean quarantine,boolean socialDistancing)
    {
        setQuarantine(quarantine);
        setSocialDistancing(socialDistancing);
    }

    public boolean isSocialDistancing() {
        return socialDistancing;
    }

    public void setSocialDistancing(boolean socialDistancing) {
        this.socialDistancing = socialDistancing;
    }

    public boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

}
