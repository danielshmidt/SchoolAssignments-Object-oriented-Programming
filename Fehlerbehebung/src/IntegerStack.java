public class IntegerStack {

    public Integer[] storage = new Integer[10];
    private int index = -1;


    public void push(Integer i) throws StackFullException {
            if(index >= 10) {
                throw new StackFullException("Push on Full Stack");
            }
        index++;
        storage[index] = i;
    }

    public Integer pop() throws StackEmptyException{
        if(index <= -1){
            throw new StackEmptyException("Pop on Empty Stack");

        }
        Integer val = storage[index];
        index--;
        return val;
    }

    public Integer peek(){
        return storage[index];
    }

    public boolean empty() {
        return index == 0;
    }

}