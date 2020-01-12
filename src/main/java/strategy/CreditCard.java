package strategy;

import java.util.Date;

public class CreditCard implements Payment {


    private String fullName;
    private String cardNumber;
    private int ccv;
    private Date dateOfExpire;

    private int amount;

    public CreditCard(String fullName, String cardNumber, int ccv, Date dateOfExpire) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateOfExpire = dateOfExpire;
        this.amount = 500;
    }
    @Override
    public void pay(int amount) throws NotEnoughMoneyException, CardExpiredException {
        Date currentDate = new Date();
        if(dateOfExpire.compareTo(currentDate) < 0) {
            throw new CardExpiredException("Your card has expired.");
        }
        this.amount = PayUtil.pay(this.amount, amount);
    }
}
