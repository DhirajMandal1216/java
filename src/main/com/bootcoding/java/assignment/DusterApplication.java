package com.bootcoding.java.assignment;

public class DusterApplication {
    public static void main(String[] args) {
       Duster d1= Duster.CreateDuster();
       Duster d2= Duster.Create_Duster("red","curve","Natraj",120,16);
       Duster.printduster(d1);
       Duster.printduster(d2);
    }
}
