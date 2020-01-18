package pl.sda.wyscig;

public class Samochod {
    private String marka;
    private double przebieg;
    private String model;
    private double mnoznikPredkosci = 1.0;

    public void ustawPredkosc(double mnoznikPredkosci) {
        this.mnoznikPredkosci = mnoznikPredkosci;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka () {
        return marka;
    }

    public void setMarka (String nowaMarka) {
        marka = nowaMarka;
    }

    public void jedz() {
        przebieg = przebieg + (1 * mnoznikPredkosci);
    }

    public void stoj() {
        System.out.println(marka + "zaparkowane");
    }

    public double sprawdzPrzegieb() {
        return przebieg;
    }
}
