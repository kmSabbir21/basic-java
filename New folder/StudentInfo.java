package usinggattersettermethod;

public class StudentInfo {

private String StudentName; 
private int StudentRoll; 
private String StudentFatherName; 

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getStudentRoll() {
        return StudentRoll;
    }

    public void setStudentRoll(int StudentRoll) {
        this.StudentRoll = StudentRoll;
    }

    public String getStudentFatherName() {
        return StudentFatherName;
    }

    public void setStudentFatherName(String StudentFatherName) {
        this.StudentFatherName = StudentFatherName;
    }
    
}
