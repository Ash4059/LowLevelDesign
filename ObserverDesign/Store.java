package ObserverDesign;

import ObserverDesign.Observable.*;
import ObserverDesign.Observer.*;

public class Store {
    
    public static void main(String args[]){

        StockObservable IphoneObservable = new IphoneObservable();

        NotificationAlertObserver Observer1 = new EmailAlertObserverImplementation("jaiswalashish405@gmail.com", IphoneObservable);
        NotificationAlertObserver Observer2 = new EmailAlertObserverImplementation("jaiswalsantosh2810@gmail.com", IphoneObservable);
        NotificationAlertObserver Observer3 = new MobileAlertImplementation("Shivam2000", IphoneObservable);

        IphoneObservable.add(Observer1);
        IphoneObservable.add(Observer2);
        IphoneObservable.add(Observer3);

        IphoneObservable.setStockCount(0);

        IphoneObservable.setStockCount(20);

        IphoneObservable.setStockCount(0);

    }

}
