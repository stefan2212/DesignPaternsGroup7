package decorator;

import java.util.List;

public interface Pizza {

    void addIngredient(String ingredient);

    void printIngredients();

    List<String> getIngredients();
}
