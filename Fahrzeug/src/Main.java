public class Main {
    public static void main(String[] args) {
        Fahrzeug dasAndereFahrzeug = new Fahrzeug("Honda", "Civic", 2023, 3, 1999.00, "rot", 'D', true);
        Fahrzeug Panda = new Fahrzeug("Toyota", "AE86", 1986, 1000, 299.99, "schwarz-weiß", 'D', false);
        Fahrzeug dieGuteAlteDampfplatte = new Fahrzeug("Volvo", "Dampfplatte", 2022, 10000, 599.99, "schwarz", 'A', true);
        // System.out.println(dieGuteAlteDampfplatte.toString());


        /*
        dasAndereFahrzeug.setHersteller("Toyota");
        dasAndereFahrzeug.setModell("AE86");
        dasAndereFahrzeug.setBaujahr(1986);
        */

        //System.out.println(dasAndereFahrzeug.toString());
        //System.out.println(Panda.toString());
        //System.out.println(dieGuteAlteDampfplatte.toString());

        String[] eh = {"amog", "os", "sos"};
        String[] ah = {"amog", "so", "sus"};
        System.out.println(Test.max3(2, 5, 12));
        System.out.println(Test.majority(true, false, true));
        System.out.println(Test.textFilter(eh,ah));

    }
}