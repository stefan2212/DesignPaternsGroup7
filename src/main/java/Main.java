import adapter.Adapter;
import adapter.IRomanianSnuff;
import adapter.USASnuff;
import observer.Observer;
import observer.ObserverImpl;
import observer.Subject;
import observer.SubjectImpl;
import proxy.Proxy;
import proxy.RealSubject;
import strategy.*;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Proxy
        proxy.Subject realSubject = new RealSubject();
        proxy.Subject proxy = new Proxy(realSubject);
        System.out.println(proxy.doACtion());
        System.out.println(realSubject.doACtion());

        //Observer
        Subject subject = new SubjectImpl();
        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverImpl();
        Observer observer3 = new ObserverImpl();
        observer1.subscribe(subject);
        observer2.subscribe(subject);
        observer3.subscribe(subject);
        subject.setState("State 1");

        System.out.println(observer1);
        System.out.println(observer2);
        System.out.println(observer3);

        subject.setState("State 2");

        System.out.println(observer1);
        System.out.println(observer2);
        System.out.println(observer3);


        //Prototype
//        Pizza pizza = new Pizza("Margharita", 45, true);
//        Prototype clonedPizza = pizza.makeClone();
//
//        System.out.println(pizza);
//        System.out.println(clonedPizza);

        //Adapter
        USASnuff usaSnuff = new Adapter();
        usaSnuff.plugInUsaSocket();

        IRomanianSnuff romanianSnuff = new Adapter();
        romanianSnuff.plugInRomanianSnuff();

        //Strategy
        Pizza pizza = new Pizza("SeafoddPizza", 25);
        Payment cashPayment = new Cash();
        try {
            cashPayment.pay(pizza.getPrice());
            cashPayment.pay(pizza.getPrice());
            cashPayment.pay(pizza.getPrice());
            cashPayment.pay(pizza.getPrice());
            cashPayment.pay(pizza.getPrice());
            System.out.println("You have payed for the pizza");
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        } catch (CardExpiredException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date expireDate =  cal.getTime();
        System.out.println(expireDate);

        Payment cardPayment = new CreditCard("Stefan Cernescu", "123123123", 555, expireDate);
        try{
            cardPayment.pay(pizza.getPrice());
        } catch (CardExpiredException e) {
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
}
