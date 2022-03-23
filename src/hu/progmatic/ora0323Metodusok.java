package hu.progmatic;

public class ora0323Metodusok {
    public static void main(String[] args) {

    }

    /**
     * Csak felé írva...
     * @param x
     * @param y
     * @return two numbers sum (x+y)
     */
    public static int addNumbers(int x, int y){    // private - nál nem lehet
        //int sum = x + y;                          // másik osztályban meghívni
        return x + y;
    }


    // metódus feje == metódus szignatúrája
    public static void sayHello()               // public == láthatósági jelző (melyik
                                                //fájl/osztály tudja látni a metódust)
    // metódus törzse (body)
    {
        System.out.println("Hello!");
    }


    public void sayGoodbye(){                   // static osztály nélkül nem
        System.out.println("Bye");              //lehet meghívni másik osztályban
    }

    public static boolean isLeapYear(int year){ //boolean neve általában egyszerű
        return false;                           //kérdő mondat
    }

    public static char[][] xy(){                // példa többdimenziós tömbre
        if (true){
            return new char[0][];
        } else {
            return new  char[1][];
        }
    }

    public static int[] switchTwoNumbersInArray(int[] array, int firstIndex, int secondIndex){
        if (array.length > 1) {
            if (array[firstIndex] > array[secondIndex]) {
                int temp = array[firstIndex];
                array[firstIndex] = array[secondIndex];
                array[secondIndex] = temp;
            }
        }
        return array;
    }

    public static int sumArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int j = array[i];                       // FORI
            sum += j;
        }

        for (int j : array) {                       //FOREACH
            sum += j;               // végigmegy a tömb összes elemén egyenként....
        }

        return sum;
    }

    public static int sumDoubleArray(int[][] array, int j){
        int sum = 0;
        for (int i : array[j]){
            sum += i;
        }
        return sum;
    }






}