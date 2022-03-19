package hu.progmatic;

import java.util.Random;
import java.util.Scanner;

public class ora0319Flezesiido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*készíts egy metódust amelyik megadja hány int felezéso odő elteltével csökken egy izotóp
        a metódus kettő paramétert kap double kezdeti aktivitás és double elvárt szint

        <=20 (akkor biztonságos)
        200
        100
        50
        25
        12.5        scannerrel olvassuk be az értékeket és írjuk ki az eltelt felezési idők számát
                    + hozzunk létre egy halflives nevű metódust a megfelelő paraméterekkel és visszatérési értékekkel.
                    a tényleges számítást a metóduson belül végezzük el. Az értékeket továbbra is kérjük be,
                    valamint a kiiras is a main metóduson belül kérjük be.


        Baktériumok mennyi idő alatt szaporodnak el a baktériumok
        -kezdeti szám
        -elvárt
        -duplázási idő

        */

        int radiationLevel = 1000;
        int safe = 20;
        System.out.println("A helyiség sugárzási szintje jelenleg: " + radiationLevel
                + "\n A biztonságos szint: " + safe + "\nTaláltál egy védőfelszerelést \n " +
                "(Nyomj entert hogy megnézd mennyi bír!)");

        String mindegy = sc.nextLine();

        int defense = safe + equipment();
        System.out.println("A random védőfelszereléssel " + defense + " értékű sugárzás ellen védve vagy.");
        boolean enter = false;

        while (!enter){
            System.out.println("Belépsz a helyiségbe? (i/n) \n ...vagy megvárod a következő felezési időt?");
            String e = sc.nextLine();
            sc.nextLine();
            enter = e.equalsIgnoreCase("i");
            if (!enter && defense < radiationLevel){
                radiationLevel /= 2;
                System.out.println("(Vártál) \nA sugárzás lecsökkent: " + radiationLevel);
            } else if (enter && defense < radiationLevel){
                System.out.println("A védelmed kevés volt, megölt a sugárzás!");
                break;
            } else if (!enter && defense > radiationLevel){
                System.out.println("(Megfelelő a sugárzási szint, belépsz a helyiségbe? (i/n))");
                String f = sc.nextLine();
                sc.nextLine();
                if (f.equalsIgnoreCase("n")){
                    System.out.println("Kifutottál az időből és elbuktad a küldetést! :(");
                    break;
                } else {
                    System.out.println("Túlélted hogy bejutottál! \n Gratulálok, elég türelmes voltál!");
                    break;
                }
            } else if (defense > radiationLevel){
                System.out.println("Túlélted hogy bejutottál! \n Gratulálok, elég türelmes voltál!");
                break;
            }
        }








        /*while (radiationLevel > safe) {
            System.out.println(i + "x-es felezési idő, a sugárzási szint: " + radiationLevel);
            radiationLevel /= 2;
            i++;
        }
        System.out.println("megfelelő a sugárzási szint! (" + radiationLevel + ")");*/

        /*System.out.println("Baktériumok kezdeti száma:");
        int baciStart = sc.nextInt();
        sc.nextLine();
        System.out.println("Elvárt száma:");
        int baciElvárt = sc.nextInt();
        sc.nextLine();
        int n = 0;

        while (baciStart < baciElvárt) {
            System.out.println("A(z) " + n + ". tenyészet után a baktériumok száma: " + baciStart);
            baciStart *= 2;
            n++;
        }
        System.out.println("A baktériumok száma meghaladta az elvárt értéket (" + baciElvárt + ") -> "
                + n + ". tenyészet után.\n A jelenlegi baktériumok száma: " + baciStart);
         */

    }

    /*public static void radiation (int rlevel, int safe){
        int i = 0;
        while (rlevel > safe) {
            System.out.println(i + "x-es felezési idő, a sugárzási szint: " + rlevel);
            int rLevel = 2;
            i++;
        }
        System.out.println("Megfelelő a sugárzási szint! (" + rlevel + ")");
    }*/

    public static int equipment (){
        int max = 150;
        int min = 1;
        Random r1 = new Random();
        int protectiveEquipment = r1.nextInt(max);
        return protectiveEquipment;
    }

}
