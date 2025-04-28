/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transactionNotification;

/**
 *
 * @author estudiantes
 */
public class EachTransaction implements TransactionNotificationBehavior{

    @Override
    public void transactionNotification() {
        System.out.println("Each Transaction");
    }
    
}
