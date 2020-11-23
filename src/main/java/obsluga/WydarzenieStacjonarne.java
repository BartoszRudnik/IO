package obsluga;

import java.util.Objects;

public class WydarzenieStacjonarne extends Wydarzenie {
    
    private int liczbaMiejsc;

    @Override
    public int getLiczbaMiejsc(){
        return this.liczbaMiejsc;
    }

    @Override
    public void setLiczbaMiejsc(int liczbaMiejsc){
        this.liczbaMiejsc = liczbaMiejsc;
    }
    
    public WydarzenieStacjonarne(String nazwa, String data, String godzinaStart, int czasTrwania, int id, int liczbaMiejsc){        
       
    }

    public WydarzenieStacjonarne(){

    }

    @Override
    public String toString() {
        return "WydarzenieStacjonarne{" +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", godzinaStart='" + godzinaStart + '\'' +
                ", typWydarzenia='" + typWydarzenia + '\'' +
                ", czasTrwania=" + czasTrwania +
                ", id=" + id +
                '}';
    }



}
