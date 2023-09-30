package ObserverDesign.Observer;

import ObserverDesign.Observable.StockObservable;

public class MobileAlertImplementation implements NotificationAlertObserver {

    String userName;
    StockObservable observable;
    
    public MobileAlertImplementation(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMessage("Product is in stock hurry up!");
    }

    private void sendMessage(String message){
        System.out.println(userName + " : " + message);
    }

}