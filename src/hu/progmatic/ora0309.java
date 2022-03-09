package hu.progmatic;

import java.util.Scanner;

public class ora0309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Adj meg 5 számot:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("A számaid: " + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
        int vegeredmeny = a + b + c + d + e;
        System.out.println("az összeg = " + vegeredmeny);

        // TÖMB == ARRAY ? TRUE!!!

        int[] ints = new int[5]; // 0,0,0,0,0,
        ints[0] = 23;
        ints[1] = 34;
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = {6, 7, 8, 9, 10};
        int number;

        int[] szamok ={3, 7, 13, 24};
        System.out.println(szamok[0] + "\n" + szamok[1] + "\n" + szamok[2] + "\n" + szamok[3]);
        szamok[0] = 1;
        System.out.println(szamok[0]);

        double[] duplak = new double[];
        boolean[] bulenek = new boolean[];
        String[] sztringek = new String[];
        System.out.println(duplak[0] + "\n" + bulenek[0] + "\n" + sztringek[0]);*/


        //int azta = 1;
        //String fdddb = String.valueOf(azta);

        /*
        System.out.println("Adj meg 5 számot:");
        int[] otSzam = new int[5];
        otSzam[0] = scanner.nextInt();
        otSzam[1] = scanner.nextInt();
        otSzam[2] = scanner.nextInt();
        otSzam[3] = scanner.nextInt();
        otSzam[4] = scanner.nextInt();
        System.out.println(otSzam[0] + "\n" + otSzam[1] + "\n" + otSzam[2] + "\n" + otSzam[3] + "\n" + otSzam[4]);
        int vegEredmeny = otSzam[0] + otSzam[1] + otSzam[2] + otSzam[3] + otSzam[4];
        System.out.println("Az eredmény: " + vegEredmeny);*/

        //char[] chars = new char[10];
        //System.out.println(chars[10]);
        // JAVA EXCEPTIONS!!!

        /*
        int[] numbersA = {1, 2, 3, 4, 5};
        System.out.println(numbersA[0] + "\n" + numbersA[1] + "\n" + numbersA[2] + "\n" + numbersA[3] + "\n" + numbersA[4]);

        int index = 0;
        while (index < 5) {
            System.out.println(numbersA[index]);
            index++;
        }*/


        /*
        System.out.println("Hány darab számot szeretnél megadni?");
        int darab = scanner.nextInt();

        System.out.println("Adj meg " + darab + "db számot");
        int[] otSzam = new int[darab];

        int index = 0;
        while (index < darab) {
            otSzam[index] = scanner.nextInt();
            index++;
        }

        while (index < darab) {
            System.out.println(otSzam[index]);
            index++;
        }

        int utolsoSzam = otSzam[otSzam.length -1];
        System.out.println("Az első számod: " + otSzam[0]);
        System.out.println("Az utolsó számod: " + utolsoSzam);*/

        String[] strings = {"első", "második", "harmadik", "negyedik", "ötödik", "hatodik", "hetedik"};
        int db = strings.length;
        int i = 0;
        while (i < db) {
            System.out.println(strings[i]);
            i += 2;
        }

        while (i <= db) {
            System.out.println(strings[i]);
            i--;
        }

        int[] years = {1999, 1988, 2006, 1743, 965, 2022, 1349, 1582, 1222, 1876, 2001, 1946, 1482};
        int ye = years.length - 1;
        int r = 0;
        while (r < ye){
            if(){};
        }

    }
}
