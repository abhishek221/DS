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
        for (int i = array.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(array[j]>array[j+1])
                {
                    swap(array,j,j+1);
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
