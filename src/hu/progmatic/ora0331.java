package hu.progmatic;

import java.util.Arrays;
import java.util.Locale;

public class ora0331 {
    public static void main(String[] args) {
        String[] csv = {
                "Budapest;2022.01.01;-9",
                "Győr;2022.01.01;0",
                "Sopron;2022.01.01;-2",
                "Győr;2022.01.02;-8",
                "Sopron;2022.01.02;-7",
                "Budapest;2022.01.03;-2",
                "Győr;2022.01.03;-5",
                "Sopron;2022.01.03;-4",
                "Budapest;2022.01.04;19",
                "Győr;2022.01.04;10",
                "Sopron;2022.01.04;8",
                "Budapest;2022.01.05;9",
                "Győr;2022.01.05;5",
                "Sopron;2022.01.05;5"
        };

        // String[] fields = csv[0].split(";");   ((";"-jelnél  szétszedi a stringeket))
        System.out.println("Budapest".substring(0,3).toUpperCase());

        //az első index a kezdő érték, az utolsó a záró érték, az utolsó a záró : "Bud"


        // 1. feladat: tömbök feltöltése CSV-ből
        String[] fields = csv[0].split(";");
        String[] cities = new String[csv.length];
        String[] dates = new String[csv.length];;
        int[] temperatures = new int[csv.length];;

        for (int i = 0; i < csv.length; i++) {
            String[] values = csv[i].split(";");
            cities[i] = values[0].trim();
            dates[i] = values[1].trim();
            temperatures[i] = Integer.parseInt(values[2].trim());
        }

        /*
        // 2. feladat: az értékek kiírása for-ciklussal
        String info = null;
        for (int i = 0; i < csv.length; i++) {
            info = cities[i].substring(0,3).toUpperCase()
                    + " " + dates[i].substring(5)
                    + ": " + temperatures[i] + " fok";
            System.out.println(info);
        }
        */

        // 3. feladat: buborékolás   // Növekvő sorrend
        int temp = 0;
        for (int j = 0; j < temperatures.length-1; j++) {

            //OPTIMALIZÁCIÓ
            boolean sorted = true;


            for (int i = 0; i < temperatures.length-1; i++) {
                if (temperatures[i] > temperatures[i+1]){
                    temp = temperatures[i];
                    temperatures[i] = temperatures[i+1];
                    temperatures[i+1] = temp;
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }

        System.out.println(Arrays.toString(temperatures));


    }
}
