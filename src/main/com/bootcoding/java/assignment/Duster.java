package com.bootcoding.java.assignment;

public class Duster {
    String colour,shape,company;
    int cost,quantity;
    public static Duster CreateDuster(){
        Duster duster=new Duster();
        duster.colour="Blue";
        duster.shape="Rectangle";
        duster.company="Camlin";
        duster.cost=150;
        duster.quantity=10;
        return duster;
    }
    public static Duster Create_Duster(String colour,String shape,String company,int cost,int quantity){
        Duster duster=new Duster();
        duster.colour=colour;
        duster.shape=shape;
        duster.company=company;
        duster.cost=cost;
        duster.quantity=quantity;
        return duster;

    }
    public static void printduster(Duster duster){
        System.out.println("Colour=" + duster.colour);
        System.out.println("Shape="  + duster.shape);
        System.out.println("Company="+ duster.company);
        System.out.println("Cost="+ duster.cost);
        System.out.println("Quantity="+ duster.quantity);


    }

}
