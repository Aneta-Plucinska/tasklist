package notification;

public interface TaskNotifier {

    void registerObserver(Observer o);
    void unregsterObserver(Observer o);
    void notifyObserver(Observer o);

}
