/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 31-03-2020
 *  Time: 21:42
 */
package linearSearch;

public class LinearSearch
{
    public int linearSearch(int[] array , int value)
    {
        for (int i = 0; i < (array.length); i++) {
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}
