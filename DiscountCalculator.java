package lab;



abstract class DiscountCalculator {
    double amount;
    public abstract double CalculateDiscount(double amount);
}
class Regular extends DiscountCalculator{

    @Override
    public double CalculateDiscount(double amount) {
        return amount;
    }
}
class Silver extends DiscountCalculator{
    @Override
    public double CalculateDiscount(double amount) {
        return amount * 0.9;
    }
}
class Gold extends DiscountCalculator{
    @Override
    public double CalculateDiscount(double amount) {
        return amount * 0.8;
    }
}