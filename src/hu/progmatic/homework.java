package hu.progmatic;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class homework {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Hi!" + "\n" + "Date: " + date) + "\n" + ("Time: " + time));

        System.out.println("Give me a number:");
        int numberFirst = scanner.nextInt();
        System.out.println("Give me another number:");
        int numberSecond = scanner.nextInt();
        System.out.println("And one more:");
        int numberThird = scanner.nextInt();
        double averageResult = (double) (numberFirst + numberSecond + numberThird) / 3;
        System.out.println("The average of the three number: " + averageResult);

        System.out.println("Give me a number, for my other homework:");
        int numberOthFirst = scanner.nextInt();
        System.out.println("Give me another number, for my other homework:");
        int numberOthSecond = scanner.nextInt();
        System.out.println("The rest: " + (numberOthFirst - ((numberOthFirst / numberOthSecond) * numberOthSecond)));
        /*if (numberOthFirst > numberOthSecond) {
            System.out.println("The rest: " + (numberOthFirst - ((numberOthFirst / numberOthSecond) * numberOthSecond)));
        } else {
            System.out.println("The rest: " + numberOthFirst);
        }*/

        /*
        1 -> j = 10;  ++
        2 -> n = 1;   --  3
        3 -> b = 10;  ++
        4 -> a = true;  --  false
        5 -> e = true, g = -1; ++ --  3
        6 -> x = 20, y = true, z = false; ++ ++ ++
         */

        int j = 5, i = 10;
        j += j * 2 == i ? j : i % 3;
        System.out.println(j);

        int n = 0;
        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;
        System.out.println(n);

        int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;
        System.out.println(b);

        boolean h = false, c = true, d = true;
        boolean p = h || c ? ! ( h || c && d ) : c && ! d;
        System.out.println(p);

        int f = 1;
        boolean e = !false == (10%3 == f);
        int g = e ? f -= (++f * -1) : f+ (f+f) * ++f;
        System.out.println(e + " " + g);

        int v = 5, x = v * --v;
        boolean y = x % v < 0 ? v == 0 : !false;
        boolean z = !y && x == v * v;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
