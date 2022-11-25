public class Main {
    public static void main(String[] args) {
        Kunde Herbert = new Kunde("Herbert", 1);
        Herbert.getKundenID();
        Herbert.setKundenID(20);
        Herbert.getKundenID();

        Kunde Jonas = new Kunde("Jonas", 12);
        Jonas.getName();
        Jonas.setName("Yannick");
        Jonas.getName();

        Mitarbeiter Dimi = new Mitarbeiter("Dimi", 420);
        System.out.println(Dimi.getName());
        Dimi.setName("Dimitri");
        System.out.println(Dimi.getName());

        Mitarbeiter Wowa = new Mitarbeiter("Wowa", 1337);
        System.out.println(Wowa.getMitarbeiternummer());
        Wowa.setMitarbeiternummer(421);
        System.out.println(Wowa.getMitarbeiternummer());


        System.out.println(Herbert.toString());
        System.out.println(Jonas.toString());
        System.out.println(Dimi.toString());
        System.out.println(Wowa.toString());


    }
}