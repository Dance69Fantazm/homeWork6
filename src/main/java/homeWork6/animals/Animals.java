package homeWork6.animals;

import java.util.Scanner;

public abstract class Animals {
    private static int distRun;
    private static int distSwim;
    protected String type;
    protected String name;

    protected int maxDistance;
    protected int maxSwim;

    private static int ANIMALCOUNT;
    static Scanner sc = new Scanner(System.in);

    public static void rolSc() {
            System.out.println("Введите длинну дистанции которую ПРОБЕГАЕТ животное: ");
            distRun = sc.nextInt();
            System.out.println("Введите длинну дистанции которую ПРОПЛЫВАЕТ животное: ");
            distSwim = sc.nextInt();
    }

    public void run(){
        if (distRun <= maxDistance) {
            System.out.println(type + " " + name + " пробежал " + distRun + " m");
        }else {
            System.out.println(type + " " + name + " неспособен столько пробежать!");
        }
    }

    public void toSwim(){
        if (maxSwim == 0) {
            System.out.println(type + " " + name + " не умеет плавать ");
        }
        if (distSwim <= maxSwim) {
            System.out.println(type + " " + name + " проплыл " + distSwim + " m" + "\n");
        }
        else {
            System.out.println(type + " " + name + " столько не плавает!" + "\n");
        }
    }

    public Animals(String type, String name, int maxDistance, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxSwim = maxSwim;
/*        this.distRun = distRun;
        this.maxSwim = distSwim;*/
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
