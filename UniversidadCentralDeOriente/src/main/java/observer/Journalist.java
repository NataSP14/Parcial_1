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
public class Journalist implements Worker{

    @Override
    public void update(CourseData courseData) {
        System.out.println("The journalist receives a notification...\n The journalist broadcasts an advertising spot for the "
        +courseData.getCourseName()+" course, which is about "+courseData.getShortDescription()+", with a duration of "+ courseData.getCourseDuration()+"\n");
    }
    
}
