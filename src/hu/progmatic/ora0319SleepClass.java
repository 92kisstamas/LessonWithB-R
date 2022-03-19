package hu.progmatic;

import java.util.Scanner;

public class ora0319SleepClass {
    static int x= 1;
    static int y= 2;
    static int z= 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sugár alapján kör területe pi *r*r  // erdő területe


        /*int sum = addThree(1,2,3) + addThree(4,5,6);
        System.out.println(sum);

        System.out.println("Adj meg egy irányítószzámot: ");
        int irSz = sc.nextInt();
        sc.nextLine();
        System.out.println("itt laksz: " + cityName(irSz));
        int soprBp = 9400 - 1000; // xD


        System.out.println("Kerek erdő sugara? ");
        double sugar = sc.nextDouble();
        sc.nextLine();
        System.out.println("2. Kerek erdő sugara? ");
        double sugar1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Két kerek erdő területe: " + erdoTerulete(sugar) + erdoTerulete(sugar1));
        */

        System.out.println("Add meg az osztály létszámát, a még dolgozó, valamint a végzett tanulók számát:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        Sleep sleepingStudents = new Sleep(x, y, z);

        sleepingStudents.classStatus();

        /*System.out.println("alszik -> " + sleepingStudent());
        if (manyTired()){
            System.out.println("fáradt osztály");
        } else {
            System.out.println("fitt osztály");
        }*/

    }

    /*public static int addThree (int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum; // vagy (return num1 + num2+ num3;)
    }*/



    public static String cityName (int iranyitoSzam){
        String city = null;

        /*if (iranyitoSzam == 1000){
            city = "Budapest";
        } else if (iranyitoSzam == 4400){
            city = "Nyíregyháza";
        } else if (iranyitoSzam == 9400){
            city = "Sopron";
        } else if (iranyitoSzam == 9000){
            city = "Győr";
        } else {
            city = "0";
        }*/

        switch (iranyitoSzam){
            case 1000:
                city = "Bp";
                break;
            case 4400:
                city = "NYíregy";
                break;
            case 9400:
                city = "Sopron";
                break;
            case 9000:
                city = "Győr";
                break;
        }
        return city;
    }



    public static double erdoTerulete (double r){
        double terulet= Math.PI * r * r;
        return terulet;
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
