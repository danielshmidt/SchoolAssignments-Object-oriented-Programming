import java.util.ArrayList;

public class Werkstatt {
    private int id;
    private String name;
    private String standort;

    public Werkstatt(int id, String name, String standort){
        this.id = id;
        this.name = name;
        this.standort = standort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
}
