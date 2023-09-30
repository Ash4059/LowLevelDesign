package ObserverDesign.Observable;

import ObserverDesign.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public int getNumOfItem();

    public void setNumOfItem(int num);

    public void notifyObserver();

}