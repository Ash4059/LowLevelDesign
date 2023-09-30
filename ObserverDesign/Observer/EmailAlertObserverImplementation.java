package ObserverDesign.Observer;

import ObserverDesign.Observable.StockObservable;

public class EmailAlertObserverImplementation implements NotificationAlertObserver {
    
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImplementation(String emailId, StockObservable observable){
        
        this.emailId = emailId;
        this.observable = observable;

    }   

    @Override
    public void update(){
        sendMail("Product is in stock hurry up!");
    }

    private void sendMail(String message){
        System.out.println(emailId + " : " + message);
    }

}
