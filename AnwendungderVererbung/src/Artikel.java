public abstract class Artikel {
    private int ID;
    private String Beschreibung;
    private double Preis;

    public Artikel(int ID_P, String Beschreibung_P, double Preis_P) {
        ID = ID_P;
        Beschreibung = Beschreibung_P;
        Preis = Preis_P;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public String getDetails(){
        return  "ID: " + ID + "\n" +
                "Beschreibung: " + Beschreibung + "\n" +
                "Preis: " + Preis+ "\n";
    }
}
