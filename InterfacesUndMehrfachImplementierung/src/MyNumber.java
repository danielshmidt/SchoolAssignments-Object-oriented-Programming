public class MyNumber implements Commentable{

    private int Number;
    private String Comment;

    public MyNumber(int Number_P, String Comment_P){
        Number = Number_P;
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
        Comment = null;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
