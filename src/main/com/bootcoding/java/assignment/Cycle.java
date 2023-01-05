package com.bootcoding.java.assignment;

public class Cycle {
    String types,brand,color;
    int cost;
    public static Cycle CreateCycle(){
        Cycle cycle=new Cycle();
        cycle.types="City";
        cycle.brand="Hercules";
        cycle.color="Brown";
        cycle.cost=45000;
        return cycle;
    }
    public static Cycle CreateCycle(String types,String brand,String color,int cost){
        Cycle cycle=new Cycle();
        cycle.types=types;
        cycle.brand=brand;
        cycle.color=color;
        cycle.cost=cost;
        return cycle;
    }
    public static void printcycle(Cycle cycle){
        System.out.println("Types="+cycle.types);
        System.out.println("Brand="+cycle.brand);
        System.out.println("Colour="+cycle.color);
        System.out.println("Cost="+cycle.cost);
    }
}
