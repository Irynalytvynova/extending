package ua.ithillel.animal;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void run(int distance){
        System.out.println("run "+ distance + " m");
    }
    public static void swim(int distance){
        System.out.println("swim "+distance+ " m");
    }
    static int count;
    Animal() {
        count++;
    }
}
