package entity;

public abstract class Student extends Person implements IStudent{
    private String degree;
    private String studentId;
    private String teacherName;
    public Student(String firstName, String lastName, Horoscope horoscope, int age, String degree, String studentId, String teacherName) {
        super(firstName, lastName, horoscope, age);
        this.degree = degree;
        this.studentId = studentId;
        this.teacherName = teacherName;
    }
    public abstract void work();

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


}
