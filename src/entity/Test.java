package entity;

public class Test {
    public static void main(String[] args) {
        Me me = new Me("Dennis","Bektas",Horoscope.LEO,26,"Bachelor's graduate","123","Muhammed","Java","Boost");
        System.out.println("*******************************************");
        me.print();
        System.out.println("*******************************************");
        MySister mySister = new MySister("Sevgi","Bektas",Horoscope.PISCES,29,"Phd","1234","Jonathan","Eating Disorders","King's College London");
        mySister.print();
        System.out.println("*******************************************");
        me.writeCode();
        me.survive();
        me.eat();
        mySister.analyzeAPersonality();
        mySister.survive();
        System.out.println(mySister.getInterest());

    }
}
