public class main {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(42, "Answer to the Ultimate Question of Life, The Universe, and Everything", true);
        System.out.println("Number: " + number.getNumber() + "\n" + "Comment: " + number.getComment() + "\n" + "Flag: " + number.getFlag());
        number.clearComment();
        number.resetFlag();
        System.out.println("Number: " + number.getNumber() + "\n" + "Comment: " + number.getComment() + "\n" + "Flag: " + number.getFlag());

        MyChar myChar = new MyChar('U', "Answer to the Ultimate Question of Life, The Universe, and Everything");

        System.out.println("Char: " + myChar.getChar() + "\n" + "Comment: " + myChar.getComment());
        myChar.clearComment();
        System.out.println("Number: " + myChar.getChar() + "\n" + "Comment: " + myChar.getComment());

    }
}
