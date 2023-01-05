package com.bootcoding.java.assignment;

public class BoxApplication {
    public static void main(String[] args) {
        Box b1=Box.createBox();
        Box b2 =Box.create_box(15.2,16.3,19.3);
        Box.printBox(b1);
        Box.printBox(b2);

    }
}
