package strategy;

public interface Payment {
    public void pay(int amount) throws NotEnoughMoneyException, CardExpiredException;
}
