public class Gold implements billingSoftware {
    static double cost = 500.00;
    double RateDis = 0.2;

    @Override
    public double discount(double x) {
        double discAm = x*RateDis;
        return x-discAm;
    }
}
