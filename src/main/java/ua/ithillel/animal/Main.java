package ua.ithillel.animal;

public class Main {
    public static void main(String[] args) {

        Dog dogRex = new Dog("Rex");
        Animal animalDog = dogRex;
        Cat catMurchik = new Cat("Murchik");
        Animal animalCat = catMurchik;

        dogRex.run(700);
        catMurchik.run(7);
        catMurchik.swim(100);
        dogRex.swim(100);

        System.out.println("All animal: " + Animal.count);
    }


}