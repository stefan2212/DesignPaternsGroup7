package decorator;

import java.util.ArrayList;
import java.util.List;

public class BasicPizza implements Pizza {

    private List<String> ingredients;

    public BasicPizza() {
        ingredients = new ArrayList<>();
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
