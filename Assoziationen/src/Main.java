import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Werkstatt FlockesWerkstatt = new Werkstatt(1, "Floeckchens Werkstatt", "Solingen");
        Werkstatt SolingerWerkstatt = new Werkstatt(2, "HauptWerkstatt Solingen", "Solingen");

        ArrayList<Werkstatt> WerkstaetteInSolingen = new ArrayList<>();
        WerkstaetteInSolingen.add(FlockesWerkstatt);
        WerkstaetteInSolingen.add(SolingerWerkstatt);

        Fahrzeug Volvo = new Fahrzeug(1, "Volvo", "T17", WerkstaetteInSolingen);
    }
}