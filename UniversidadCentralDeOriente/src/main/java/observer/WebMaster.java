/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import subject.CourseData;

/**
 *
 * @author estudiantes
 */
public class WebMaster implements Worker {

    @Override
    public void update(CourseData courseData) {
        System.out.println("The webmaster receives a notification... \nThe webmaster evaluates the " 
                + courseData.getCourseName() + " course and decides if it should be posted, updated or removed\n");
    }

}
