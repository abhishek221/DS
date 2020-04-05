/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 02-04-2020
 *  Time: 00:15
 */
package main;

import bubblesort.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to the sorting menu ");
        System.out.println("Please enter the size of array ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i]= (int)(Math.random() *100);

        }

        System.out.println("The random generated array is");
        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("how would you want to sort your array");
        System.out.println("press 1 for bubble sort");
        int response = scanner.nextInt();

        switch (response){
            case 1:
                // BubbleSort
                BubbleSort obj = new BubbleSort();
                obj.bubbleSort(randomNumbers);
                break;

            default:
                System.out.println("please enter a valid number");
                break;


        }

    }
}
