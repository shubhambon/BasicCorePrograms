package com.core;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please enter the first number: ");
        int x = scan.nextInt();

        System.out.print(" Please enter the second number: ");
        int y = scan.nextInt();

        System.out.println(" The quotient is: " + (x / y));
        System.out.println(" The remainder is: " + (x % y));

        scan.close();
    }


    }
