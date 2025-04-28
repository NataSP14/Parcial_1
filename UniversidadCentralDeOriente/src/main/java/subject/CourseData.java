/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

import java.util.ArrayList;
import jdk.net.NetworkPermission;
import observer.Worker;

/**
 *
 * @author estudiantes
 */
public class CourseData implements EDCO {

    Worker observer;
    ArrayList<Worker> workers = new ArrayList<Worker>();
    private String courseName;
    private String courseDuration;
    private String shortDescription;


    @Override
    public void registerObserver(Worker observer) {
        workers.add(observer);
    }

    @Override
    public void removeObserver(Worker observer) {
        workers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Worker worker:workers){
            worker.update(this);
        }
    }
    
    public void setAllData(String courseName, String courseDuration, String shortDescription){
        this.courseName=courseName;
        this.courseDuration=courseDuration;
        this.shortDescription=shortDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    
    

}
