package decorator;

import java.util.ArrayList;
import java.util.List;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    private List<String> ingredients;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
        ingredients = pizza.getIngredients();
    }
    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public void printIngredients() {
        ingredients.forEach(System.out::println);
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
