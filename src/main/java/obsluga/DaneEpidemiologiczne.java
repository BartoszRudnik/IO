package obsluga;

public class DaneEpidemiologiczne {

    private String miejsce;
    private String strefa;
    private int idStrefy;
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

    public int getIdStrefy() {
        return idStrefy;
    }

    public void setIdStrefy() {

        if (!this.strefa.isEmpty()){

            if(strefa.equalsIgnoreCase("Zielona"))
                this.idStrefy = 0;
            else if(strefa.equalsIgnoreCase("Zolta"))
                this.idStrefy = 1;
            else if(strefa.equalsIgnoreCase("Czerwona"))
                this.idStrefy = 2;

        }
        else
            this.idStrefy = -1;

    }

    public DaneEpidemiologiczne(int idRegionu, int liczbaZakazen, String strefa){
        
    }

    public DaneEpidemiologiczne(){

    }

    @Override
    public String toString() {
        return "DaneEpidemiologiczne{" +
                "miejsce='" + miejsce + '\'' +
                ", strefa='" + strefa + '\'' +
                ", idStrefy=" + idStrefy +
                ", liczbaZakazen=" + liczbaZakazen +
                '}';
    }

}
