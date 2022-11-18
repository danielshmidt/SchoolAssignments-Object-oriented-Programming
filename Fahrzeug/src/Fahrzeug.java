public class Fahrzeug {
    private String hersteller;
    private String modell;
    private int baujahr;
    private int kmstand;
    private double verkaufspreis;

    private String farbe;
    private char antriebsart;
    private boolean mitHaendlergarantie;

    public Fahrzeug(String hersteller, String modell, int baujahr, int kmstand, double verkaufspreis, String farbe, char antriebsart, boolean mitHaendlergarantie){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmstand = kmstand;
        this.verkaufspreis = verkaufspreis;
        this.farbe = farbe;
        this.antriebsart = antriebsart;
        this.mitHaendlergarantie = mitHaendlergarantie;
    }
    public String toString(){
        return "Hersteller: " + hersteller + "\n" +
                "Modell: " + modell + "\n" +
                "Baujahr: " + baujahr + "\n" +
                "KM-Stand: " + kmstand + "\n" +
                "Verkaufspreis: " + verkaufspreis + "\n" +
                "Farbe: " + farbe + "\n" +
                "Antriebsart: " + antriebsart + "\n" +
                "mit Händelergarantie? " + mitHaendlergarantie + "\n";
    }
}
