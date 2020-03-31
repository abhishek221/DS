/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 31-03-2020
 *  Time: 21:44
 */
package main;

import binarySearch.BinarySearch;
import linearSearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to the searching menu ");
        System.out.println("Please enter the size of the array you want to create");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i]= (int) (Math.random()*100);

        }
        System.out.println("the random generated array with "+size+" has been created");
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("enter the value you want to search in the array");
        int value = scanner.nextInt();

        System.out.println("press 1 for binary search and 2 for linear search");
        char response = scanner.next().charAt(0);

        if(response=='2'){
            LinearSearch obj = new LinearSearch();
            int index = obj.linearSearch(randomNumbers,value);
            System.out.println("found at "+index );

        }
        else if (response=='1'){
            BinarySearch object = new BinarySearch();
            int index = object.binarySearch(randomNumbers,value);
            System.out.println("found at "+index);
        }

    }
}
