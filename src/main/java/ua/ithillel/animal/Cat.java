package ua.ithillel.animal;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }


    public static void run(int distance) {
        if (distance > 200){
            System.out.println("Cat will not run");
        } else {
            System.out.println("Cat ran "+distance+ " m");}
    }


    public static void swim(int distance) {
        System.out.println("Cats can't swim at all");
    }
}
