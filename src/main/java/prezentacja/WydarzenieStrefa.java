package prezentacja;

import java.util.Objects;

public class WydarzenieStrefa extends WydarzenieEpidemia{

    private String strefa;
    private int idStrefy;

    public String getStrefa() {
        return strefa;
    }

    public void setStrefa(String strefa) {
        this.strefa = strefa;
    }

    @Override
    public int getIdStrefy() {
        return idStrefy;
    }

    public void setIdStrefy(int idStrefy) {
        this.idStrefy = idStrefy;
    }

    @Override
    public String toString() {
        return "WydarzenieStrefa{" +
                "wydarzenie=" + wydarzenie +
                ", strefa='" + strefa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WydarzenieStrefa)) return false;
        WydarzenieStrefa that = (WydarzenieStrefa) o;
        return getIdStrefy() == that.getIdStrefy();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdStrefy());
    }

    @Override
    public int compareTo(WydarzenieEpidemia o) {

        if(this.idStrefy - o.getIdStrefy() == 0)
            return this.wydarzenie.getId() - o.getWydarzenie().getId();
        else
            return this.idStrefy - o.getIdStrefy();

    }

}
