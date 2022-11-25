public class Kunde extends Person{
    protected int KundenID;

    public Kunde(String name, int kundenid){
        super(name);
        this.KundenID = kundenid;
    }

    public int getKundenID(){
        return this.KundenID;
    }

    public void setKundenID(int kundenID){
        this.KundenID = kundenID;
    }

    public String toString(){
        return super.toString() + " Kundennummer: " + getKundenID();
    }
}
