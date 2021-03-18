/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import CourseSchedule.CourseLoad;
import java.util.HashMap;

/**
 *
 * @author jayatipatel
 */
public class Transcript {
    HashMap<String, CourseLoad> courseloadlist;
    CourseLoad currentcourseload;
    public Transcript(){
        courseloadlist = new HashMap<String, CourseLoad>();
    }
    public CourseLoad newCourseLoad(String sem){
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    public CourseLoad getCurrentCourseLoad(){
        return currentcourseload;
    }
    public CourseLoad getCourseLoadBySemester(String semester){
        return courseloadlist.get(semester);
    }
    public int transcriptTotalGrade(){
        int sum = 0;
        for(int i=0; i<courseloadlist.size(); i++){
            sum = sum + courseloadlist.get(i).totalGradeInCourseLoad();
        }
        return sum;
    }
    public int transcriptTotalCredits(){
        int sum = 0;
        for(int i=0; i<courseloadlist.size(); i++){
            sum = sum + courseloadlist.get(i).totalCreditsInCourseLoad();
        }
        return sum;
    }
    public float gradePoint(){
        return this.transcriptTotalGrade()/this.transcriptTotalCredits();
    }
}
