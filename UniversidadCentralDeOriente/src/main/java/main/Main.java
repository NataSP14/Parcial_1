/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import observer.CommunityManager;
import observer.Journalist;
import observer.WebMaster;
import observer.Worker;
import subject.CourseData;

/**
 *
 * @author estudiantes
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Universidad Central del Oriente\n");
        
        CourseData courseData= new CourseData()
;        
        //Set all observers
        Worker andrea= new WebMaster();
        Worker luzDary= new Journalist();
        Worker laura= new CommunityManager();
        
        //Register the observers
        courseData.registerObserver(andrea);
        courseData.registerObserver(luzDary);
        courseData.registerObserver(laura);
        
        courseData.setAllData("Artificial intelligence applied to education", "48 hours", "With this course you wil be able to....");
        courseData.notifyObserver();
        
        courseData.setAllData("Decolonial pedagogy", "26 hours", "With this course you wil be able to....");
        courseData.notifyObserver();
        
        courseData.setAllData("Smart cities", "32 hours", "With this course you wil be able to....");
        courseData.notifyObserver();
        
        
        
    }
}
