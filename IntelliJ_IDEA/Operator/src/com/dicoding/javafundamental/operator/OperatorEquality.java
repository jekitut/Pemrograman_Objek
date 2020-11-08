package com.dicoding.javafundamental.operator;

public class OperatorEquality {

    public static void main(String[] args) {

        int value = 5;
        int valueAnother = 4;
        boolean result;
        result = value == valueAnother;

        System.out.println("Hasil 'value == valueAnother' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != valueAnother;
        System.out.println("Hasil 'value != valueAnother' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > valueAnother;
        System.out.println("Hasil 'value > valueAnother' adalah " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= valueAnother;
        System.out.println("Hasil 'value >= valueAnother' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < valueAnother;
        System.out.println("Hasil 'value < valueAnother' adalah " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= valueAnother;
        System.out.println("Hasil 'value <= valueAnother' adalah " + result);
        System.out.println();

    }
}