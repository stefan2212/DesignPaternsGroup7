package visitor;

public class Computer implements Item {

    private int ram;
    private int hdd;
    private int cpu;
    private double price;

    public Computer(int ram, int hdd, int cpu, double price) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.price = price;
    }

    @Override
    public Item accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getCpu() {
        return cpu;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                ", price=" + price +
                '}';
    }
}
