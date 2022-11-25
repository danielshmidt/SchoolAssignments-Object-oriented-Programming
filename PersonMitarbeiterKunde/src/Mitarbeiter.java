public class Mitarbeiter extends Person{
    protected int Mitarbeiternummer;

    public Mitarbeiter(String name, int mitarbeiternummer){
        super(name);
        this.Mitarbeiternummer = mitarbeiternummer;
    }

    public int getMitarbeiternummer(){
        return this.Mitarbeiternummer;
    }

    public void setMitarbeiternummer(int mitarbeiternummer){
        this.Mitarbeiternummer = mitarbeiternummer;
    }

    @Override
    public String toString(){
        return super.toString() + " Mitarbeiternummer: " + getMitarbeiternummer();
    }
}
