package definition;

import adt.arrayadt;

public class Array implements arrayadt {
    @Override
    public int[] traverseArray(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("the element we are traversing is "+arr[i]);

        }
        return new int[0];
    }

    @Override
    public int[] printArray(int[] arr) {
        for (int j = 0; j <arr.length ; j++)
        {
            System.out.println("the array elements are "+arr[j]);

        }
        return new int[0];
    }

    @Override
    public void searchInArray(int[] arr, int value) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                break;
            } else {
                System.out.println("value not found in the array");
            }

        }
        System.out.println("value found at " + i +1);
    }

    @Override
    public void insertIntoArray(int[] arr, int value) {

    }
}
