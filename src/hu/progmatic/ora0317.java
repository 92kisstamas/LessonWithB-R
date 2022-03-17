package hu.progmatic;

public class ora0317 {
    public static void main(String[] args) {
        String firstNam = "Tamás";
        String lastNam = "Kiss";
        String cit = "Tököl";
        int ag = 30;

        //form(firstNam, lastNam, cit);
        //System.out.println("Tök jó! :)");

        Form firstForm = new Form(firstNam, lastNam, cit, ag);
        firstForm.formular();
    }

    /*public static void form(String firstNam, String lastNam, String cit) {
        cit += ", Pest megye,";
        System.out.println("========================");
        System.out.println("\t Adatlap:");
        System.out.println("========================");
        System.out.println("Vezetéknév:\t" + firstNam);
        System.out.println("Keresztnév:\t" + lastNam);
        System.out.println("Város:\t\t" + cit);
    }*/
}
