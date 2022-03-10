package hu.progmatic;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Aora0307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> gyumolcsok = new ArrayList<>();
        System.out.println("Kérem a gyümölcsök darabszámát!");
        int darabSzam = scanner.nextInt();
        scanner.nextLine();

        while (gyumolcsok.size() < darabSzam) {
            System.out.println("Írj egy gyümölcsöt!");
            String gyumolcs;
            gyumolcs = scanner.nextLine();
            scanner.nextLine();
            gyumolcsok.add(gyumolcs);
            System.out.println(gyumolcsok.size() + " gyümölcsöt adtál meg eddig, még " + (darabSzam - gyumolcsok.size()) + " hiányzik a listádról.");
        }
        System.out.println("Beírtad a " + darabSzam + "db gyümölcsöt");




        /*
        String szoveg = "";
        String darab;

        do {
            System.out.println("Kérem a következő darabot!");
            darab= scanner.nextLine();
            szoveg += darab;
        } while (darab.length() > 0); // !darab.equals("")

        System.out.println("A megadott szöveg: " + szoveg);
        */


        //Arfolyam

        System.out.println("Adj meg egy stop-loss értéket: (0-20)");
        int stopLoss = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kezdőérték: (0-20)");
        int kezdoErtek = scanner.nextInt();
        scanner.nextLine();
        int jelenlegiArfolyam = kezdoErtek;
        int napok = 0;
        String mindegy;
        int valt = 0;

        while (jelenlegiArfolyam >= stopLoss) {
            System.out.println("Add meg az árfolyam változását, a " + napok + ". napon");
            int valtozas = scanner.nextInt();
            scanner.nextLine();
            jelenlegiArfolyam += valtozas;
            System.out.println("A jelenlegi árfolyam: " + jelenlegiArfolyam);
            napok++;
        }

        System.out.println("Stop-loss opciód aktiválódott,\nha felmegy az árfolyam, új stop-loss-t állíthatsz.\n(nyomj Enter-t/)");

        scanner.nextLine();

        do {
            jelenlegiArfolyam += ranPluArfVal();
            System.out.println("Változott az árfolyam. A " + napok + ". napon.(" + jelenlegiArfolyam + ")");
            napok++;
        } while (jelenlegiArfolyam <= kezdoErtek);
        {
            jelenlegiArfolyam += ranPluArfVal();
            System.out.println("Változott az árfolyam. A " + napok + ". napon.(" + jelenlegiArfolyam + ")");
            napok++;
        }

        System.out.println("A jelenlegi árfolyam: " + jelenlegiArfolyam + ". Szeretnél új Stop-loss értéket megadni? (I/N)");
        String yesOrNo = scanner.nextLine();
        scanner.nextLine();

        if (yesOrNo.equalsIgnoreCase("i")) {
            System.out.println("Add meg az új stop-loss értéket:");
            stopLoss = scanner.nextInt();
            scanner.nextLine();
            while (jelenlegiArfolyam >= stopLoss) {
                jelenlegiArfolyam += ranArfVal();
                System.out.println("Változott az árfolyam. A " + napok + ". napon.(+" + jelenlegiArfolyam + ")");
                napok++;
            }
        } else {
            System.out.println("További szép napot!");


            //Irányítószám
        /*
        int iranyitoSzam;

        do {
            System.out.println("Kérem az irányítószámot:");
            iranyitoSzam = scanner.nextInt();
            scanner.nextLine();
            if(iranyitoSzam < 1000 || iranyitoSzam > 9999) {
                System.out.println("Az irányítószámnak 1000 és 9999 között kell lennie.");
            }
        } while (iranyitoSzam < 1000 || iranyitoSzam > 9999); // de-morgan azonosság
        System.out.println("Az érvényes irányítószám: " + iranyitoSzam);
        */


            //Abszolút érték             Ternaris / háromlábú   operátorok
        /*
        System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        scanner.nextLine();
        int abszolut = szam >= 0 ? szam : -szam;
        System.out.println("A szám abszolút értéke: " + abszolut);
        System.out.println(Math.abs(szam));
         */

        }
    }

        public static int ranArfVal () {
            Random randomNum = new Random();
            int valtMax = 0;
            int valtMin = -5;
            int valt = valtMin + randomNum.nextInt(valtMax);
            return valt;
        }

        public static int ranPluArfVal () {
            Random randomNum = new Random();
            int valtMax = 5;
            int valtMin = 0;
            int valt = valtMin + randomNum.nextInt(valtMax);
            return valt;
        }

}
