public class Buch extends Artikel {

    private int ISBN;
    private String Verlag;
    private int Seitenanzahl;

    public Buch(int ID_P, String Bezeichung_P, double Preis_P, int ISBN_P, String Verlag_P, int Seitenanzahl_P){
        super(ID_P, Bezeichung_P, Preis_P);
        ISBN = ISBN_P;
        Verlag = Verlag_P;
        Seitenanzahl = Seitenanzahl_P;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getSeitenanzahl() {
        return Seitenanzahl;
    }

    public String getVerlag() {
        return Verlag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        Seitenanzahl = seitenanzahl;
    }

    public void setVerlag(String verlag) {
        Verlag = verlag;
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
                "ISBN: " + ISBN +  "\n" +
                "Verlag: " + Verlag +"\n" +
                "Seitenanzahl: " + Seitenanzahl + "\n";
    }
}