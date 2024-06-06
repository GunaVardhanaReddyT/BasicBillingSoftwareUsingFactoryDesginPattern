public class Silver implements billingSoftware{
    double cost = 300.00;
    double RateDis = 0.1;
    public double discount(double x)
    {
        double discAm = x*RateDis;
        return x-discAm;
    }
}
