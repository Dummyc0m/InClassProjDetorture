/**
 * Created by Dummyc0m on 2/16/16.
 */
public class Bill implements Money {
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
