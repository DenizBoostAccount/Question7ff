package entity;




public final class Me extends SoftwareDeveloperStudent{
    private String courseName;
    public Me(String firstName, String lastName, Horoscope horoscope, int age, String degree, String studentId, String teacherName, String programmingLanguageUsed, String courseName) {
        super(firstName, lastName, horoscope, age, degree, studentId, teacherName, programmingLanguageUsed);
        this.courseName = courseName;
    }

    @Override
    public void writeCode() {
        System.out.println("I am writing code in " + getProgrammingLanguageUsed());
    }

    public void print(){
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + getLastName());
        System.out.println("Horoscope: " + getHoroscope().name());
        System.out.println("Age: " + getAge());
        System.out.println("Degree: " + getDegree());
        System.out.println("StudentID: " + getStudentId());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Programming Language Used: " + getProgrammingLanguageUsed());
        System.out.println("CourseName: " + courseName);
    }
}
