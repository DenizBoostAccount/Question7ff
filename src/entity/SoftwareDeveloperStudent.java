package entity;

public abstract class SoftwareDeveloperStudent extends Student{
    private String programmingLanguageUsed;
    public SoftwareDeveloperStudent(String firstName, String lastName, Horoscope horoscope, int age, String degree, String studentId, String teacherName, String programmingLanguageUsed) {
        super(firstName, lastName, horoscope, age, degree, studentId, teacherName);
        this.programmingLanguageUsed = programmingLanguageUsed;
    }
    public void work(){
        System.out.println("I am a software developer student and I am working on " + programmingLanguageUsed);
    }
    public abstract void writeCode();

    public String getProgrammingLanguageUsed() {
        return programmingLanguageUsed;
    }

    public void setProgrammingLanguageUsed(String programmingLanguageUsed) {
        this.programmingLanguageUsed = programmingLanguageUsed;
    }



}
