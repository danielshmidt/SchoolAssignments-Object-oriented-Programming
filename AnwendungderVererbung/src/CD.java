public class CD extends Artikel {

    private String Label;
    private String Genre;
    private double Spieldauer;

    public CD(int ID_P, String Beschreibung_P, double Preis_P, String Label_P, String Genre_P, double Spieldauer_P){
        super(ID_P, Beschreibung_P, Preis_P);
        Label = Label_P;
        Genre = Genre_P;
        Spieldauer = Spieldauer_P;
    }

    public double getSpieldauer() {
        return Spieldauer;
    }

    public String getGenre() {
        return Genre;
    }

    public String getLabel() {
        return Label;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public void setSpieldauer(double spieldauer){
        Spieldauer = spieldauer;
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
                "Label: " + Label + "\n" +
                "Genre: " + Genre +"\n" +
                "Spieldauer: " + Spieldauer + "\n";
    }
}
