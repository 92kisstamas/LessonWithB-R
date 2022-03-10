package hu.progmatic;

import java.util.Scanner;

public class ora0310OMSZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        /*
        System.out.println("Enter the number of days:");
        int numberOfDays = sc.nextInt();
        sc.nextLine();

        int[] daysAndTemps = new int[numberOfDays];

        for ( i = 0; i < numberOfDays; i++){
            System.out.println("");
        }*/

        System.out.println("Kérema a hőmérsékleteket:");
        String bemenet = sc.nextLine();
        String[] adatok = bemenet.split(" ");
        int[] homersekletek = new int[adatok.length];
        int negativ = 0;
        int forro = 0;
        double homersekletAtlag = 0;

        for (i=0; i < homersekletek.length; i++){
            homersekletek[i] = Integer.parseInt(adatok[i]); //
            homersekletAtlag += homersekletek[i];
        }

        for (i=0; i < homersekletek.length; i++){
            if (homersekletek[i] < 0) {
                negativ++;
            }
        }
        System.out.println(negativ + " db hideg nap volt.");

        for (i=0; i < homersekletek.length; i++){
            if (homersekletek[i] > 30) {
                forro++;
            }
        }
        System.out.println(forro + " db forró nap volt.");

        double average = homersekletAtlag / homersekletek.length;
        System.out.println("Az átlag: " + average + " C°");

        for (i=0; i < homersekletek.length; i++){
            if(homersekletek[i] < -10){
                System.out.println("Volt nagyon hideg nap!");
                break;
            }
        }

        for (i=0; i < homersekletek.length; i++){
            if(homersekletek[i] > 40){
                System.out.println("Volt nagyon meleg nap!");
                break;
            }
        }


    }
}
