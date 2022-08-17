package com.challenge;

public class Main {
    public static void main(String[] args) {
        System.out.println((hasSharedDigit(12, 23)));

    }

    public static boolean hasSharedDigit(int a, int b) {
        int lefta = a / 10;
        int righta = a % 10;
        int leftb = b / 10;
        int rightb = b % 10;
        return ( (a/10)== (b/10)|| (a/10 )==( b % 10)||  (a % 10)== (b/10) ||  (a % 10) == (b % 10));
    }
}