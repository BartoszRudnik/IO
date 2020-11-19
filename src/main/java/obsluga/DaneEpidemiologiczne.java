package obsluga;

public class DaneEpidemiologiczne {

    private int idRegionu;
    private int liczbaZakazen;
    private String strefa;
    
    public int getIdRegionu(){
        return this.idRegionu;
    }
    
    public void setIdRegionu(int idRegionu){
        this.idRegionu = idRegionu;
    }
    
    public int getLiczbaZakazen(){
        return this.liczbaZakazen;
    }
    
    public void setLiczbaZakazen(int liczbaZakazen){
        this.liczbaZakazen = liczbaZakazen;
    }
    
    public String getStrefa(){
        return this.strefa;
    }
    
    public void setStrefa(String strefa){
        this.strefa = strefa;
    }
    
    public DaneEpidemiologiczne(int idRegionu, int liczbaZakazen, String strefa){
        
    }
    
    @Override
    public String toString(){
       
        String tmp = new String();
        
        tmp += "idRegionu: " + getIdRegionu();
        tmp += " LiczbaZakazen: " + getLiczbaZakazen();
        tmp += " Strefa: " + getStrefa();
        
        return tmp;
        
    }
    
}
