import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntegerStack Test = new IntegerStack();

        for (int i = -1; i < 9; i++){
            try {
                Test.push(i);
            }
            catch (StackFullException e){
                System.out.println(e.getMessage());
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }

        try {
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());
            System.out.println(Test.pop());

        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
