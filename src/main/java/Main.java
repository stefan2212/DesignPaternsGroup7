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
        Pizza pizza = new Pizza("Margharita", 45, true);
        Prototype clonedPizza = pizza.makeClone();

        System.out.println(pizza);
        System.out.println(clonedPizza);
    }
}
