/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

/**
 *
 * @author jayatipatel
 */
public class Seat {
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
    }
    
    public Boolean isOccupied(){
        return occupied;
    }
    public SeatAssignment newSeatAssignment(){
        seatassignment = new SeatAssignment(); //links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }
    public CourseOffer getCourseOffer(){
        return this.courseoffer;
    }
    public int studentSeatEvaluationCourseScore(){
        return seatassignment.evaluationCourseScore;
    }
    public int studentSeatEvalautionFacultyScore(){
        return seatassignment.evaluationFacultyScore;
    }
}
