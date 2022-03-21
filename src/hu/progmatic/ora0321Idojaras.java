package hu.progmatic;

import javax.sound.midi.Soundbank;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ora0321Idojaras {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    static int[][] homersekletek = {
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

    public static void main(String[] args) {

        /*
        double t = 0;
        int r = 0;
        int[] a = {2, 4, 4, 0, -5, -5, -7, -4, -3, -8, -8, -2, -3, 6,5, 2,
                1, 0, 5, -8, -7, -4, -4, -8, -8, 3, -5, -2, 2, 3, 3, 3, 2,
                0, -3, -4, -9, 8, 8, 2, -3, 5};
        for (int i = 0; i < a.length; i++) {
            t += a[i];
            r++;
        }
        double e = t / r;
        System.out.println(e);
        --------------    -1.0     --------------*/


        /*
        int bp3 = homersekletek[0][2];
        System.out.println(bp3);

        System.out.println("Debrecen, január 3.: " + homersekletek[1][2] + "°C");
        System.out.println("Sopron, január 3.: " + homersekletek[2][2] + "°C");
        System.out.println("Bp, Debrecen, Sopron, január 3.: "
                + homersekletek[0][3] + "°C"
                + ", " + homersekletek[1][3] + "°C"
                + ", " + homersekletek[2][3] + "°C");

        int[] homersekletSopron = homersekletek[2];
        System.out.println("Sopron, január 7.: " + homersekletSopron[6] + "°C");
        */

        /*
        int fagyosNapokSzama = 0;
        int leghidegebbNap = 0;
        int leghidegebbHomerseklet = 0;
        double atlagHom = 0.0;
        int z = 0;
        /*for (int i = 0; i < homersekletek[2].length; i++) {
            System.out.println("Sopron, január " + (i+1) + ".: " + homersekletek[2][i] + "°C");
        }

        for (int i = 0; i < homersekletek[2].length; i++) {
            if (homersekletek[2][i] < 0){
                fagyosNapokSzama += 1;
            }
            if (homersekletek[2][i] < leghidegebbHomerseklet){
                leghidegebbHomerseklet = homersekletek[2][i];
                leghidegebbNap = i +1;
                atlagHom += homersekletek[2][i];
                z++;
            }
        }
        atlagHom /= z;

        System.out.println("Soproni fagyos napok száma: " + fagyosNapokSzama + "db."
                + "\n A leghidegebb nap: " + leghidegebbNap + "."
                + "\n A hőfok: " + leghidegebbHomerseklet + "°C"
                + "\n Az átlaghőmérséklet: " + atlagHom + "°C");
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a várost:\n\tBudapest: 0\n\tDebrecen: 1\n\tSopron: 2" );
        int varosindex = sc.nextInt();
        sc.nextLine();

        while (varosindex != 0 && varosindex != 1 && varosindex !=2){
            System.out.println("Nem létezik ilyen város... 0, 1 vagy 2...    o.0");
            varosindex = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Mit szeretnél tudni?\n\tFagyos napok: '0' (0°C alatt)" +
                "\n\tJanuári átlaghőmérséklet: '1' ");
        int valasz = sc.nextInt();
        sc.nextLine();

        while (valasz != 0 && valasz != 1){
            System.out.println("Micsinálsz? .... próbáld újra! 0 vagy 1! ...   0.o");
            valasz = sc.nextInt();
            sc.nextLine();
        }

        df.setRoundingMode(RoundingMode.DOWN);

        if (valasz == 0){
            answer(varosindex);
        } else if (valasz == 1){
            System.out.println("Az átlag hőmérséklet: " + df.format(atlaghomerseklet(varosindex)) + "°C");
        }

        System.out.println("\n\tA három város átlaghőmérséklete: " + String.format("%.2f",threeCity()) + "°C");

        System.out.println("\n\tÖsszes fagyos nap: " + osszfagyos());

        System.out.println("\n\tLegalacsonyabb hőfok: " + minimum() + "°C");

        System.out.println("\n\tLegmagasabb hőfok: " + maximum() + "°C");

        int refHom = 20;
        boolean voltEMelegebb = false;

        for (int i = 0; i < homersekletek.length; i++) {
            for (int j = 0; j < homersekletek[i].length; j++) {
                if (homersekletek[i][j] > refHom){
                    voltEMelegebb = true;
                    break;
                }
            }

        }
        System.out.print("\n\tVolt melegebb " + refHom + "°C-tól?\n\t-> ");
        if (voltEMelegebb){
            System.out.print("VOLT");
        } else {
            System.out.print("NEM");
        }


    }

    public static void answer (int city){
        int fagyosNapokSzama = 0;
        int leghidegebbNap = 0;
        int leghidegebbHomerseklet = 0;
        double atlagHom = 0.0;
        int z = 0;

        for (int i = 0; i < homersekletek[city].length; i++) {
            if (homersekletek[city][i] < 0){
                fagyosNapokSzama += 1;
            }
            if (homersekletek[city][i] < leghidegebbHomerseklet){
                leghidegebbHomerseklet = homersekletek[city][i];
                leghidegebbNap = i +1;
                atlagHom += homersekletek[city][i];
                z++;
            }
        }
        atlagHom /= z;

        System.out.println("Soproni fagyos napok száma: " + fagyosNapokSzama + "db."
                + "\n A leghidegebb nap: " + leghidegebbNap + "."
                + "\n A hőfok: " + leghidegebbHomerseklet + "°C"
                + "\n Az átlaghőmérséklet: " + df.format(atlagHom) + "°C");
    }

    public static double atlaghomerseklet (int city){
        double atlag = 0;
        int z = 0;
        for (int i = 0; i < homersekletek[city].length; i++) {
            atlag += homersekletek[city][i];
            z++;
        }
        atlag /= z;
        return atlag;
    }

    public static double threeCity (){
        double atlag = 0;
        int z = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < homersekletek[i].length; j++) {
                atlag += homersekletek[i][j];
                z++;
            }
        }
        atlag /= z;
        return atlag;
    }

    public static int osszfagyos () {
        int z = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            for (int j = 0; j < homersekletek[i].length; j++) {
                if (homersekletek[i][j] < 0){
                    z++;
                }
            }
        }
        return z;
    }

    public static int minimum (){
        int z = 0;
        for (int i = 0; i < homersekletek.length; i++) {
            for (int j = 0; j < homersekletek[i].length; j++) {
                if (homersekletek[i][j] < z){
                    z = homersekletek[i][j];
                }
            }
        }
        return z;
    }

    public static int maximum (){
        int z = 0;
        for (int i = 0; i < homersekletek.length; i++) {

            //int adottvaros = 0;

            for (int j = 0; j < homersekletek[i].length; j++) {
                if (homersekletek[i][j] > z){
                    z = homersekletek[i][j];
                    //adottvaros++;
                }
            }
            //System.out.println(i + "-ban a fagyos napok száma: " + adottvaros);
        }
        return z;
    }

}
