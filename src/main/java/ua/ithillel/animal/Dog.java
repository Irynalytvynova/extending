package ua.ithillel.animal;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public static void run(int distanсe){
        if (distanсe > 500){
            System.out.println("Dog will not run");
        } else {
            System.out.println("Dog ran "+distanсe);}
    }

    public static void swim(int distance){
       if(distance>10){
           System.out.println("Dog will not swim " +distance+ " m");
       } else{
           System.out.println("Dog swam " +distance+ " m");
       }
    }

}
