package obsluga;

public class Rezerwacja {

    private int idRezerwacji;
    private Wydarzenie wydarzenie;
    
    public int getIdRezerwacji(){
        return this.idRezerwacji;
    }
    
    public void setIdRezerwacji(int idRezerwacji){
        this.idRezerwacji = idRezerwacji;
    }
    
    public Wydarzenie getWydarzenie(){
        return this.wydarzenie;
    }
    
    public void setWydarzenie(Wydarzenie wydarzenie){
        this.wydarzenie = wydarzenie;
    }
    
    public Rezerwacja(int idRezerwacji, Wydarzenie wydarzenie){
               
    }
    
    @Override
    public String toString(){
        
        String tmp = new String();
        
        tmp += "idRezerwacji: " + getIdRezerwacji();
        tmp += " Wydarzenie: " + getWydarzenie();
        
        return tmp;
        
    }
    
}
