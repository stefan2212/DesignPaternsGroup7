import builder.Pizza;
import builder.PizzaBuilder;
import facade.Facade;
import facade.GeneralHello;
import observer.Observer;
import observer.ObserverImpl;
import observer.Subject;
import observer.SubjectImpl;
import proxy.Proxy;
import proxy.RealSubject;

public class Main {

    public static void main(String[] args) {
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


    }
}
