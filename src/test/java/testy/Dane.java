package testy;

import obsluga.Wydarzenie;
import obsluga.WydarzenieOnline;
import obsluga.WydarzenieStacjonarne;

public class Dane {

    private Wydarzenie [] wydarzenia = {new WydarzenieStacjonarne("kurs tanca", "20.07.2021", "15:30", 60, 1, 25),
                                        new WydarzenieOnline("szycie na maszynie", "24.03.2021", "17:45", 45, 2, "link.pl")};

    private String [][] daneWydarzen = new String [][] {{"Stacjonarne", "kurs tance", "20.07.2021", "15:30"}, {"Online", "szycie na maszynie", "24.03.2021", "17:45", "link.pl"},
                                                        {"Mieszane", "pilka recza", "29.05.2021", "15:30"}};

    public Wydarzenie[] getWydarzenia() {
        return wydarzenia;
    }

    public void setWydarzenia(Wydarzenie[] wydarzenia) {
        this.wydarzenia = wydarzenia;
    }

    public String[][] getDaneWydarzen() {
        return daneWydarzen;
    }

    public void setDaneWydarzen(String[][] daneWydarzen) {
        this.daneWydarzen = daneWydarzen;
    }

}
