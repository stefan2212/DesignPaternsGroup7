package factory;

public class PizzaFactory {
    public Pizza getPizza(String pizzaType) {
        if ("Capricioasa".equals(pizzaType)) {
            return new Capricioasa();
        } else if ("Margharita".equals(pizzaType)) {
            return new Margharita();
        } else {
            return null;
        }
    }
}
