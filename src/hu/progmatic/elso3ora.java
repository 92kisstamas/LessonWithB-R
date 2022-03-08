package hu.progmatic;

import java.util.Scanner;

public class elso3ora {
    //psvm
    public static void main(String[] args) {
        /*ELSŐ ÓRA

        System.out.println("Hello World!");
        String nev = "Tamás";
        String koszones = "Szia" + nev + "!";
        System.out.println(koszones);*/

        /*int szuletesiEv = 1992;
        int aktualisEv = 2022;
        int eletkor;
        eletkor = aktualisEv - szuletesiEv;
        System.out.println(eletkor);*/

        /*int a = 5;
        int b = 10;
        int terulet = a * b;
        System.out.println("A téglalap területe: " + terulet + " négyzetcentiméter.");*/
        //sout

        /*int torzsToke = 3000000;
        int toke = torzsToke;
        int eredmeny1 = 200000;
        int eredmeny2 = -100000;
        int eredmeny3 = 500000;
        System.out.println("Törzstőke: " + torzsToke);
        System.out.println("0. év: " + toke);
        System.out.println("1. év: " +  (toke = toke + eredmeny1));
        System.out.println("2. év: " + (toke = toke + eredmeny2));
        System.out.println("3. év: " +(toke = toke + eredmeny3));
        System.out.println("Az eddigi nyereség: " + (toke - torzsToke) + "Ft.");*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Mi a vazetékneved?");
        String vezetekNev = "Mr. " + scanner.nextLine();
        System.out.println("Mi a keresztneved?");
        String keresztNev = scanner.nextLine();
        String nev = vezetekNev + " " + keresztNev;
        System.out.println("Szia " + nev + "!" );

        System.out.println("Kérem a számot!");
        int szam = scanner.nextInt();
        int eredmeny = szam * szam;
        System.out.println("A szám négyzete: " + eredmeny);
        if (szam  < 0) {
            int eredmeny1 = szam * -1;
            System.out.println("A szám abszolút értéke: " + eredmeny1);*/

        //MÁSODIK ÓRA

        /*
        System.out.println("Szia Ria!");
        int number1 = 2;
        int number2 = 3;
        int number3 = 2;
        System.out.println(number1 == number3);
        if(number1 == number3){
            System.out.println("Számok összehasonlítása a dupla egyenlőségjellel (==)");
        }
        String text1 = "kiscica";
        String text2 = "kiscica";
        System.out.println(text1.equals(text2));
        switch(text1){
            case "nagycica":
                System.out.println("Huhhh");
                break;
            case "kiscica":
                System.out.println("Így jó a switch");
                break;
        }
        if(number1 == number3 && text1.equals(text2)){
            System.out.println("Dupla feltét ;)");
        }*/

        // primitív egész szám adattípus:
        // byte short int long
        /*
        byte b1 = -128; //min
        byte b2 = 127; //max
        int i = 2140000; //majdnem max
        float f = 10 / 3F;   /*a float és a double között a kiszámolt tizedesek száma a különbség,
        de nem pontos!
        double d = 10 / 3D;
        System.out.println(f);
        System.out.println(d);

        char first = 'P';
        char second = 'I';
        System.out.println(first + "" + second);
        System.out.println(String.valueOf(first) + second);

        //boolean true vagy false lehet...
        boolean a = true;
        boolean b = false;
        boolean myboolean = 2 < 3;

        int numberFirst = 5;
        int numberSecond = 6;
        String textFirst= " szöveg ";
        System.out.println(numberFirst + numberSecond + textFirst); // 11 szöveg
        System.out.println(textFirst + numberFirst + numberSecond); // szöveg 56
        System.out.println(textFirst + (numberFirst + numberSecond)); // szöveg 11 */
        /*
        Scanner scannerFirst = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        int firstNumber = scanner.nextInt();
        Scanner scannerSecond = new Scanner(System.in);
        System.out.println("Add meg a második számot is!");
        int secondNumber = scanner.nextInt();
        System.out.println("Összeg: " + (firstNumber + secondNumber));
        System.out.println("Különbség: " + (firstNumber - secondNumber));
        System.out.println("Szorzata: " + (firstNumber * secondNumber));
        System.out.println("Hányada: " + (firstNumber / secondNumber));*/


        //HARMADIK ÓRA

        /*
        System.out.println("Első szám: ");
        int firstNum = scanner.nextInt();
        System.out.println("Második szám: ");
        int secondNum = scanner.nextInt();
        int osszeg = 0;


        //int osszeg = firstNum + secondNum;
        //System.out.println("Összeg: " + osszeg);

        // szam1 = -3, szam2 = 4 -> eredmeny = 4
        // szam1 = -2, szam2 = -4 -> eredmeny = 0
        // szam1 = 2, szam2 = 5 -> eredmeny = 7

        if(firstNum > 0){
            osszeg = osszeg + secondNum;
            System.out.println(osszeg);
        }
        if(secondNum > 0) {
            osszeg = osszeg + secondNum;
            System.out.println(osszeg);
        }*/

        /*System.out.println("Hány éves ön?");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Itt a söröd! :D");
        } if else (age >=21){
            System.out.println("Már amcsiban is ihatsz! ;)");
        } else {
            System.out.println("Téged nem szolgálunk ki! :(");
        }


        if(firstNum >= secondNum){
            osszeg = firstNum;
        } else {
            osszeg = secondNum;
        }
        System.out.println("A nagyobb szám a " + osszeg);

        System.out.println("Add meg a víz hőmérsékletét: ");
        int waterC = scanner.nextInt();
        if(waterC < 0){
            System.out.println("Jégből vagyoook... ");
        } else if (waterC >= 0 && waterC < 100){
            System.out.println("Folyékony...");
        } else {
            System.out.println("Gőzmozdonyhoz is jó ;) :D ");
        }

        System.out.println("Érettségi eredményed százalékban?");
        int erettsegi = scanner.nextInt();
        if (erettsegi < 25){
            System.out.println("Szerintem megbuktál");
        } else if(erettsegi < 40){
            System.out.println("2-es lett.");
        } else if(erettsegi < 60){
            System.out.println("3-mas lett.");
        } else if(erettsegi <80){
            System.out.println("4-es lett.");
        } else {
            System.out.println("5-ös lett.");
        }

        System.out.println("Kérem a neved:");
        String name = scanner.next();
        if (name.equalsIgnoreCase("Ria") || name.equalsIgnoreCase("Balázs")){
            System.out.println("Oktató vagy!");
        } else {
            System.out.println("Diák vagy ;) :D");
        }

        System.out.println("Magyar vagy?");
        String yesOrNo = scanner.next();
        if (yesOrNo.equalsIgnoreCase("igen")){
            System.out.println("Budapest");
        } else{
            System.out.println("Do you speak English?");
            String speak = scanner.next();
            System.out.println("Thx the answer! ;)");
        }

        System.out.println("Write a country!");
        String country = scanner.next();
        switch (country){                                   //toLowerCase-Kisbetűs / toUpperCase-Nagybetűs
            case "Magyarország":                            //változatokat hasonlít össze.
                System.out.println("Főváros: Budapest");    //trim a szóközt távolítja el
                break;  //Érdemes mindig lezárni!           //startswith endswith
            case "Szlovákia":
                System.out.println("Főváros: Pozsony");
                break;
            case "Csehország":
                System.out.println("Prága");
                break;
            case "Lengyelország":
                System.out.println("Varsó");
                break;
            default:
                System.out.println("Nem tagja a V4-nek!");
                break;
        }

        System.out.println("Your grade??");
        String grade = scanner.next();
        switch (grade){
            case 1:
                System.out.println("ELÉGTELEN!");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jóóó");
                break;
            case 5:
                System.out.println("KIVÁLLÓ!!!");
                break;
            default:
                System.out.println("Tesssék!?");
                break;
        }

        36+ munkaviszony / nappali halgató // főállású - mindenki más

        //boolean fullTime = scanner.nextLine().equalsIgnoreCase
        System.out.println("Nappali tagozatos hallgató vagy? (igen/nem)");
        String fullTime = scanner.next();
        System.out.println("Heti óraszámod?");
        int workTime = scanner.nextInt();

        if (fullTime.equalsIgnoreCase("igen") || workTime >= 36){
            System.out.println("mellékállású");
        } else {
            System.out.println("Főállású");
        }

        if (!fullTime.equalsIgnoreCase("igen") && workTime < 36){     // De- morgan azonosság
            System.out.println("Főállású");
        } else {
            System.out.println("Mellékállású");
        }*/

        // NEGYEDIK ÓRA


    }
}
