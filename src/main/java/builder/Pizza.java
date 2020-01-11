package builder;

public class Pizza {

    private String name;
    private int size;
    private boolean isCheese;
    private boolean isAddSauce;
    private boolean isTakeAway;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public void setCheese(boolean cheese) {
        isCheese = cheese;
    }

    public boolean isAddSauce() {
        return isAddSauce;
    }

    public void setAddSauce(boolean addSauce) {
        isAddSauce = addSauce;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    public void setTakeAway(boolean takeAway) {
        isTakeAway = takeAway;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isCheese=" + isCheese +
                ", isAddSauce=" + isAddSauce +
                ", isTakeAway=" + isTakeAway +
                '}';
    }
}
