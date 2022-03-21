package hu.progmatic;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.ArrayList;


public class A_Collection {

    static int x= 1;
    static int y= 2;
    static int z= 3;


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(("Hi!" + "\n" + "Date: " + date) + "\n" + ("Time: " + time));
        Scanner sc = new Scanner(System.in);

        float f = 10 / 3F;   //a float és a double között a kiszámolt tizedesek száma a különbség,

//if (name.equalsIgnoreCase("Ria") || name.equalsIgnoreCase("Balázs"))

        /*switch (grade){
            case 1:
                System.out.println("ELÉGTELEN!");
                break;}*/

        int tuifaMax = 200;
        int tuzifaMin = 1;
        Random randomNum = new Random();
        int tuzifa = tuzifaMin + randomNum.nextInt(tuifaMax);

//++evek; // evek++ - a régi érték kerül behelyettesítésre // ++evek - az új érték kerül

        int szam = sc.nextInt();        //ott marad  a "sor vége" karakter.
        sc.nextLine();                  // így már nem!

        /* STDIN - scanner -> Szia = S, z, a, <-, i, a,
           STDOUT - sout -> végleges változat kimenetele */

/*
        if (!fullTime.equalsIgnoreCase("igen") && workTime < 36){     // De- morgan azonosság
            System.out.println("Főállású");
        } else {
            System.out.println("Mellékállású");
        }
*/

        ArrayList<String> gyumolcsok = new ArrayList<>();

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

/*
        while (jelenlegiArfolyam >= stopLoss) {
            System.out.println("Add meg az árfolyam változását, a " + napok + ". napon");
            int valtozas = scanner.nextInt();
            scanner.nextLine();
            jelenlegiArfolyam += valtozas;
            System.out.println("A jelenlegi árfolyam: " + jelenlegiArfolyam);
            napok++;
        }
*/


        System.out.println("Add meg az osztály létszámát, a még dolgozó, valamint a végzett tanulók számát:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        Sleep sleepingStudents = new Sleep(x, y, z);

        sleepingStudents.classStatus();

/*----------------------------Többdimenziós tömbök----------------------------

        System.out.println("Bp, Debrecen, Sopron, január 3.: "
                + homersekletek[0][3] + "°C"
                + ", " + homersekletek[1][3] + "°C"
                + ", " + homersekletek[2][3] + "°C");
*/


    }

    public static int calculateNet(int gross){
        int net = (gross * 665) / 1000;
        return net;
    }

    public static void sum (int num1, int num2){
        System.out.println("1. szám: " + num1);
        System.out.println("2. szám: " + num2);
        System.out.println("Összeg: " + num1 + num2);
    }

    public static <y, x, z> int sleepingStudent (){
        int notRiseHand = x - y - z;
        return notRiseHand;
    }
    public static <y, x, z> boolean manyTired (){
        boolean tiredClass = (x - y -z) > x /4;
        return tiredClass;
    }

}

/*
    ---------------------------------------DOUBLE -> 2 Tizedesig--------------------------------

    import java.math.RoundingMode;
    import java.text.DecimalFormat;  // class importálás

    private static final DecimalFormat df = new DecimalFormat("0.00");  // main cikluson kívül

    double input = 3.14159265359;                  //  up/down kerekítés

        System.out.println("double : " + input);
                System.out.println("double : " + df.format(input));    //3.14

                // DecimalFormat, default is RoundingMode.HALF_EVEN
                df.setRoundingMode(RoundingMode.DOWN);
                System.out.println("\ndouble (RoundingMode.DOWN) : " + df.format(input));  //3.14

                df.setRoundingMode(RoundingMode.UP);
                System.out.println("double (RoundingMode.UP)  : " + df.format(input));

      ------------    Stringgel   ----------
      double input = 3.14159265359;
      System.out.println("double : " + input);
      System.out.println("double : " + String.format("%.2f", input));
      System.out.format("double : %.2f", input);

*/
