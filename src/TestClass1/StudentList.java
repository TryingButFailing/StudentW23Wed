package TestClass1;

public class StudentList {
    public static void main(String[] args){
        //StudentW23Wed s1= new StudentW23Wed("s1", "chris");
        StudentW23Wed[] studentList = new StudentW23Wed[3];
        studentList[0]= new StudentW23Wed("s1","chris");
        studentList[1]= new StudentW23Wed("s2","moe");
        studentList[2]= new StudentW23Wed("s3","taha");
        
        for(int i= 0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }//end of for loop
    }//end of main
}//end of class
