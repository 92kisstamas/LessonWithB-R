package hu.progmatic;

public class ora0323MetodusokTwo {


                                    //args - csak egy változónév...
    public static void main(String[] args) {
/*        // static metódus hívása
        ora0323Metodusok.sayHello();
        String text = "";

        //public static String valueOf(in i)
        String number = String.valueOf(1);

        //public int length()
        int length = number.length();

        // nem static metódus hívása
        ora0323Metodusok a = new ora0323Metodusok();
        a.sayGoodbye();

        int sum = ora0323Metodusok.addNumbers(1, 2);

        int[] numbers =  {2, 1, -4, 3};
        numbers = ora0323Metodusok.switchTwoNumbersInArray(numbers, 0, 1);
*/
        int[][] matrix = {
                {1,2,3,4,5},
                {2,4,6,8,10}
        };

        System.out.println(ora0323Metodusok.sumDoubleArray(matrix, 1));

    }
}



    /*public String toLowerCase() {
        return toLowerCase(Locale.getDefault());
    }*/

    /*static void checkOffset(int offset, int length) {
        if (offset < 0 || offset > length) {
            throw new StringIndexOutOfBoundsException("offset " + offset +
                    ", length " + length);
        }
    }*/
