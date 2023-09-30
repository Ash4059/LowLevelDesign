package ObserverDesign.Observable;

import java.util.*;
import ObserverDesign.Observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable{

    private List<NotificationAlertObserver> observerList = new ArrayList<>();

    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {

        if(this.stockCount == 0)
            notifyObservers();
        
        this.stockCount = stockCount;  

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
