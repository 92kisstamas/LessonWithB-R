package hu.progmatic;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ora0328ForEach {

    static String[] cities = {"Budapest", "Debrecen", "Sopron"};

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        df.setRoundingMode(RoundingMode.DOWN);

        int[][] temperatures = {
                {// Budapest
                        2, 4, 4, 0, -5, -5, -7,
                        -4, -3, -8, -8, -2, -3, 6
                },
                {// Debrecen
                        5, 2, 1, 0, 5, -8, -7,
                        -4, -4, -8, -8, 3, -5, -2
                },
                { // Sopron
                        2, 3, 3, 3, 2, 0, -3,
                        -4, -9, 8, 8, 2, -15, 15
                }
        };

        String[] date = {
                "2022.01.01",
                "2022.01.02",
                "2022.01.03",
                "2022.01.04",
                "2022.01.05",
                "2022.01.06",
                "2022.01.07",
                "2022.01.08",
                "2022.01.09",
                "2022.01.10",
                "2022.01.11",
                "2022.01.12",
                "2022.01.13",
                "2022.01.14",
        };

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Addj meg egy alsó értéket:");
        int lowerValue = sc.nextInt();
        sc.nextLine();

        System.out.println("Adj meg egy felső értéket:");
        int upperValue = sc.nextInt();
        sc.nextLine();*/

        int lowerValue = -14;

        int upperValue = 14;


        /*if (itWasColder(lowerValue, temperatures)) {
            System.out.println("Volt hidegebb.");
        } else {
            System.out.println("Nem volt hidegebb.");
        }
        ;

        if(itWasWarmer(upperValue, temperatures)){
            System.out.println("Volt melegebb.");
        } else {
            System.out.println("Nem volt melegebb.");
        };*/


        //coldestDay(temperatures, date);
        //hottestDay(temperatures, date);

        //System.out.println("Maximum hőmérséklet: " + maxTemp(temperatures));
        //System.out.println("Minimum hőmérséklet: " + minTemp(temperatures));

        evenDaysAverage(temperatures);



    }

    public static boolean itWasColder(int reference, int[][] doubleArray) {
        boolean itWas = false;
        boolean fullArray = false;
        int i = 0;

        for (int k : doubleArray[i]) {
            if (k == 0) {
                break;
            } else {
                for (int j : doubleArray[i]) {
                    if (j < reference) {
                        itWas = true;
                        break;
                    }
                }
                if (i < doubleArray.length && !itWas) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return itWas;
    }


    public static boolean itWasWarmer (int reference, int[][] doubleArray){
        boolean itWas = false;
        int i = 0;

        for (int k : doubleArray[i]) {
            if (k == 0) {
                break;
            } else {
                for (int j : doubleArray[i]) {
                    if (j > reference) {
                        itWas = true;
                        break;
                    }
                }
                if (i < doubleArray.length && !itWas) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return itWas;
    }



    public static void coldestDay (int[][] doubleArray, String[] date) {
        int coldest = 0;
        int dayCounter = 0;
        int cityCounter = 0;
        int i = 0;

        for (int k : doubleArray[i]) {
            if (k == 0) {
                break;
            } else {
                for (int j = 0; j < doubleArray[i].length; j++) {
                    if (doubleArray[i][j] < coldest) {
                        coldest = doubleArray[i][j];
                        dayCounter = j;
                        cityCounter = i;
                    }
                }
                i++;

            }
        }

        System.out.println("A leghidegebb: " + date[dayCounter] + "-napon volt, "
                + cities[cityCounter] + " városban, "
                + coldest + "°C-fok.");

    }


    public static void hottestDay (int[][] doubleArray, String[] date) {
        int hottest = 0;
        int dayCounter = 0;
        int cityCounter = 0;
        int i = 0;

        for (int k : doubleArray[i]) {
            if (k == 0) {
                break;
            } else {
                for (int j = 0; j < doubleArray[i].length; j++) {
                    if (doubleArray[i][j] > hottest) {
                        hottest = doubleArray[i][j];
                        dayCounter = j;
                        cityCounter = i;
                    }
                }
                i++;

            }
        }

        System.out.println("A legmelegebb: " + date[dayCounter] + "-napon volt, "
                + cities[cityCounter] + " városban, "
                + hottest + "°C-fok.");

    }


    public static int maxTemp (int[][] temperatures){
        int temp = 0;
        int i = 0;

        for (int k = 0; k < temperatures.length; k++){
            for (int j = 0; j < temperatures[k].length; j++){
                if (temp < temperatures[k][j]){
                    temp = temperatures[k][j];
                }
            }
        }

        return temp;
    }


    public static int minTemp(int[][] temperatures){
        int temp = 0;
        int i = 0;

        for (int k = 0; k < temperatures.length; k++){
            for (int j = 0; j < temperatures[k].length; j++){
                if (temp < temperatures[k][j]){
                    temp = temperatures[k][j];
                }
            }
        }

        return temp;
    }


    public static void evenDaysAverage (int[][] doubleArray){
        double amount = 0;
        int counter = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if (j % 2 == 0) {
                    amount += doubleArray[i][j];
                    counter++;
                }
            }
        }
        double average = amount / counter;
        System.out.println("Paros napok átlaghőmérséklete: " + df.format(average));;
    }



}
