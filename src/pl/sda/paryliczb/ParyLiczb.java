package pl.sda.paryliczb;
public class ParyLiczb {
    int iloscDopasowan = 0;
    int[][] znaleznioneParyLiczb = new int[201][2];

    public void drukujParyLiczbPetlaFor() {
        int[] tablicaLiczb = new int[201];
        for (int i = 0; i < 201; i++) {
            tablicaLiczb[i] = i - 100;
        }
        for (int i = 0; i < tablicaLiczb.length; i++) {
            for (int j = 0; j < tablicaLiczb.length; j++) {
                if (tablicaLiczb[i] + tablicaLiczb[j] == 4) {
                    sprawdzDuplikaty(tablicaLiczb[i], tablicaLiczb[j]);
                }
            }
        }
    }

    private void sprawdzDuplikaty(int liczba1, int liczba2) {
        for (int i = 0; i < iloscDopasowan; i++) {
            if ((znaleznioneParyLiczb[i][0] == liczba1 && znaleznioneParyLiczb[i][1] == liczba2)
                    ||
                    (znaleznioneParyLiczb[i][0] == liczba2 && znaleznioneParyLiczb[i][1] == liczba1)
            ) {
                return;

            }
        }

        znaleznioneParyLiczb[iloscDopasowan][0] = liczba1;
        znaleznioneParyLiczb[iloscDopasowan][1] = liczba2;
        iloscDopasowan++;
        System.out.println(liczba1 + ", " + liczba2 + " ilosc dopasowan: " + iloscDopasowan);
        System.out.println();
    }
}