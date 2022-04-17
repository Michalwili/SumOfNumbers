package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, result,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers do you want sum: ");
        n = sc.nextInt();
        // first way
        for (int i = 0; i <=n; i++) {
            sum += i;
        }
        //System.out.println(sum);

        // second way
        result = n*(n+1)/2;
        System.out.println("Sum of " + n + " numbers is " + result);
   }
}
