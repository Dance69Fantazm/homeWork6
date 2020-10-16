package homeWork6.animals;

public abstract class Animals {
    protected String type;
    protected String name;

    protected int maxSwim;
    protected int maxDistance;

    private static int ANIMALCOUNT;

    public void run(int dist){
        if (dist <= maxDistance) {
            System.out.println(type + " " + name + "\n" + " пробежал " + dist + " m");
        }else {
            System.out.println(type + " " + name + " неспособен столько пробежать!");
        }
    }

    public void toSwim(int dist){
        if (maxSwim == 0) {
            System.out.println(type + " " + name + " не умеет плавать ");
        }
        if (dist <= maxSwim) {
            System.out.println(type + " " + name + "\n" + " проплыл " + dist + " m");
        }
        else {
            System.out.println(type + " " + name + " неспособен столько проплыть!");
        }
    }

    public Animals(String type, String name, int maxDistance, int maxSwim){
        this.type = type;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxSwim = maxSwim;
        ANIMALCOUNT++;
    }
    public Animals(String type, String name, int maxDistance, int maxSwim, int dispersionPercent){
        this(type, name, maxDistance, maxSwim);
        this.maxDistance *= Math.random()*dispersionPercent/100+1;
        this.maxSwim *= Math.random()*dispersionPercent/100+1;
    }

    public static int getANIMALCOUNT(){
        return ANIMALCOUNT;
    }
}
