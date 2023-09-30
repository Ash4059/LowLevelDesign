package ObserverDesign.Observable;

import ObserverDesign.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifyObservers();

    public void setStockCount(int stockCount);

    public int getStockCount();

}