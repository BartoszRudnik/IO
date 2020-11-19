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
        
        String tmp = new String();
        
        tmp += "Nazwa: " + getNazwa();
        tmp += " Data: " + getData();
        tmp += " GodzinaStart: " + getGodzinaStart();
        tmp += " CzasTrwania: " + getCzasTrwania();
        tmp += " ID: " + getId();        
        tmp += " LiczbaMiejsc: " + getLiczbaMiejsc();
        
        return tmp;
        
    }
    
}
