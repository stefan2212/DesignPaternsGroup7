package decorator;

public class Ham extends PizzaDecorator {
    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void printIngredients() {
        getIngredients().forEach(System.out::println);
    }
}
