package hu.progmatic;

public class Sleep {
    public int x;
    public int y;
    public int z;

    Sleep(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int sleepingStudent(){
        return x - y - z;
    }

    public String tiredClass (){
        boolean tClass = (x - y -z) > x /4;
        if (tClass){
            return "Ez egy fáradt osztály.";
        } else {
            return "Ez egy fitt osztály";
        }

    }

    void classStatus(){
        System.out.println("Az osztály létszáma " + x + ".\n"
                + "Aktív " + (y + z) + " diák.\n"
                + "Alszik " + sleepingStudent() + "... \n"
                + tiredClass()
        );
    }

}
