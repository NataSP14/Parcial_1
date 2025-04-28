/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import balanceAlert.BalanceFalls;
import promotionsAndOffers.ByEmail;
import transactionNotification.EachTransaction;
import user.User;

/**
 *
 * @author estudiantes
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to your mobile wallet");
        
        User user1=new User(new EachTransaction(),new BalanceFalls(),new ByEmail());
    }
}
