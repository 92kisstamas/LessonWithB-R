package hu.progmatic;

public class ora0317tomb {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,5};
        int[] numbers2 = {2,4,6,8,10};

        System.out.println("1. összeg: " + sumArray(numbers1));
        System.out.println("2. összeg: " + sumArray(numbers2));
    }

    public static int sumArray(int[] numbers){
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];;
        }

        return sum;
    }

}
