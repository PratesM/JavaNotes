package com.company;

import java.util.Scanner;

public class Engine {
    int numGen;
    int numPicked;

    Scanner numScanner;

    Engine(){
        numGen = (int)(Math.random() * 100) + 1;

        numScanner = new Scanner(System.in);
    }

    protected void jogo(){
        System.out.println("Please, pick a number between 0 and 100: ");

        numPicked = numScanner.nextInt();

        System.out.println("The computer picked " + numGen + " while you picked " + numPicked);
    }
}
