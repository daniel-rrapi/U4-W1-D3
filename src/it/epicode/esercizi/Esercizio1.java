package it.epicode.esercizi;

public class Esercizio1 {
    private int base1;
    private  int altezza1;
    private int base2;
    private  int altezza2;
    public Esercizio1 (int altezzaRettangolo1, int baseRettangolo1, int altezzaRettangolo2, int baseRettangolo2) {
        this.altezza1 = altezzaRettangolo1;
        this.base1 = baseRettangolo1;
        this.altezza2 = altezzaRettangolo2;
        this.base2 = baseRettangolo2;

    }
    public void stampaRettangolo() {
        System.out.println("Area: " + (base1 * altezza1) + " " + "Perimetro: " + ((altezza1 + base1) * 2));
    }

    public void stampaDueRettangoli() {
        System.out.println("Area rettangolo n.1: " + (base1 * altezza1) + " " + "Perimetro rettangolo n.1: " + ((altezza1 + base1) * 2));
        System.out.println("Area rettangolo n.2: " + (base2 * altezza2) + " " + "Perimetro rettangolo n.2: " + ((altezza2 + base2) * 2));
        System.out.println("Somma area dei due rettangoli: " + ((base1 * altezza1) + (base2 * altezza2)));
    }
}
