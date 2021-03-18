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
public class SeatAssignment {
    Seat seat;
    CourseLoad courseload;
    int studentGrade;
    int evaluationCourseScore;
    int evaluationFacultyScore;
    public SeatAssignment(CourseLoad cl, Seat s, int sg){
        seat = s;
        courseload = cl;
        studentGrade = sg;
    }
    public SeatAssignment(){

    }
    public void studentEvaluationCourseScore(int e){
        evaluationCourseScore = e;
    }   
    public void studentEvaluationFacultyScore(int e){
        evaluationFacultyScore = e;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
}
