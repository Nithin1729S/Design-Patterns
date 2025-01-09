package IphoneMessaging.Observer;

import IphoneMessaging.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;
    public MobileAlertObserverImpl(String userName,StockObservable observable){
        this.observable=observable;
        this.userName=userName;
    }
    @Override
    public void update(){
        sendMsgOnMobile(userName,"Product is in stock hurry up");
    }

    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to: " +userName);
    }
}
