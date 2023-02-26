import java.util.ArrayList;

public class Fahrzeug {
    private ArrayList<Werkstatt> werkstatt;

    private int id;
    private String hersteller;
    private String typ;

    public Fahrzeug(int id, String hersteller, String typ, ArrayList<Werkstatt> werkstatt) {
        this.id = id;
        this.hersteller = hersteller;
        this.typ = typ;
        this.werkstatt = werkstatt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

}
