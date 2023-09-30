package ObserverDesign.Observer;

import ObserverDesign.Observable.StockObservable;

public class EmailAlertImplementation implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertImplementation(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMessage("Product is in stock. Hurry up!!!!");
    }

    private void sendMessage(String message){
        System.out.println(this.emailId + " : " + message);
    }

}