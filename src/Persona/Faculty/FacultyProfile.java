/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.Faculty;
import CourseSchedule.CourseOffer;
import Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author jayatipatel
 */
public class FacultyProfile {
    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 

    public FacultyProfile(Person p) {
        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    public int getFacultyEvaluationScore(){
        int count=0; 
        int sum=0;
        for(int i=0; i<facultyassignments.size(); i++){
            count++;
            sum=sum+facultyassignments.get(i).courseoffer.avgEvaluationFacultyScore();
        }
        return sum/count;
    }
}
