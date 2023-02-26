import java.io.Console;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Bitte geben sie eine Sequenz von Klammern ein");
        char[] klammern = sc.next().toCharArray();

        System.out.println(isKlammerOK(klammern));*/

        HashSet<String> plz = new HashSet<>();
        HashSet<String> plz2 = new HashSet<>();
        HashSet<String> plzCompared = new HashSet<>();

        System.out.println("Geben Sie 5 Postleihzahlen ein:");
        plz.add(sc.next());
        plz.add(sc.next());
        plz.add(sc.next());
        plz.add(sc.next());
        plz.add(sc.next());

        System.out.println("Geben Sie 5 weitere Postleihzahlen ein:");
        plz2.add(sc.next());
        plz2.add(sc.next());
        plz2.add(sc.next());
        plz2.add(sc.next());
        plz2.add(sc.next());
        sc.close();


        for(String i : plz){
            for (String j : plz2) {
                if(i.equals(j)){
                    plzCompared.add(j);
                }
            }
        }

        for(String i : plzCompared){
            System.out.println(i);
        }


    }

    public static boolean isKlammerOK(char[] charArray){
        Stack<Character> charStack = new Stack<>();
        for (char c : charArray) {
            charStack.push(c);
        }
        if(charStack.isEmpty()){
            return false;

        }
        for (int i = 0; i < charStack.size(); i++){
        char c = charStack.peek();
        if (c == '('){
            charStack.pop();
            if(charStack.peek() == ')'){
                charStack.pop();
            }
        }
        else if(c == ')'){
            return false;
        }
        }
        if(charStack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}