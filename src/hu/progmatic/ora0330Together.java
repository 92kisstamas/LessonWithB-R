package hu.progmatic;

import java.util.ArrayList;
import java.util.Arrays;

public class ora0330Together {
    public static void main(String[] args) {
        int[] gandalfsHills = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

        //System.out.println("A legmagasabb hegy: " + highestHill(gandalfsHills));

        int position = 4;

        //System.out.println("A 4. hegytől a legmagasabb hegy: " + theNextHighest(gandalfsHills, position));

        // Tömb - Törp ;)
        int[] weightOfDwarfsAndGandalf = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};

        //crossingTheBridge(weightOfDwarfsAndGandalf);

        int[][] weightAndHeight = {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128},
                {70, 130}, {58, 120}, {67, 125}, {72, 130}, {85, 110}};


        /*
        if (didItWork(weightAndHeight)){
            System.out.println("Sikerült elérni a reteszt.");
        } else {
            System.out.println("Nem sikerült elérni a reteszt.");
        }
        */

        int[] dwarfsHeights = { 130, 138, 135, 128, 130, 120, 125, 130, 110};

        /*
        if (twoDwarfHeights(dwarfsHeights)){
            System.out.println("Elbántak a trollal!");
        } else {
            System.out.println("Nem bántak el a trollal!");
        }
        */

        /*
        String stonesub = "obbnagy intm incharm sé ím!pr enjM eb a ebblegkis ámúsz tónaj nekmely ámasz";
        String[] stoneSubtitle = stoneBottom(stonesub);

        System.out.print("A kő felirata: ");
        for (int i = 0; i < stoneSubtitle.length; i++) {
            System.out.print(stoneSubtitle[i]);
        }*/
    }

    // Legmagasabb hegy
    public static int highestHill (int[] hills) {
        int hill = 0;

        for (int i : hills) {
            if (i > hill){
                hill = i;
            }
        }
        return hill;
    }



    // Következő legnagyobb hegy? (nem index szerinti keresés)
    public static int theNextHighest (int[] hills, int position) {
        int hill = 0;

        for (int i = position; i < hills.length; i++) {
            hill = hills[i];
            if (hills[i] > hill) {
                hill = hills[i];
            }
        }
        return hill;
    }



    // Mennyi idő a hídon átérni?
    public static void crossingTheBridge (int[] dwarfsAndGandalf){
        int timeCounter = 0;
        boolean end = false;
        int max = 0;
        int min = 0;

        for (int i = 0; i < dwarfsAndGandalf.length / 2; i++) {
            for (int j = 0; j < dwarfsAndGandalf.length; j++) {
                if (max > dwarfsAndGandalf[j]){

                }
            }
        }

        /*
            // 1. megoldás
        int j = dwarfsAndGandalf.length-1;

        for (int i = 0; i < dwarfsAndGandalf.length / 2; i++) {
            if (dwarfsAndGandalf[i] + dwarfsAndGandalf[j] > 150){
                timeCounter += 2;
            } else {
                timeCounter++;
            }
            j--;
        }*/
        //System.out.println(timeCounter * 5 + " perc alatt érnek át a hídon.");
    }



    // Elérik a reteszt?
    public static boolean didItWork (int[][] wH){
        boolean didWork = false;
        ArrayList<Integer> heightAmount = new ArrayList<Integer>();
        int temp = 0;
        int tempOne = 0;
        int amount = 0;

        //maximumkeresés
        for (int i = 0; i < wH.length-1; i++) {
            if (wH[i][0] > wH[i+1][0] && wH[i][1] > wH[i+1][1]){
                temp = wH[i][1];
                heightAmount.add(temp);
            }
        }

        //Temp alatti maximumok keresése és listába helyezés
        for (int i = 0; i < wH.length-1; i++) {
            for (int j = 0; j < wH.length-1; j++) {
                if(wH[i][0] > wH[i+1][0] && wH[i][1] > wH[i+1][1] && wH[i][1] < temp){
                    tempOne = wH[i][1];
                }
            }
            temp = tempOne;
            heightAmount.add(temp);
        }

        // Arraylist elemeinek összeadása
        for (int i = 0; i < heightAmount.size(); i++) {
            amount += heightAmount.get(i);
        }

        didWork = amount > 400;

        return didWork;
    }



    // Troll érvágás
    public static boolean twoDwarfHeights (int[] heights){
        boolean itsTrue = false;
        int height = 0;
        int temp = heights[0];

        for (int i = 0; i < heights.length-1; i++) {
            if (heights[i] > height){
                height = heights[i];
                if (height > temp && heights[i] > temp){
                    temp = heights[i];
                }
            }
        }
        itsTrue = height + temp > 270;

        return itsTrue;
    }



    // Kő felirata  / minden elem, 1-el jobbra csúsztatva
    /*
    public static String[] stoneBottom (String stoneSubtitle){
        String[] subtitles = stoneSubtitle.split(" ");
        String temp = "";
        String temp1 = "";
        String temp2 = "";

        for (int i = 0; i < subtitles.length-1; i++) {
            if (i == subtitles.length-1){
                String subTemp = subtitles[0] + " ";
                subtitles[0] = subtitles[i] + " ";
                subtitles[i] = subTemp + " ";
                break;
            }
            String subTemp = subtitles[i] + " ";
            subtitles[i] = subtitles[i+1] + " ";
            subtitles[i+1] = subTemp + " ";
        }
        return subtitles;
    }
     */

    // Kő felirata  / minden elem, X-el jobbra csúsztatva
    public static String[] stoneBottom (String stoneSubtitle, int right){
        String[] subtitles = stoneSubtitle.split(" ");
        String temp = "";
        String temp1 = "";
        String temp2 = "";
        int j = 0;

        for (int i = 0; i < subtitles.length-1; i++) {
            if (i + right > subtitles.length){
                j = right - (subtitles.length - i);
                String subTemp = subtitles[i] + " ";
                subtitles[i] = subtitles[i+1] + " ";
                subtitles[i+1] = subTemp + " ";
            }
            String subTemp = subtitles[i] + " ";
            subtitles[i] = subtitles[i+1] + " ";
            subtitles[i+1] = subTemp + " ";
        }
        return subtitles;
    }

}
