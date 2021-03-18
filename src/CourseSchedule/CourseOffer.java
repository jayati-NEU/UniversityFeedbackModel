/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import Persona.Faculty.FacultyAssignment;
import Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author jayatipatel
 */
public class CourseOffer {
    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
    public void AssignAsTeacher(FacultyProfile fp) {
        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCourseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(); //seat is already linked to course offer
        cl.registerStudent(sa);; //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {
        int sum = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }
        }
        return sum;
    }
    public Course getCourse(){
        return this.course;
    }
    public int avgEvaluationCourseScore(){
        int count=0;
        int sum=0;
        for(int i=0; i<seatlist.size(); i++){
            if(seatlist.get(i).occupied){
                count++;
                sum=sum+seatlist.get(i).studentSeatEvaluationCourseScore();
            }
        }
        return sum/count;
    }
    public int avgEvaluationFacultyScore(){
        int count=0;
        int sum=0;
        for(int i=0; i<seatlist.size(); i++){
            if(seatlist.get(i).occupied){
                count++;
                sum=sum+seatlist.get(i).studentSeatEvalautionFacultyScore();
            }
        }
        return sum/count;
    }
}
