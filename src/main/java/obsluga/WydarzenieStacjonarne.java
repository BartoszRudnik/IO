package obsluga;

public class WydarzenieStacjonarne extends Wydarzenie {
    
    private int liczbaMiejsc;
    
    public int getLiczbaMiejsc(){
        return this.liczbaMiejsc;
    }
    
    public void setLiczbaMiejsc(int liczbaMiejsc){
        this.liczbaMiejsc = liczbaMiejsc;
    }
    
    public WydarzenieStacjonarne(String nazwa, String data, String godzinaStart, int czasTrwania, int id, int liczbaMiejsc){        
       
    }
    
    @Override
    public String toString(){
        return null;
    }
    
}
