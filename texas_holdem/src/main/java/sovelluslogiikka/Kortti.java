package sovelluslogiikka;

public class Kortti {

    private Maa maa;
    private Arvo arvo;

    public Kortti(Maa maa, Arvo arvo) {
        this.maa = maa;
        this.arvo = arvo;
    }
    
    public String getMaa(){
        return this.maa.getMaa();
    }
    
    public int getArvo(){
        return this.arvo.getArvo();
    }
    
    @Override
    public String toString(){
        return this.maa.getMaa() + " " + this.arvo.getArvonimi();
    }

}