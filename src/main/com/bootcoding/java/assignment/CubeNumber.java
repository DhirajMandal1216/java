package com.bootcoding.java.assignment;

public class CubeNumber {
    public static void main(String[] args) {
        int n=15;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println("Cube of "+i+"="+i*i*i);
            }
        }
    }
}
