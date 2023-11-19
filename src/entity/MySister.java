package entity;

public final class MySister extends PsychologyStudent{
    private String nameOfUniversity;
    public MySister(String firstName, String lastName, Horoscope horoscope, int age, String degree, String studentId, String teacherName, String interest, String nameOfUniversity) {
        super(firstName, lastName, horoscope, age, degree, studentId, teacherName, interest);
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    @Override
    public void analyzeAPersonality() {
        System.out.println("I am analyzing someone' personality");
    }
    public void print(){
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + getLastName());
        System.out.println("Horoscope: " + getHoroscope().name());
        System.out.println("Age: " + getAge());
        System.out.println("Degree: " + getDegree());
        System.out.println("StudentID: " + getStudentId());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Interest: " + getInterest());
        System.out.println("Name Of University: " + nameOfUniversity);
    }

}
