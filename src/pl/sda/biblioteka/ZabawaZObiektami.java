package pl.sda.biblioteka;

public class ZabawaZObiektami {
    public static void main (String[] args) {
        Ksiazka mojaPierwszaKsiazka = new Ksiazka();
        Ksiazka mojaDrugaKsiazka = new Ksiazka();
        Ksiazka mojaTrzeciaKsiazka = new Ksiazka();
        Ksiazka mojaCzwartaKsiazka = new Ksiazka();

        mojaPierwszaKsiazka.setTytul("Pan Tadeusz");
        mojaDrugaKsiazka.setTytul("Ballady i Romanse");
        mojaTrzeciaKsiazka.setTytul("Dziady");
        mojaPierwszaKsiazka.setTytul("W pustyni i w puszczy");

        mojaPierwszaKsiazka.setRokWydania(2010);
        mojaTrzeciaKsiazka.setAutor("Adam Mickiewicz");

        System.out.println(mojaPierwszaKsiazka.getTytul());
        System.out.println(mojaDrugaKsiazka.getTytul());
        System.out.println(mojaTrzeciaKsiazka.getTytul());
        System.out.println(mojaCzwartaKsiazka.getTytul());

        System.out.println(mojaPierwszaKsiazka.getAutor());
        System.out.println(mojaDrugaKsiazka.getAutor());
        System.out.println(mojaTrzeciaKsiazka.getAutor());
        System.out.println(mojaCzwartaKsiazka.getAutor());

        System.out.println(mojaPierwszaKsiazka.getRokWydania());
        System.out.println(mojaDrugaKsiazka.getRokWydania());
        System.out.println(mojaTrzeciaKsiazka.getRokWydania());
        System.out.println(mojaCzwartaKsiazka.getRokWydania());

    }
}
