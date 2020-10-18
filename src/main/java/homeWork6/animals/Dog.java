package homeWork6.animals;

public class Dog extends Animals{

    public static int ANIMALCOUNT;
    static {
        ANIMALCOUNT = 0;
    }

    public Dog(String name){

        super("Пес" ,name, 500, 10);
        ANIMALCOUNT++;
    }

    public Dog(String name, int dispersionPercent){
        super("Пес", name, 500, 10, dispersionPercent);
        ANIMALCOUNT++;
    }
    public static int getANIMALCOUNT(){
        return ANIMALCOUNT;
    }
}
