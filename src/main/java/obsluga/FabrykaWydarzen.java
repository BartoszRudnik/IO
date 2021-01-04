package obsluga;

public class FabrykaWydarzen implements Fabryka {

    public Wydarzenie noweWydarzenie(String typWydarzenia) {

        if (typWydarzenia.equalsIgnoreCase("Stacjonarne")) {

            return new WydarzenieStacjonarne();

        } else if (typWydarzenia.equalsIgnoreCase("Online")) {

            return new WydarzenieOnline();

        } else
            throw new IllegalArgumentException("Wydarzenie musi byc Stacjonarne albo Online");

    }

}
