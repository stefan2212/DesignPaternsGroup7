package proxy;

public class RealSubject implements Subject {

    public RealSubject() {

    }
    @Override
    public String doACtion() {
        return "Hello";
    }
}
