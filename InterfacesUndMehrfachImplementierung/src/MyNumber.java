public class MyNumber implements Commentable, Flagable{

    private int Number;
    private String Comment;

    private boolean Flag;

    public MyNumber(int Number_P, String Comment_P, boolean Flag_P){
        Number = Number_P;
        Comment = Comment_P;
        Flag = Flag_P;
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

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public boolean getFlag() {
        return Flag;
    }

    @Override
    public void setFlag() {
        Flag = true;
    }

    @Override
    public void resetFlag() {
        Flag = false;
    }
}
