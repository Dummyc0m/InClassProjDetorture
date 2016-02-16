/**
 * Created by Dummyc0m on 2/16/16.
 */
public abstract class Coin implements Money {
    private double amount;

    public Coin(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
