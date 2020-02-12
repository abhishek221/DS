package main;
import definition.Array;
import adt.arrayadt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int[] arr =new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]=sc.nextInt();
        }
        Array obj = new Array();
        1obj.printArray(arr);
        //obj.traverseArray(arr);
        obj.searchInArray(arr,7);

    }
}
