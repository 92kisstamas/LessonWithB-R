package hu.progmatic;

import java.util.ArrayList;
import java.util.Scanner;

public class ora0310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        double[] temperature = {13.2, 15.4, 18.0, 22.6, 27.4, 31.3, 35.1, 28.1, 25.9, 23.5};
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        System.out.println("Enter the length of the trip:  (1-10)");
        int tripLength = sc.nextInt();
        sc.nextLine();
        int i = 0;
        double tripTemp = 0;
        int average = 0;

        /*do {
            System.out.println("The temperature on the " + days[i] + " day: " + temperature[i] + " C°");
            i++;
        } while (i <= tripLength); {
            System.out.println("The temperature on the " + days[i] + " day: " + temperature[i] + " C°");
            i++;
        }*/

        /*
        for (i = 0; i <= tripLength; i++) {
            System.out.println("The temperature on the " + days[i] + " day: " + temperature[i] + " C°");
            tripTemp += temperature[i]; average++;
        }

        double tripAverage = tripTemp / average;
        System.out.println("Average temperature during the trip: " + tripAverage + " C°");

        for (i = 0; i < tripLength; i++) {
            System.out.println("Different temperatures on the " + days[i] + " day:");
            temperature[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (i = 0; i <= tripLength; i++) {
            if (i % 2 != 0) {
                System.out.println("The " + days[i] + " day odd.");
            } else {
                System.out.println("The " + days[i] + " day even.");
            }
        }

        for (i = 0; i <= 10; i++) {
            temperature[i] = 0.0;
        }

        System.out.println("End!");*/

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        System.out.println("How many numbers would you like to add?");
        int numberOfNumbers = sc.nextInt();
        sc.nextLine();
        int i = 0;

        for (i = 1; i <= numberOfNumbers; i++) {
            System.out.println("Add the " + i + ". number:");
            numbers.add(sc.nextInt());
            sc.nextLine();
        }

        for (i = 0; i <= numberOfNumbers; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            } else {
                oddNumbers.add(numbers.get(i));
            }
        }




    }
}
