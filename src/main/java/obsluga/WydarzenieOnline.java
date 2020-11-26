package obsluga;

public class WydarzenieOnline extends Wydarzenie {
    
    private String linkDoWydarzenia;

    @Override
    public String getLinkDoWydarzenia(){
        return this.linkDoWydarzenia;
    }

    @Override
    public void setLinkDoWydarzenia(String linkDoWydarzenia){
        this.linkDoWydarzenia = linkDoWydarzenia;
    }
    
    public WydarzenieOnline(String nazwa, String data, String godzinaStart, int czasTrwania, int id, String linkDoWydarzenia){       
        
    }

    public WydarzenieOnline(){

    }

    @Override
    public String toString() {
        return "WydarzenieOnline{" +
                "linkDoWydarzenia='" + linkDoWydarzenia + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", godzinaStart='" + godzinaStart + '\'' +
                ", typWydarzenia='" + typWydarzenia + '\'' +
                ", czasTrwania=" + czasTrwania +
                ", id=" + id +
                ", liczbaRezerwacji=" + liczbaRezerwacji +
                '}';
    }


    @Override
    public int compareTo(Wydarzenie o) {
        return this.id - o.getId();
    }
}
