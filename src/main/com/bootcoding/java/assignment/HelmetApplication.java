package com.bootcoding.java.assignment;

public class HelmetApplication {
    public static void main(String[] args) {
        Helmet h1= Helmet.CreateHelmet();
        Helmet h2=Helmet.CreateHelmet("Open Face","Red","Shoei Helmets",4500);
        Helmet.printHelmet(h1);
        Helmet.printHelmet(h2);
    }
}
