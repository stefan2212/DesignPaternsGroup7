package strategy;

import java.util.concurrent.ExecutorService;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message){
        super(message);
    }
}
