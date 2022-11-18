public class Main {
    public static void main(String[] args) {
        Fahrzeug dasAndereFahrzeug = new Fahrzeug("Honda", "Civic", 2023, 3, 1999.00, "rot", 'D', true);
        Fahrzeug dieGuteAlteDampfplatte = new Fahrzeug("Volvo", "Dampfplatte", 2022, 10000, 599.99, "schwarz", 'A', true);
        System.out.println(dieGuteAlteDampfplatte.toString());
        System.out.println(dasAndereFahrzeug.toString());
    }
}