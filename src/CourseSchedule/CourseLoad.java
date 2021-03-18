/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author jayatipatel
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    public void registerStudent(SeatAssignment sa){
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    public int totalGradeInCourseLoad(){
        int sum = 0;
        for(int i=0; i<seatassignments.size(); i++){
            sum = sum + seatassignments.get(i).studentGrade;
        }
        return sum;
    }
    public int totalCreditsInCourseLoad(){
        int sum = 0;
        for(int i=0; i<seatassignments.size(); i++){
            sum = sum + seatassignments.get(i).seat.getCourseOffer().getCourse().credits;
        }
        return sum;
    }
}
