import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();


        strings.add(0, "moin");
        strings.add(1, "moin12");
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        strings.remove(0);
        System.out.println(strings.get(0));



        ArrayList<Double> doubles = new ArrayList<>();

        doubles.add(0, 4.3);
        doubles.add(1, (double)-9);
        doubles.add(2, (double)0);
        doubles.add(3,11.12);
        doubles.add(4, (double)99);

        for(double d : doubles){
            System.out.println(d);
        }

        doubles.add(2, 0.25);

        for(double d : doubles){
            System.out.println(d);
        }
        doubles.remove(0);


        for(double d : doubles){
            System.out.println(d);
        }

        characters.add('(');
        characters.add('(');
        characters.add(')');
        characters.add(')');




    }
}