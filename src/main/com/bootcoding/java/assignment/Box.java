package com.bootcoding.java.assignment;

public class Box {
    double length,breadth,height;
    public static Box createBox(){
        Box box=new Box();
        box.length=10.0;
        box.breadth=10.0;
        box.height=10.0;

        return box;

    }
    public static Box create_box(double l,double b,double h){
        Box box=new Box();
        box.length=l;
        box.breadth=b;
        box.height=h;
        return box;
    }
    public  static void printBox(Box box){
        System.out.println("Box length="+box.length);
        System.out.println("Box length="+box.breadth);
        System.out.println("Box length="+box.height);

    }



}
