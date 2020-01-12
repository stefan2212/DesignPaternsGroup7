import adapter.Adapter;
import adapter.IRomanianSnuff;
import adapter.RomanianSnuff;
import adapter.USASnuff;
import builder.PizzaBuilder;
import facade.Facade;
import facade.GeneralHello;
import observer.Observer;
import observer.ObserverImpl;
import observer.Subject;
import observer.SubjectImpl;
import prototype.Pizza;
import prototype.Prototype;
import proxy.Proxy;
import proxy.RealSubject;

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
        Pizza pizza = new Pizza("Margharita", 45, true);
        Prototype clonedPizza = pizza.makeClone();

        System.out.println(pizza);
        System.out.println(clonedPizza);

        //Adapter
        USASnuff usaSnuff = new Adapter();
        usaSnuff.plugInUsaSocket();

        IRomanianSnuff romanianSnuff = new Adapter();
        romanianSnuff.plugInRomanianSnuff();
    }
}
