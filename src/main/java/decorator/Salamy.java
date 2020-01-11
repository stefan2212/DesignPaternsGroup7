package decorator;

public class Salamy extends PizzaDecorator {

    public Salamy(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void printIngredients() {
        getIngredients().forEach(System.out::println);
    }
}
