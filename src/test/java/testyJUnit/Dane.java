package testyJUnit;

import obsluga.Wydarzenie;
import obsluga.WydarzenieOnline;
import obsluga.WydarzenieStacjonarne;

public class Dane {

    private final Wydarzenie[] wydarzeniaStacjonarne = {new WydarzenieStacjonarne("Wroclaw","kurs tanca", "20.07.2021", "15:30", 60, 1, 25),
            new WydarzenieStacjonarne("Warszawa","szycie na maszynie", "24.03.2021", "17:45", 45, 2, 10),
            new WydarzenieStacjonarne("Szczecin","gotowanie", "30.07.2021", "12:15", 120, 3, 12)};

    private final String [] daneWydarzenFabrykaStacjonarne = {"Stacjonarne", "Stacjonarne", "Stacjonarne", "Mieszane"};

    private final String [] daneWydarzenFabrykaOnline = {"Online", "Online", "Online"};

    private final Wydarzenie[] wydarzeniaOnline = {new WydarzenieOnline("kurs tanca", "20.07.2021", "15:30", 60, 1, "taniec.pl"),
            new WydarzenieOnline("szycie na maszynie", "24.03.2021", "17:45", 45, 2, "szycieMaszyna.pl"),
            new WydarzenieOnline("gotowanie", "30.07.2021", "12:15", 120, 3, "gotowanie.pl")};

    private final String[][] daneWydarzenString = new String[][]{{"Stacjonarne", "kurs tanca", "20.07.2021", "15:30", " ", "Wroclaw"},
            {"Stacjonarne", "szycie na maszynie", "24.03.2021", "17:45", " ", "Warszawa"},
            {"Stacjonarne", "gotowanie", "30.07.2021", "12:15", " ", "Szczecin"}};

    private final String[][] daneWydarzenOnlineString = new String[][]{{"Online", "kurs tanca", "20.07.2021", "15:30", " ", "Wroclaw"},
            {"Online", "szycie na maszynie", "24.03.2021", "17:45", " ", "Warszawa"},
            {"Online", "gotowanie", "30.07.2021", "12:15", " ", "Szczecin"}};

    private final int [][] daneWydarzenInt = new  int[][]{{60, 1, 25}, {45, 2, 10}, {120, 3, 12}};

    private final Wydarzenie[] wyszukajWydarzenieTrue = {new WydarzenieStacjonarne("Szcecin", "gotowanie", "30.07.2021", "12:15", 120, 3, 12),
            new WydarzenieOnline("Joga", "30.07.2021", "12:15", 120, 4, "joga.pl")};

    private final Wydarzenie[] wyszukajWydarzenieFalse = {new WydarzenieStacjonarne("Olsztyn","koszykowka", "30.07.2021", "12:15", 120, 5, 12)};

    private final Wydarzenie[] wszystkieWydarzenia = {new WydarzenieStacjonarne("Wroclaw","kurs tanca", "20.07.2021", "15:30", 60, 1, 25),
            new WydarzenieStacjonarne("Warszawa", "szycie na maszynie", "24.03.2021", "17:45", 45, 2, 10),
            new WydarzenieStacjonarne("Szcecin","gotowanie", "30.07.2021", "12:15", 120, 3, 12),
            new WydarzenieOnline("kurs tanca", "20.07.2021", "15:30", 60, 1, "taniec.pl"),
            new WydarzenieOnline("szycie na maszynie", "24.03.2021", "17:45", 45, 2, "szycieMaszyna.pl"),
            new WydarzenieOnline("Joga", "30.07.2021", "12:15", 120, 4, "joga.pl")};

    private final int [] nowaLiczbaMiejsc = {34, 80, 45};

    public String[] getDaneWydarzenFabrykaOnline() {
        return daneWydarzenFabrykaOnline;
    }

    public Wydarzenie[] getWyszukajWydarzenieTrue() {
        return wyszukajWydarzenieTrue;
    }

    public String[] getDaneWydarzenFabrykaStacjonarne() {
        return daneWydarzenFabrykaStacjonarne;
    }

    public Wydarzenie[] getWydarzeniaStacjonarne() {
        return wydarzeniaStacjonarne;
    }

    public String[][] getDaneWydarzenString() {
        return daneWydarzenString;
    }

    public Wydarzenie[] getWydarzeniaOnline() {
        return wydarzeniaOnline;
    }

    public Wydarzenie[] getWszystkieWydarzenia() {
        return wszystkieWydarzenia;
    }

    public Wydarzenie[] getWyszukajWydarzenieFalse() {
        return wyszukajWydarzenieFalse;
    }

    public int[][] getDaneWydarzenInt() {
        return daneWydarzenInt;
    }

    public String[][] getDaneWydarzenOnlineString() {
        return daneWydarzenOnlineString;
    }

    public int[] getNowaLiczbaMiejsc() {
        return nowaLiczbaMiejsc;
    }
}
