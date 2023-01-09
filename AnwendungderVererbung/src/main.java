
public class main {
    public static void main(String[] args) {
      //  Buch Buch1 = new Buch(1, "Berserk", 19.99, 1337, "TokyoPop", 300);
      //  CD CD1 = new CD(2, "Yes", 15.99, "Rhino Flashback", "Pop", 30.15);
        //System.out.println(CD1.getDetails());
        //System.out.println(Buch1.getDetails());

        Artikel[] Artikel = new Artikel[4];

        Artikel[0] = new Buch(1, "Berserk", 19.99, 1337, "TokyoPop", 300);
        Artikel[1] = new CD(2, "Yes", 15.99, "Rhino Flashback", "Pop", 30.15);
        Artikel[2] = new Buch(3, "Metro 2033", 9.99, 874432987, "Heyne", 200);
        Artikel[3] = new CD(4, "DOOM Eternal OST", 17.99, "Bethesda Inc.", "LoFi", 666.66);

        for (int i = 0; i < Artikel.length; i++){
           // System.out.println(Artikel[i].getDetails());
           if (Artikel[i] instanceof CD) {
               CD ceedee = (CD) Artikel[i];
                getLenghtOver60Mins(ceedee);}
        }

    }

    public static void getLenghtOver60Mins(CD cd){
        if (cd.getSpieldauer() >= 60.00){
            System.out.println(cd.getDetails());
        }
    }

}
