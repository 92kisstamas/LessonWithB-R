package hu.progmatic;

public class ora0319Rezges {
    public static void main(String[] args) {
        /*Gerjesztett rezgés Készíts 2 metódust. pozitiveSwing negativeSwing Paraméterként
        a következők kapják:
        - aktuális kilengés (5.0)
        - gerjesztés (szorzó, pl. -1.2)
        - pozitív esetében egy minimum (>= 20.0) érték, negatív esetében egy maximum (<= -50.0)
        Hány szorzásra van szükség (fél ciklus, mivel 2 szorzás egy teljes ciklus)
        hogy elérjük a szélsőértéket? pozitív esetben 5.0 -2.0 20.0 5.0 -10.0 20.0 itt leszakad,
        úgyhogy +2-re van szükség (nem szakadt le magától)
        - számláló létrehozása (típus, érték)?
        - meddig kell szoroznunk? (while ciklus, amíg a kilengés nagyobb / kisebb mint...)
        Mit hasonlítunk össze mivel? Mi a reláció? (<, <=, ==, !=, >, >=)
        - melyik változókat kell frissítenünk? ciklus után írjuk ki (adjuk vissza az értékeket)
        + bónusz a main végén legyen egy if-else, ami kiírja, hogy melyik irányban szakadt
        le a híd (melyik irányban van kevesebb szorzásra szükség?) */

        double currentExcursion = 10.0; // scanner
        double excitation = -1.2;
        double positiveTensileStrength = 50.0;
        double negativeTensileStrength = 50.0;

        //int counter = 0;
        double counterPositive = positiveSwing(currentExcursion, excitation, positiveTensileStrength);
        double counterNegative = negativeSwing(currentExcursion, excitation, negativeTensileStrength);

        // s szakítási szilárdság elérésekor már éppen leszakad a híd
        /*while (currentExcursion < positiveTensileStrength){
            currentExcursion *= excitation;
            counter++;
        }*/

        System.out.println("Az eltelt szorzások száma: " + counterPositive);


    }

    public static double positiveSwing(double currentExcursion, double excitation, double positiveTensileStrength){
        int counter = 0;
        while (currentExcursion < positiveTensileStrength){
            currentExcursion *= excitation;
            counter++;
        }
        return counter;
    }

    public static double negativeSwing(double currentExcursion, double excitation, double negativeTensileStrength){
        int counter = 0;
        while (currentExcursion > negativeTensileStrength){
            currentExcursion *= excitation;
            counter++;
        }
        return counter;
    }

}
