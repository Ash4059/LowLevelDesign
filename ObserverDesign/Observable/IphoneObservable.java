package ObserverDesign.Observable;

import java.util.*;

import ObserverDesign.Observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable {

    private List<NotificationAlertObserver> lstObservable = new ArrayList<>();

    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observable){
        lstObservable.add(observable);
    }

    @Override
    public void remove(NotificationAlertObserver observable){
        lstObservable.remove(observable);
    }

    @Override
    public void notifyObserver(){
        for(NotificationAlertObserver observer : lstObservable){
            observer.update();
        }
    }

    @Override
    public int getNumOfItem(){
        return stockCount;
    }

    @Override
    public void setNumOfItem(int stockCount){
        if(this.stockCount == 0){
            notifyObserver();
        }
        this.stockCount = stockCount;
    }

}