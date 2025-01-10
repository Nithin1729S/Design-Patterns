package IphoneMessaging;

import IphoneMessaging.Observable.IphoneObservableImpl;
import IphoneMessaging.Observable.StockObservable;
import IphoneMessaging.Observer.EmailAlertObserverImpl;
import IphoneMessaging.Observer.MobileAlertObserverImpl;
import IphoneMessaging.Observer.NotificationAlertObserver;

public class Store{
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailAlertObserverImpl("nithin1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("nithin@2gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("nithin@g3mail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);

    }
}