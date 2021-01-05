package testy;

import obsluga.Wydarzenie;
import obsluga.WydarzenieOnline;
import obsluga.WydarzenieStacjonarne;

public class Dane {

    private Wydarzenie[] wydarzeniaStacjonarne = {new WydarzenieStacjonarne("kurs tanca", "20.07.2021", "15:30", 60, 1, 25),
            new WydarzenieStacjonarne("szycie na maszynie", "24.03.2021", "17:45", 45, 2, 10),
            new WydarzenieStacjonarne("gotowanie", "30.07.2021", "12:15", 120, 3, 12)};

    private Wydarzenie[] wydarzeniaOnline = {new WydarzenieOnline("kurs tanca", "20.07.2021", "15:30", 60, 1, "taniec.pl"),
            new WydarzenieOnline("szycie na maszynie", "24.03.2021", "17:45", 45, 2, "szycieMaszyna.pl"),
            new WydarzenieOnline("gotowanie", "30.07.2021", "12:15", 120, 3, "gotowanie.pl")};

    private String[][] daneWydarzen = new String[][]{{"Stacjonarne", "kurs tance", "20.07.2021", "15:30"},
            {"Online", "szycie na maszynie", "24.03.2021", "17:45", "link.pl"},
            {"Stacjonarne", "gotowanie", "30.07.2021", "12:15"},
            {"Mieszane", "pilka recza", "29.05.2021", "15:30"}};

    private String [] daneWydarzenFabrykaStacjonarne = {"Stacjonarne", "Stacjonarne", "Stacjonarne", "Mieszane"};

    private String [] daneWydarzenFabrykaOnline = {"Online", "Online", "Online"};

    public String[] getDaneWydarzenFabrykaOnline() {
        return daneWydarzenFabrykaOnline;
    }

    public void setDaneWydarzenFabrykaOnline(String[] daneWydarzenFabrykaOnline) {
        this.daneWydarzenFabrykaOnline = daneWydarzenFabrykaOnline;
    }

    public String[] getDaneWydarzenFabrykaStacjonarne() {
        return daneWydarzenFabrykaStacjonarne;
    }

    public void setDaneWydarzenFabrykaStacjonarne(String[] daneWydarzenFabrykaStacjonarne) {
        this.daneWydarzenFabrykaStacjonarne = daneWydarzenFabrykaStacjonarne;
    }

    public Wydarzenie[] getWydarzeniaStacjonarne() {
        return wydarzeniaStacjonarne;
    }

    public void setWydarzeniaStacjonarne(Wydarzenie[] wydarzeniaStacjonarne) {
        this.wydarzeniaStacjonarne = wydarzeniaStacjonarne;
    }

    public String[][] getDaneWydarzen() {
        return daneWydarzen;
    }

    public void setDaneWydarzen(String[][] daneWydarzen) {
        this.daneWydarzen = daneWydarzen;
    }

    public Wydarzenie[] getWydarzeniaOnline() {
        return wydarzeniaOnline;
    }

    public void setWydarzeniaOnline(Wydarzenie[] wydarzeniaOnline) {
        this.wydarzeniaOnline = wydarzeniaOnline;
    }
}
