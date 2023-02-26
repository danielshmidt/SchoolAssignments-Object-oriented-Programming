public abstract class Figur2D implements Interface2D{
    @Override
    public String returnAttributes() {
        return "ballz";
    }

    @Override
    public double FlaechenInhalt_berechnen(double a) {
        return Math.pow(a,4);
    }

    @Override
    public double Umfang_berechnen(double a) {
        return 4*a;
    }
}
