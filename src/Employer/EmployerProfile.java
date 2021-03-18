/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employer;

import CourseCatalog.Course;
import CourseCatalog.CourseSuggest;
import java.util.ArrayList;

/**
 *
 * @author jayatipatel
 */
public class EmployerProfile {
    String name;
    ArrayList<CourseSuggest> courseSuggested;
    
    public EmployerProfile(String n){  //could be company instead of just a name as a string
        name = n;
        courseSuggested = new ArrayList();
    }
    public boolean isMatch(String id){
        if(name.equals(id)) return true;             //String is an object and can do equal matach
        return false;
    }
    public void newCourseSuggestion(String courseName){
        CourseSuggest c = null;
        c.courseName = courseName;
        c.employerName = this.name;
        courseSuggested.add(c);
    }
}
