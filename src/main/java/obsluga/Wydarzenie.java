package obsluga;

public class Wydarzenie {
    
    protected String nazwa;
    protected String data;
    protected String godzinaStart;
    protected int czasTrwania;
    protected int id;
    
    public String getNazwa(){
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public String getGodzinaStart(){
        return this.godzinaStart;
    }
    
    public void setGodzinaStart(String godzinaStart){
        this.godzinaStart = godzinaStart;
    }
    
    public int getCzasTrwania(){
        return this.czasTrwania;
    }
    
    public void setCzasTrwania(int czasTrwania){
        this.czasTrwania = czasTrwania;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public Wydarzenie(){
        
    }
    
    @Override
    public String toString() {
      
        String tmp = new String();
        
        tmp += "Nazwa: " + getNazwa();
        tmp += " Data: " + getData();
        tmp += " GodzinaStart: " + getGodzinaStart();
        tmp += " CzasTrwania: " + getCzasTrwania();
        tmp += " ID: " + getId();        
        
        return tmp;
        
    }
    
}
