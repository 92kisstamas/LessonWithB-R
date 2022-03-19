package hu.progmatic;

import java.util.Scanner;

public class ora0319isSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi a méret?");
        double meret = sc.nextDouble();
        sc.nextLine();
        System.out.println("Gömb? (i/n)");
        String gombE = sc.nextLine();
        sc.nextLine();
        boolean gomb = gombE.equalsIgnoreCase("i");

        if (gomb){
            System.out.println("A gömb területe: " + isSphere(meret));
        } else {
            System.out.println("A kocka területe: " + isCube(meret));
        }

        System.out.println("Van még egy pénzgyűjtő? (i/n)");
        String anOther = sc.nextLine();
        sc.nextLine();

        if (anOther.equalsIgnoreCase("i")){
            System.out.println("A mérete?");
            double meret2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ez is gömb? (i/n)");
            String gombE2 = sc.nextLine();
            sc.nextLine();
            boolean gomb2 = gombE2.equalsIgnoreCase("i");

            if (gomb2 && gomb){
                System.out.println("A két gömb területe: " + (isSphere(meret2) + isSphere(meret)));
            } else if (gomb2 && !gomb){
                System.out.println("A régi kocka és a gömb területe: " + (isCube(meret) + isSphere(meret2)));
            }else if (!gomb2 && !gomb){
                System.out.println("A két kocka területe: " + (isCube(meret) + isCube(meret2)));
            } else {
                System.out.println("A régi gömb és az új kocka területe: " + (isSphere(meret) + isCube(meret2)));
            }
        } else if (gomb){
            System.out.println("Csak egy gömböd van.");
        } else {
            System.out.println("Csak egy kockád van.");
        }



    }

    public static double isSphere (double x){
        double area = (4/3) * Math.PI * x * x * x;
        return area;
    }

    public static double isCube (double x){
        double area = x * x * x;
        return area;
    }

}
