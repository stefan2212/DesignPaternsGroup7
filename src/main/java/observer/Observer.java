package observer;

public interface Observer {
    void update(String state);
    void subscribe(Subject subject);
}
