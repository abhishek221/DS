/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 02-04-2020
 *  Time: 00:32
 */
package bubblesort;

public class BubbleSort
{
    public static void bubbleSort(int[] array)
    {
        for (int i=0; i<array.length ; i++) {
            for (int j = 1 ; j <array.length-i ; j++) {
                if(array[j-1]>array[j])
                {
                    swap(array,j-1,j);
                }
                
            }

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+", ");

        }


    }

    private static void swap(int[] array, int i, int j) {
        if(i==j){
            return;}

        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
