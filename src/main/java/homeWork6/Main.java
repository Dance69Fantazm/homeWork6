package homeWork6;

import homeWork6.animals.Animals;
import homeWork6.animals.Cat;
import homeWork6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animals.rolSc();
        Animals[] animals = new Animals[] {
                new Cat("Амели"),
                new Cat("Каспер",1),
                new Dog("Вольф"),
                new Cat("Кнопка",30),
                new Dog("Гектор"),
        };

        for (int i = 0; i <animals.length ; i++) {
            animals[i].run();
            animals[i].toSwim();

        }
    }
}
