package proxy;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public String doACtion() {
        return subject.doACtion();
    }
}
