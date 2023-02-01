/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass1;

/**
 *
 * @author chris
 */
public class PartTimeStudent extends StudentW23Wed{
    
    private int noOfCourse;

    public PartTimeStudent(int noOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.noOfCourse = noOfCourse;
    }
    
    public int getNoOfCourse() {
        return noOfCourse;
    }

    public void setNoOfCourse(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }

    
}
    
    
