package obsluga;

public class DaneEpidemiologiczne {

    private String miejsce;
    private String strefa;
    private int liczbaZakazen;

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

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public DaneEpidemiologiczne(int idRegionu, int liczbaZakazen, String strefa){
        
    }

    public DaneEpidemiologiczne(){

    }

    @Override
    public String toString() {
        return "DaneEpidemiologiczne{" +
                "miejsce='" + miejsce + '\'' +
                ", liczbaZakazen=" + liczbaZakazen +
                ", strefa='" + strefa + '\'' +
                '}';
    }

}
