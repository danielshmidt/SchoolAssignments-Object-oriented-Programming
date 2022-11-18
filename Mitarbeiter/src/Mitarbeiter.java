public class Mitarbeiter {
    private int personalnummer;
    private String name;
    private String vorname;
    private String geburtstag;
    private double monatsgehalt;

    public Mitarbeiter(int personalnummer, String name, String vorname, String geburtstag, double monatsgehalt){
        this.personalnummer = personalnummer;
        this.name = name;
        this.vorname = vorname;
        this.geburtstag = geburtstag;
        this.monatsgehalt = monatsgehalt;
    }

    public String toString(){
        return "Personalnummer: " + personalnummer + "\n" +
                "Name: " + name + "\n" +
                "Vorname: " + vorname + "\n" +
                "Geburtstag: " + geburtstag + "\n" +
                "Monatsgehalt: " + monatsgehalt + "\n";
    }
}
