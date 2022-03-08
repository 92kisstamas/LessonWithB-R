package hu.progmatic;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class ora0305tuz {

    public static boolean hajszarito() {
        return Math.random() < 0.5;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Hi!" + "\n" + "Date: " + date) + "\n" + ("Time: " + time));
        System.out.println("Nyomj entert a továbbhaladáshoz!");
        String mindegy = "";
        mindegy = scanner.nextLine();


        //1 perc -> 10 egység fa
        int tuzifa = 0;
        // Mennyi fád van?
        int tuifaMax = 200;
        int tuzifaMin = 1;
        Random randomNum = new Random();
        tuzifa = tuzifaMin + randomNum.nextInt(tuifaMax);
        System.out.println(tuzifa + " egyseg fád van.");


        int esoMax = 20;
        int esoMin = 0;
        int eso = esoMin + randomNum.nextInt(esoMax);

        boolean szaraz = hajszarito();
        if (szaraz){
            System.out.println("Most még száraz az idő.");
            if ((tuzifa / 10) > eso ){
                System.out.println("De esni fog az eső " + eso + " perc múlva!");
            }
        } else {
            System.out.println("Jelenleg esik az eső.");
        }

        mindegy = scanner.nextLine();

        boolean tuzMento = hajszarito();
        if (tuzMento){
            System.out.println("Van nálad egy hajszárító! ;)");
            szaraz = true;
        } else {
            System.out.println("És nincs nálad hajszárító. :(");
        }

        mindegy = scanner.nextLine();

        if(tuzifa >= 10 && (szaraz || tuzMento)){
            System.out.println("A tűz ég.");
            System.out.println(tuzifa / 10 + " percig még kitart");
        } else if (szaraz && eso > 0) {
            System.out.println("Gyűjts még " + (10 - tuzifa) + "db fát! Ez kevés a tűzrakáshoz...");
        } else {
            System.out.println("Ebből így nem lesz tűz...");
        }

        mindegy = scanner.nextLine();

        while (tuzifa >= 10 && szaraz && (eso > 0 || tuzMento)){
            System.out.println("A tűz még ég " + (tuzifa / 10) + " percig." + "(" + tuzifa + " fád van most.)");
            tuzifa -= 10;
            eso -= 1;
            if (eso == 0 && tuzMento){
                System.out.println("Esik, de a hajszárítód megmentett!!!...");
            } else if (eso == 0 && !tuzMento){
                System.out.println("Elkezdett esni az eső és hajszárító sincs nálad, maradt még " + tuzifa + "db fád.");
            }
        }

        System.out.println("Mararadt még " + tuzifa + " db fád! ;)");


    }
}
