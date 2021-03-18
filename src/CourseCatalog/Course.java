/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

/**
 *
 * @author jayatipatel
 */
public class Course {
    String number;
    String name;
    public int credits;
    int price = 1500; //per credit hour
    int studentEvaluationScore;
    public Course(String n, String numb, int ch){
        name = n;
        number = numb;
        credits = ch;
    }
    public String getCourseNumber(){
        return number;
    }
    
    public int getCoursePrice(){
        return price*credits;
        
    }
}
