package com.bootcoding.java.assignment;

import javax.sound.midi.Soundbank;

public class Helmet {
    String types,colour,brand;
    int cost;
    public static Helmet CreateHelmet(){
        Helmet helmet=new Helmet();
        helmet.types="Full Face";
        helmet.colour="Black";
        helmet.brand="Bell Helmets";
        helmet.cost=2000;
        return helmet;

    }
    public static Helmet CreateHelmet(String types,String colour,String brand,int cost){
        Helmet helmet=new Helmet();
        helmet.types=types;
        helmet.colour=colour;
        helmet.brand=brand;
        helmet.cost=cost;
        return helmet;

    }
    public static void printHelmet(Helmet helmet){
        System.out.println("Types ="+ helmet.types);
        System.out.println("Colour ="+ helmet.colour);
        System.out.println("Brand ="+helmet.brand);
        System.out.println("Cost ="+helmet.cost);

    }
}
