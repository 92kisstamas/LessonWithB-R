package hu.progmatic;

public class Form {

    public String firstName;
    public String lastName;
    public String city;
    public int age;

    Form(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }


     void formular(){
        city += ", Pest megye,";
        System.out.println("========================");
        System.out.println("\t Adatlap:");
        System.out.println("========================");
        System.out.println("Vezetéknév:\t" + this.firstName);
        System.out.println("Keresztnév:\t" + this.lastName);
        System.out.println("Város:\t\t" + this.city);
    }

}
