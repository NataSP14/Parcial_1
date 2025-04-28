/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subject;

import observer.Worker;

/**
 *
 * @author estudiantes
 */
public interface EDCO {
    public void registerObserver(Worker observer);
    public void removeObserver(Worker observer);
    public void notifyObserver();
}
