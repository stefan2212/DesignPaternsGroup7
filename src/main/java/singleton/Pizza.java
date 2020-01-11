package singleton;

public class Pizza {

    private static Pizza pizza = null;

    private String name;

    private Pizza() {

    }

    public static Pizza getInstance() {
        if(pizza == null) {
            pizza = new Pizza();
        }
        return pizza;
    }
}

