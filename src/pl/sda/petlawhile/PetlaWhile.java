package pl.sda.petlawhile;

public class PetlaWhile {
    public static void main (String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i += 2; // dokladnie to samo co: 1 = 1 + 2;
        }

        int j = 10;

        do {
            System.out.println("Wartosc zmiennej w petli do-while: " + j);
            j++;
        } while (j < 10);
    }
}
