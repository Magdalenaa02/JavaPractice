package pl.sda.biblioteka;

public class Ksiazka {
    private String tytul = "brak tutulu";
    private String autor = "brak autora";
    private int rokWydania;

    public void setTytul (String nowyTytul) {
        tytul = nowyTytul;
    }

    public String getTytul() {
        return tytul;
    }

    public void setAutor (String nowyAutor) {
        if (nowyAutor.length() > 5) {
            autor = nowyAutor;
        } else {
            System.out.println("Nazwa autora" + nowyAutor + "za krótka, podaj wartosc dluzsza niz 5 znakow");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setRokWydania (int nowyRokWydania) {
        rokWydania = nowyRokWydania;
    }
    public int getRokWydania() {
        return rokWydania;
    }
}
