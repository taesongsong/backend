package a1126.hak5;

public class Student {
    private String name;
    private String studentId;
    
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    //toString 메서드 오버라이드
    @Override
    public String toString() {
        return "아름 : " + name + ", 학번" + studentId ;
    }

}
