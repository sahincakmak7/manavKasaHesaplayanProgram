package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pearKg, appleKg, tomatoKg, bananaKg, aubergineKg, totalAmount;
        double pearKgPrice = 2.14, appleKgPrice = 3.67, tomatoKgPrice = 1.11, bananaKgPrice = 0.95, aubergineKgPrice = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kilo :");
        pearKg = input.nextDouble();

        System.out.print("Elma kilo :");
        appleKg = input.nextDouble();

        System.out.print("Domates kilo :");
        tomatoKg = input.nextDouble();

        System.out.print("Muz kilo :");
        bananaKg = input.nextDouble();

        System.out.print("Patlıcan kilo :");
        aubergineKg = input.nextDouble();

        totalAmount = ((pearKg * pearKgPrice) + (appleKg * appleKgPrice) + (tomatoKg * tomatoKgPrice) + (bananaKg * bananaKgPrice) + (aubergineKg * aubergineKgPrice));
        System.out.println("Toplam tutar :" + totalAmount);


    }
}
