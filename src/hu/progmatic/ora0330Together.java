package hu.progmatic;

import java.util.Arrays;

public class ora0330Together {
    public static void main(String[] args) {
        int[] gandalfsHills = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

        //System.out.println("Size of the highest hill: " + highestHill(gandalfsHills));

        int position = 0;

        //System.out.println("The highest mountain from the position: " + theNextHighest(gandalfsHills, position));

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

        int[] dwarfsHeights = { 130, 138, 135, 128, 130, 120, 125, 130, 110};

        if (twoDwarfHeights(dwarfsHeights)){
            System.out.println("Elbántak a trollal!");
        } else {
            System.out.println("Nem bántak el a trollal!");
        }*/


    }

    public static int highestHill (int[] hills) {
        int hill = 0;

        for (int i : hills) {
            if (i > hill){
                hill = i;
            }
        }

        return hill;
    }

    // nem index szerinti keresés
    public static int theNextHighest (int[] hills, int position) {
        int hill = 0;

        for (int i = position; i < hills.length; i++) {
            if (hills[i] > hill) {
                hill = hills[i];
            }
        }

        return hill;
    }

    //másképp

    public static void crossingTheBridge (int[] dwarfsAndGandalf){
        int timeCounter = 0;
        boolean end = false;
        int max = 0;
        int min = 0;

        for (int i = 0; i < dwarfsAndGandalf.length / 2; i++) {
            for (int maxfinding = 0; maxfinding < dwarfsAndGandalf.length - 1; maxfinding++) {
                if (max < dwarfsAndGandalf[maxfinding]){
                    max = dwarfsAndGandalf[maxfinding];
                }
            }
            for (int minFinding = 0; minFinding < dwarfsAndGandalf.length - 1; minFinding++) {
                if (min > dwarfsAndGandalf[minFinding]){
                    min = dwarfsAndGandalf[minFinding];
                }
            }
        }


        /*Arrays.sort(dwarfsAndGandalf);
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

    public static boolean didItWork (int[][] wH){
        boolean didWork = false;
        int highest = 0;
        int height = 0;

        for (int i = 0; i < wH.length-1; i++) {
            if (wH[i][0] > wH[i+1][0] && wH[i][1] > wH[i+1][1]){
                highest = i;
                height = wH[i][1];
            }
        }

                // Arrays.sort(arr, new Sortbyroll());

        for (int i = 0; i < wH.length; i++) {
            if (wH[highest][0] > wH[i][0] && wH[highest][1] > wH[i][1]) {
                height += wH[i][1];
                highest = i;
            } else {

            }
        }
        didWork = height > 400;
        return didWork;
    }

    public static boolean twoDwarfHeights (int[] heights){
        boolean itsTrue = false;
        int height = heights[0];

        for (int i = 0; i < heights.length-1; i++) {
            if (heights[i] > heights[i+1]){
                height = heights[i];
            } else if (height + heights[i] > 270){
                itsTrue = true;
                break;
            }
        }

        return itsTrue;
    }

}
