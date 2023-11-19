package entity;

import java.util.UUID;

public abstract class Person implements IPerson {
    private String id;
    private String firstName;
    private String lastName;
    private Horoscope horoscope;
    private int age;


    public Person(String firstName, String lastName, Horoscope horoscope, int age) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.horoscope = horoscope;
        this.age = age;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Horoscope getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(Horoscope horoscope) {
        this.horoscope = horoscope;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("I am a person and I eat meal...");
    }

    @Override
    public void drink() {
        System.out.println("I am a person and I drink water...");
    }

    @Override
    public void Sleep() {
        System.out.println("I am a person and I sleep...");
    }

    @Override
    public void survive() {
        System.out.println("I am a person and I try to survive...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", horoscope='" + horoscope.name() + '\'' +
                ", age=" + age +
                '}';
    }
}
