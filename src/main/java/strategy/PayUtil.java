package strategy;

public class PayUtil {
    public static int pay(int walletAmount, int amountToPay) throws NotEnoughMoneyException {
        int result = walletAmount - amountToPay;
        if(result<0) {
            throw  new NotEnoughMoneyException("You don't have enough money!! HAHA... GO TO WORK!!!");
        }
        return result;
    }
}
