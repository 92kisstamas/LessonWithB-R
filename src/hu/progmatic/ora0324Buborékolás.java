package hu.progmatic;

import java.util.Arrays;

public class ora0324Buborékolás {
    public static void main(String[] args) {
        /*
        Virtuális programozási tétel: Buborékolás
        2 verzió
        -legkisebb elemet a tömb elejére mozgatja vagy
        -legnagyobb elemet a tömb végére
         */

        // Arrays.sort();  -  rendezés

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
                        -4, -9, 8, 8, 2, -3, 5
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

        arraySorting(temperatures);

        writing(temperatures, date);


    }

    public static void arraySorting (int[][] temperatures) {

        for (int i = 0; i < temperatures.length; i++) {

            for (int k = 0; k < temperatures[i].length-1; k++) {

                for (int j = 0; j < temperatures[i].length-1; j++) {
                    if(temperatures[i][j] > temperatures[i][j+1]){
                        int exchange = temperatures[i][j+1];
                        temperatures[i][j+1] = temperatures[i][j];
                        temperatures[i][j] = exchange;
                    }
                }
            }
        }
    }

    public static void writing (int[][] temperatures, String[] date) {
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                System.out.println((i+1) + ". city= " + date[j] + "\t -> " + temperatures[i][j] + "\t°C");
            }
        }
    }


}

