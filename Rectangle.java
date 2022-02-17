package com.company;

import java.util.Scanner;

public class Rectangle {
    static void Draw(){
        // write your code here
        Scanner inputW = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = inputW.nextInt();


        Scanner inputH = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height = inputH.nextInt();


        Scanner inputC = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String color = inputC.nextLine();


        if (width < 0) {
            width = 1;
        }

        if (height < 0) {
            height = 1;
        }


        if (color.length() < 2 && color.length() > 20) {
            color = "Blue";
        }

        String colorUpper = color.toUpperCase();

        String firstLetter = colorUpper.substring(0, 1);
        String word = "";

        for (int j = 0; j < width; j++) {
            word += firstLetter;
            // System.out.println(word);
        }

        for (int i = 0; i < height; i++) {
            System.out.println(word);
        }


    }
    public static void main(String[] args) {
        Draw();
    }
}
