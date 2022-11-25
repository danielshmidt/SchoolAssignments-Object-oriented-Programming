public class Person{
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Name: " + getName();
    }

}
