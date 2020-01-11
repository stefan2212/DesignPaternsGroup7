package builder;

public class PizzaBuilder {
    private Pizza pizza;

    private String name;
    private int size;
    private boolean isTakeAway;
    private boolean isAddSauce;
    private boolean isAddCheese;

    public PizzaBuilder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public PizzaBuilder addCheese(boolean isAddCheese) {
        this.isAddCheese = isAddCheese;
        return this;
    }

    public PizzaBuilder addSauce(boolean isAddSauce) {
        this.isAddSauce = isAddSauce;
        return this;
    }

    public PizzaBuilder takeAway(boolean isTakeAway) {
        this.isTakeAway = isTakeAway;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.setSize(this.size);
        pizza.setTakeAway(this.isTakeAway);
        pizza.setCheese(this.isAddCheese);
        pizza.setAddSauce(this.isAddSauce);
        return pizza;
    }
}
