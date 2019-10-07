package by.epam.javaBases;

import java.util.Scanner;

public class ScannerEasy {
    public static void main(String[] args) {
        System.out.println("Whaats your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}
