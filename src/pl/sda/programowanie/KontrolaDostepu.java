package pl.sda.programowanie;

import java.util.Scanner;

public class KontrolaDostepu {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok urodzenia");
        int biezacyRok = 2020;
        int biezacyMiesiac = 1;
        int rokUrodzenia = scanner.nextInt();

        if (biezacyRok-rokUrodzenia > 18) {
            System.out.println("Hello!");
        } else {
           if (biezacyRok-rokUrodzenia == 18) {
               System.out.println("Podaj miesiac w formacie 1-12");
               int miesiacUrodzenia = scanner.nextInt();
               if (biezacyMiesiac >= miesiacUrodzenia) {
                   System.out.println("Hello werfikacja miesiaca poprawna");
               } else {
                   System.out.println("Brak dostepu na podstawie weryfikacji miesiaca");
               }
           } else {
               System.out.println("Brak dostepu");
           }
        }
    }
}
