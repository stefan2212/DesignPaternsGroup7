package visitor;

public interface ShoppingCart {
    Item visit(Computer computer);
    Item visit(Car car);
}
