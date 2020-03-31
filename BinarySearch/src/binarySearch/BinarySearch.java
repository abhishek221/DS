/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 31-03-2020
 *  Time: 21:35
 */
package binarySearch;

import java.util.Arrays;

public class BinarySearch
{
    public int binarySearch(int[] array, int value)
    {
        Arrays.sort(array);
        System.out.println("Here the sorted array is ");
        System.out.println(Arrays.toString(array));
        int start = 0;
        int end = array.length-1;

        while(start<=end)
        {
            int mid = (start + end)/2;
            if(array[mid]==value)
            {
              return mid;
            }
            else if(array[mid]<value)
            {
                start = mid+1;
            }
            else if(array[mid]>value){
                end = mid-1;
            }
        }
        return -1;

    }
}
