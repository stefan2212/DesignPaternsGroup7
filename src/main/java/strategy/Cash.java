package strategy;

public class Cash implements Payment {

    private int amount;

    public Cash() {
        amount = 100;
    }
    @Override
    public void pay(int amount) throws NotEnoughMoneyException {
        this.amount = PayUtil.pay(this.amount, amount);
    }
}
