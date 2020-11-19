package obsluga;

public class WydarzenieOnline extends Wydarzenie {
    
    private String linkDoWydarzenia;
    
    public String getLinkDoWydarzenia(){
        return this.linkDoWydarzenia;
    }
    
    public void setLinkDoWydarzenia(String linkDoWydarzenia){
        this.linkDoWydarzenia = linkDoWydarzenia;
    }
    
    public WydarzenieOnline(String nazwa, String data, String godzinaStart, int czasTrwania, int id, String linkDoWydarzenia){       
        
    }
    
    @Override
    public String toString(){
        return null;
    }
    
}
