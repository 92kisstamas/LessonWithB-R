package hu.progmatic;

import java.util.Scanner;

public class ora0305tozsde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mennyi pénzed van?");
        int torzstoke = scanner.nextInt();
        scanner.nextLine();
        int sajatPenz = torzstoke;
        int evek = 0;

        /*
        if (akármi) (sout) ez is lefut - {} - nélkül
               (sout) vagy ez is...*/

        int nyereseg = 0;

        while (sajatPenz >= 3_000_000){
            System.out.println("Mennyi volt idén a nyereség?");


            /*String bemenet = scanner.nextLine();
            if (!bemenet.equalsIgnoreCase("vége")){
                nyereseg = Integer.parseInt(bemenet);
                sjatToke+= nyereseg
                } else
            }*/
            int aktualPlussz = scanner.nextInt();
            scanner.nextInt();

            sajatPenz += nyereseg;
            System.out.println("Mennyi volt a kiadás?");
            int aktualMinusz = scanner.nextInt();
            scanner.nextInt();
            System.out.println("A cég nyeresége a/az " + evek + " éven: " + (aktualPlussz - aktualMinusz));
            ++evek; // evek++ - a régi érték kerül behelyettesítésre // ++evek - az új érték kerül
            System.out.println("Év végi elszámolás: " + (sajatPenz + (aktualPlussz - aktualMinusz)));
            sajatPenz += aktualPlussz - aktualMinusz;
        }
        System.out.println("Nincs elég tőkéd...");

    }
}
