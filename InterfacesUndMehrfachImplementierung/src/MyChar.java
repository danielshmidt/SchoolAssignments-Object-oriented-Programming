public class MyChar implements Commentable {
    private char Char;
    private String Comment;

    public MyChar(char Char_P, String Comment_P){
        Char = Char_P;
        Comment = Comment_P;
    }

    @Override
    public String getComment() {
        return Comment;
    }

    @Override
    public void setComment(String commment) {
        Comment = commment;
    }

    @Override
    public void clearComment() {
        Comment = "";
    }

    public char getChar() {
        return Char;
    }

    public void setChar(char char_I) {
        Char = char_I;
    }
}
