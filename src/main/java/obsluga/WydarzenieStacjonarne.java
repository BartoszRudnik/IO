package obsluga;

import java.util.Objects;

public class WydarzenieStacjonarne extends Wydarzenie {
    
    private int liczbaMiejsc;
    private String miejsce;

    @Override
    public int getLiczbaMiejsc(){
        return this.liczbaMiejsc;
    }

    @Override
    public void setLiczbaMiejsc(int liczbaMiejsc){
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Override
    public String getMiejsce(){
        return this.miejsce;
    }

    @Override
    public void setMiejsce(String miejsce){
        this.miejsce = miejsce;
    }

    public WydarzenieStacjonarne(String nazwa, String data, String godzinaStart, int czasTrwania, int id, int liczbaMiejsc){        
       
    }

    public WydarzenieStacjonarne(){

    }

    @Override
    public String toString() {
        return "WydarzenieStacjonarne{" +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", miejsce='" + miejsce + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", godzinaStart='" + godzinaStart + '\'' +
                ", typWydarzenia='" + typWydarzenia + '\'' +
                ", czasTrwania=" + czasTrwania +
                ", id=" + id +
                ", liczbaRezerwacji=" + liczbaRezerwacji +
                '}';
    }

}
