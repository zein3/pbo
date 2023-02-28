package pset41;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield");
        Dog dog = new Dog("dog");
        BigDog bigDog = new BigDog("big dog");

        System.out.print("Cat greets: ");
        cat.greets();

        System.out.print("Dog greets: ");
        dog.greets();

        System.out.print("Dog greets another dog: ");
        dog.greets(bigDog);

        System.out.print("Big dog greets: ");
        bigDog.greets();

        System.out.print("Big dog greets dog: ");
        bigDog.greets(dog);

        System.out.print("Big dog greets big dog: ");
        bigDog.greets(bigDog);
    }
}
