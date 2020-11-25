package obsluga;

import java.util.Objects;

public abstract class Wydarzenie {
    
    protected String nazwa;
    protected String data;
    protected String godzinaStart;
    protected String typWydarzenia;
    protected int czasTrwania;
    protected int id;
    protected int liczbaRezerwacji = 0;
    
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

    public String getTypWydarzenia(){
        return this.typWydarzenia;
    }

    public void setTypWydarzenia(String typWydarzenia){
        this.typWydarzenia = typWydarzenia;
    }

    public void setLinkDoWydarzenia(String nowyLink){

    }

    public String getLinkDoWydarzenia(){
        return null;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc){

    }

    public int getLiczbaMiejsc(){
        return 0;
    }

    public void setMiejsce(String miejsce){

    }

    public String getMiejsce(){
        return null;
    }

    public int getLiczbaRezerwacji() {
        return liczbaRezerwacji;
    }

    public void setLiczbaRezerwacji(int liczbaRezerwacji) {
        this.liczbaRezerwacji = liczbaRezerwacji;
    }

    public Wydarzenie(){
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wydarzenie)) return false;
        Wydarzenie that = (Wydarzenie) o;
        return getCzasTrwania() == that.getCzasTrwania() &&
                getId() == that.getId() &&
                Objects.equals(getNazwa(), that.getNazwa()) &&
                Objects.equals(getData(), that.getData()) &&
                Objects.equals(getGodzinaStart(), that.getGodzinaStart()) &&
                Objects.equals(getTypWydarzenia(), that.getTypWydarzenia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNazwa(), getData(), getGodzinaStart(), getTypWydarzenia(), getCzasTrwania(), getId());
    }
}
