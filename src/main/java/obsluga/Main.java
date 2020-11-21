package obsluga;

public class Main {

    public static void main(String [] args){

        Fabryka fabryka = new FabrykaWydarzen();

        Wydarzenie wydarzenie;
        Wydarzenie wydarzenie2;

        wydarzenie = fabryka.noweWydarzenie("Online");
        wydarzenie2 = fabryka.noweWydarzenie("Stacjonarne");

        wydarzenie.setLinkDoWydarzenia("wydarzenieOnline");
        wydarzenie2.setNazwa("bleble");
        wydarzenie2.setLiczbaMiejsc(50);

        System.out.println(wydarzenie);
        System.out.println(wydarzenie2);

    }

}
