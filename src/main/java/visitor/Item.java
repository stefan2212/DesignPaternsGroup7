package visitor;

public interface Item {

    Item accept(ShoppingCart visitor);

}
