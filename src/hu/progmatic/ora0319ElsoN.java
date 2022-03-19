package hu.progmatic;

import java.util.ArrayList;

public class ora0319ElsoN {


    public static void main(String[] args) {
        /*int piece = 5;
        int amount = amountOfPiece(piece);
        System.out.println(amount);*/

        // ----------------------Tömb---------------------//

        ArrayList<Integer> szamok = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            szamok.add(i);
        }
        System.out.println(szamok);
        /*int amount = 0;
        for (int i = 0; i < szamok.size(); i++) {
            amount += szamok.get(i);
        }*/
        System.out.println("Az összeg: " + amountOfList(szamok));

        System.out.println("Visszaszámlálás:");
        for (int i = szamok.size(); i > 0 ; i--) {
            System.out.println(szamok.get(i-1));
        }



    }

    public static int amountOfPiece (int piece){
        int amount = 0;
        for (int i = 1; i <= piece; i++) {
            amount += i;
        }
        return amount;
    }

    public static int amountOfList (ArrayList<Integer> szamok){
        int amount = 0;
        for (int i = 0; i < szamok.size(); i++) {
            amount += szamok.get(i);
        }
        return amount;
    }

}
