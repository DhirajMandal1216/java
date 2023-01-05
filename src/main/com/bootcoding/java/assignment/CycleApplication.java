package com.bootcoding.java.assignment;

public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1=Cycle.CreateCycle();
        Cycle c2=Cycle.CreateCycle("Hybrid","Atlas","Orange",60000);
        Cycle.printcycle(c1);
        Cycle.printcycle(c2);
    }
}
