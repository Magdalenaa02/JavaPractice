package pl.sda.wyscig;

public class WyscigSamochodow {

    private static void ustawWygranyPojazd (Samochod pojazd1, Samochod pojazd2) {
        if (pojazd1.sprawdzPrzegieb() > pojazd2.sprawdzPrzegieb()) {
            System.out.println("Wygralo auto: " + pojazd1.getMarka());
        } else if (pojazd2.sprawdzPrzegieb() > pojazd1.sprawdzPrzegieb()) {
            System.out.println("Wygralo auto: " + pojazd2.getMarka());
        } else {
            System.out.println("Remis");
        }
    }

    public static void main (String[] args) {
        Samochod bmw = new Samochod();
        bmw.setMarka("BMW");
        Samochod fiat = new Samochod();
        fiat.setMarka("Fiat");

        bmw.jedz();
        bmw.jedz();
        bmw.ustawPredkosc( 2.5);
        fiat.jedz();
        bmw.jedz();
        fiat.ustawPredkosc( 3.4);
        fiat.jedz();
        bmw.jedz();
        bmw.ustawPredkosc(1.8);
        fiat.ustawPredkosc(6.5);
        fiat.jedz();
        bmw.jedz();
        bmw.jedz();

        System.out.println("Przebieg BMW " + bmw.sprawdzPrzegieb());
        System.out.println("Przebieg Fiata " + fiat.sprawdzPrzegieb());

        ustawWygranyPojazd(bmw, fiat);

    }
}
