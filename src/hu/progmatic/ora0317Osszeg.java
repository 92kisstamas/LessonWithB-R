package hu.progmatic;

public class ora0317Osszeg {
    public static void main(String[] args) {
        sum(100, 20);
        sum(15, 13);
        sum(21, 11);
    }
    public static void sum (int num1, int num2){
        System.out.println("1. szám: " + num1);
        System.out.println("2. szám: " + num2);
        System.out.println("Összeg: " + num1 + num2);
    }
}
