package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);                         //System.in is a standard input stream
        System.out.println("What is your name? ");
        String name= sc.nextLine();                                 //reads string
        System.out.println("Hello, " + name + ", nice to meet you!");     //print the message
    }
}
