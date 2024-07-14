package Simplejavaprogram;
import java.io.*;
import java.util.Scanner;
public class Nto1 {
    public static void main(String[] args) {
        int start = 10; // Example starting number
        printNumbers(start);
    }

    public static void printNumbers(int number) {
        if (number < 1) {
            return;
        }

        System.out.println(number);

        printNumbers(number - 1);
    }
}

