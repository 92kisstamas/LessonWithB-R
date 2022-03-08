package hu.progmatic;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class ora0305 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Üdvözöllek!" + "\n" + "A pontos dátum: " + date) + "\n" + ("A pontos idő: " + time));
        System.out.println("Nappali tagozatos hallgató vagy? (igen/nem)");
        boolean fullTime = scanner.nextLine().equalsIgnoreCase("igen");
        System.out.println("Heti munkával töltött óraszámod?");
        int workTime = scanner.nextInt();
        scanner.nextLine();
        boolean mellekallasu = fullTime || workTime >= 36;

        if (mellekallasu){
            System.out.println("Grat, mellékállású vállalkozó vagy!");
        } else {
            Boolean melllekallasu = false;
            System.out.println("Grat, főállású vállalkozó vagy!");
        }

        System.out.println("Szívesen támogatod az államot? (igen/nem)");
        boolean yesOrNo = scanner.next().equalsIgnoreCase("igen");
        int adakozz0  = 0;
        while (yesOrNo) {
            System.out.println("Mennyit adakoznál az állam felé?");
            adakozz0 = scanner.nextInt();
            break;
        }

        System.out.println("Mennyi a havi nettó árbevételed? (Ft)");
        int teljesArbevetel0 = scanner.nextInt();
        System.out.println("Minden egyéb kiadásod havi összege: ");
        int egyebKiadas0 = scanner.nextInt();
        int megTakarithato = teljesArbevetel0 - egyebKiadas0;


        /* STDIN - scanner -> Szia = S, z, a, <-, i, a,
        *  STDOUT - sout -> végleges változat kimenetele */



        if (mellekallasu) {
            System.out.println("Havi 25.000F-ot adózol...");

            if (yesOrNo){
                System.out.println("A megtakarítható összeged egy hónapban: " + (megTakarithato - adakozz0 - 25000));
            } else {
                System.out.println("A megtakarítható összeged egy hónapban: " + (megTakarithato -= 25000));
            }

        } else /*(!mellekallasu)*/ {
            System.out.println("Havi 50.000F-ot adózol...");

            if (yesOrNo){
                System.out.println("A megtakarítható összeged egy hónapban: " + (megTakarithato - adakozz0 - 25000));
            } else {
                System.out.println("A megtakarítható összeged egy hónapban: " + (megTakarithato -= 25000));
            }
        }

        if (yesOrNo && !mellekallasu) {
            System.out.println("VIP adózó vagy! ;)");
        } else if (!yesOrNo && !mellekallasu) {
            System.out.println("Középkategóriás adózó vagy!");
        } else if (yesOrNo) {
            System.out.println("Alsókategóriás adózó vagy!");
        } else {
            System.out.println("Adhatnál szegény államnak többet is!... O.o");
        }

        /*if (!fullTime.equalsIgnoreCase("igen") && workTime < 36){     // De- morgan azonosság
            System.out.println("Főállású");
        } else {
            System.out.println("Mellékállású");
        }*/
    }
}
