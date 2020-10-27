package usinggattersettermethod;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    
    public static void main(String[] args) {
        
        List<StudentInfo> students= new ArrayList<>();
        
        StudentInfo studentInfo1 = new StudentInfo();
        
        studentInfo1.setStudentName("Sabbir");
        studentInfo1.setStudentRoll(100);
        studentInfo1.setStudentFatherName("Layek Mattubbor");
        
        StudentInfo studentInfo2 = new StudentInfo();
        
        studentInfo1.setStudentName("Mohammad");
        studentInfo1.setStudentRoll(101);
        studentInfo1.setStudentFatherName("Abdullaha");

        StudentInfo studentInfo3 = new StudentInfo();
        
        studentInfo1.setStudentName("Ibraim");
        studentInfo1.setStudentRoll(102);
        studentInfo1.setStudentFatherName("Test Khan");
        
        students.add(studentInfo3);
        students.add(studentInfo2);
        students.add(studentInfo1);
        
        for(StudentInfo AllStudentInfo :students){
        System.out.println("Student Name:"+
        studentInfo1.getStudentName()+"\n"+"Student Roll:"+
        studentInfo1.getStudentRoll()+"\n"+"Student's Father Name:"+
        studentInfo1.getStudentFatherName()
        );
         
            System.out.println("\n");
        }
        
    }
    
}
