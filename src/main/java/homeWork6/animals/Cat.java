package homeWork6.animals;

public class Cat extends Animals{

    public static int ANIMALCOUNT;

    public Cat(String name){

        super("Кот" ,name, 200, 0);
        ANIMALCOUNT++;
    }

    public Cat(String name, int dispersionPercent){
        super("Кот", name, 200, 0, dispersionPercent);
        ANIMALCOUNT++;
    }
    public static int getANIMALCOUNT(){
        return ANIMALCOUNT;
    }
}
