package com.bootcoding.java.assignment;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=15;
        int temp;
        for(int i=2;i<=num;i++){
            temp=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    temp++;

                }
            }
            if(temp==1){
                System.out.println(i);
            }
        }

    }
}
