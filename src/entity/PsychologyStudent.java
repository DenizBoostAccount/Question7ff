package entity;

public abstract class PsychologyStudent extends Student{
    private String interest;
    public PsychologyStudent(String firstName, String lastName, Horoscope horoscope, int age, String degree, String studentId, String teacherName, String interest) {
        super(firstName, lastName, horoscope, age, degree, studentId, teacherName);
        this.interest = interest;
    }

    public void work(){
        System.out.println("I am a psychology student and I am working on " + interest);
    }
    public abstract void analyzeAPersonality();

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

}
