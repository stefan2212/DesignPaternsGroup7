package visitor;

public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public Item visit(Computer computer) {
        return computer;
    }

    @Override
    public Item visit(Car car) {
        return car;
    }

}
