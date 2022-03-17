package hu.progmatic;

import java.util.Scanner;

public class ora0317feladat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a vezetékneved: ");
        String lastName = sc.nextLine();
        sc.nextLine();

        System.out.println("Kérema keresztneved: ");
        String firstName = sc.nextLine();
        sc.nextLine();

        System.out.println("Kérem a nemed: (f/n)");
        boolean sex = sc.nextLine().equalsIgnoreCase("f");
        sc.nextLine();

        //adatok();
        //adatok2(lastName, firstName, sex);
        String asd = adatok3(lastName, firstName, sex);
    }

    public static void adatok (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a vezetékneved: ");
        String lastName = sc.nextLine();
        sc.nextLine();

        System.out.println("Kérema keresztneved: ");
        String firstName = sc.nextLine();
        sc.nextLine();

        System.out.println("Kérem a nemed: (f/n)");
        boolean sex = sc.nextLine().equalsIgnoreCase("f");
        sc.nextLine();

        String tiszetl = "Tisztelt " + lastName+ " " + firstName + " ";

        if (sex) {
            System.out.println(tiszetl + " Úr!");
        } else {
            System.out.println(tiszetl + " Asszony!");
        }

    }

    public static void adatok2 (String lastName, String firstName, boolean sex){
        String tiszetl = "Tisztelt " + lastName + " " + firstName + " ";

        if (sex) {
            System.out.println(tiszetl + " Úr!");
        } else {
            System.out.println(tiszetl + " Asszony!");
        }
    }

    public static String adatok3 (String lastName, String firstName, boolean sex){
        String male;
        if (sex) {
            male = " Úr!";
        } else {
            male= " Asszony!";
        }

        String tiszetl = "Tisztelt " + lastName + " " + firstName + male;


        return tiszetl;
    }

}
