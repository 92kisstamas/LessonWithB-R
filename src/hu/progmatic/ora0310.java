package hu.progmatic;

import java.util.Scanner;

public class ora0310 {
    public static void main(String[] args) {
        double[] temperature = {13.2, 15.4, 18.0, 22.6, 27.4, 31.3, 35.1, 28.1, 25.9, 23.5};
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        Scanner sc = new Scanner(System.in);
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

        for (i = 0; i <= tripLength; i++) {
            System.out.println("The temperature on the " + days[i] + " day: " + temperature[i] + " C°");
            tripTemp += temperature[i]; average++;
        }

        double tripAverage = tripTemp / average;
        System.out.println("Average temperature during the trip: " + tripAverage + " C°");




    }
}
