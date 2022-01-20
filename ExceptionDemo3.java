package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int n1 = in.nextInt();
            System.out.println("Enter Second Number: ");
            int n2 = in.nextInt();
            int n3 = n1 / n2;
            System.out.println(n3);
        } catch (InputMismatchException ie) {
            System.out.println("Enter Valid Input");
        }
    }
}
