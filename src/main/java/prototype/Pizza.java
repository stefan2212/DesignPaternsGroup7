package prototype;

import proxy.Proxy;

public class Pizza implements Prototype {

    private String name;
    private int size;
    private boolean isCheese;

    public Pizza(String name, int size, boolean isCheese) {
        this.name = name;
        this.size = size;
        this.isCheese = isCheese;
    }

    @Override
    public Prototype makeClone() {
        Pizza pizza = null;
        try{
            pizza = (Pizza)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pizza;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isCheese=" + isCheese +
                '}';
    }
}
