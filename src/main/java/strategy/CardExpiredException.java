package strategy;

import javax.smartcardio.Card;

public class CardExpiredException extends Exception {
    public CardExpiredException(String message){
        super(message);
    }
}
