class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking .....");
    }
}

class DogBaby extends Dog {
    void weeping() {
        System.out.println("Weeping......");
    }

}

/**
 * DDDog
 */
public class DDDog {

    public static void main(String[] args) {
        DogBaby AA = new DogBaby();
        AA.eat();
        AA.bark();
        AA.weeping();
    }
}