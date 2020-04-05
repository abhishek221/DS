/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 05-04-2020
 *  Time: 21:39
 */
package selectionsort;

public class SelectionSort {
    public static void selSort(int[] array )
    {
        for (int i = 0; i <array.length-1 ; i++) {
            int index=i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[index]){
                    index=j;
                }

            }

            swap(array,index,i);
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+", ");

        }

    }

    private static void swap(int[] array, int index, int i) {
        int temp = array[index];
        array[index]=array[i];
        array[i]=temp;
    }
}
