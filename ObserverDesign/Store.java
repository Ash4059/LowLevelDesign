package ObserverDesign;

import ObserverDesign.Observable.IphoneObservable;
import ObserverDesign.Observable.StockObservable;
import ObserverDesign.Observer.EmailAlertImplementation;
import ObserverDesign.Observer.MobileAlertImplementation;
import ObserverDesign.Observer.NotificationAlertObserver;

public class Store{

    public static void main(String args[]){

        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertImplementation("jaiswalashish405@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new MobileAlertImplementation("Shivam200", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertImplementation("Santoshjaiswal2810@gmail.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setNumOfItem(20);

    }

}