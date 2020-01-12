package observer;

public class ObserverImpl implements Observer {
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.register(this);
    }

    @Override
    public String toString() {
        return "ObserverImpl{" +
                "state='" + state + '\'' +
                '}';
    }
}
