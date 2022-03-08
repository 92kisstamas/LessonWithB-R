package hu.progmatic;

import java.util.Scanner;

public class ora0305stdin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(System.in.available());
        /*System.out.println("Kérek egy szöveget!");
        String szoveg = scanner.nextLine();
        System.out.println("A megadott szöveg: " + szoveg);
        System.out.println("Kérem a második szöveget!");
        String szoveg2 = scanner.nextLine();
        System.out.println("A második szöveg: " + szoveg2);*/

        System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();                          //ott marad  a "sor vége" karakter.
        scanner.nextLine();                                    // így már nem!
        System.out.println("A megadott szám: " + szam);
        System.out.println("Kérem a második szöveget!");
        String szoveg2 = scanner.nextLine();
        System.out.println("A második szöveg: " + szoveg2);
    }
}
