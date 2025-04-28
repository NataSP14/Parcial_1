/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import balanceAlert.BalanceAlertBehavior;
import promotionsAndOffers.PromotionsAndOffersBehavior;
import transactionNotification.TransactionNotificationBehavior;

/**
 *
 * @author estudiantes
 */
public class User {
    private TransactionNotificationBehavior transactionNotificationBehavior;
    private BalanceAlertBehavior balanceAlertBehavior;
    private PromotionsAndOffersBehavior promotionsAndOffersBehavior;

    public User(TransactionNotificationBehavior transactionNotificationBehavior, BalanceAlertBehavior balanceAlertBehavior, PromotionsAndOffersBehavior promotionsAndOffersBehavior) {
        this.transactionNotificationBehavior = transactionNotificationBehavior;
        this.balanceAlertBehavior = balanceAlertBehavior;
        this.promotionsAndOffersBehavior = promotionsAndOffersBehavior;
    }
    
    public void performTransactionNotification(){
        transactionNotificationBehavior.transactionNotification();
    }
    
    public void performBalanceAlert(){
        balanceAlertBehavior.balanceAlert();
    }
    
    public void performPromotionsAndOffers(){
        promotionsAndOffersBehavior.promotionsAndOffers();
    }

    public void setTransactionNotificationBehavior(TransactionNotificationBehavior transactionNotificationBehavior) {
        this.transactionNotificationBehavior = transactionNotificationBehavior;
    }

    public void setBalanceAlertBehavior(BalanceAlertBehavior balanceAlertBehavior) {
        this.balanceAlertBehavior = balanceAlertBehavior;
    }

    public void setPromotionsAndOffersBehavior(PromotionsAndOffersBehavior promotionsAndOffersBehavior) {
        this.promotionsAndOffersBehavior = promotionsAndOffersBehavior;
    }
    
}
