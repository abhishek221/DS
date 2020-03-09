/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 07-03-2020
 *  Time: 15:18
 */
package Main;

import Queue.Queue;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue obj = new Queue();
        obj.Enqueue(5);
        obj.Enqueue(8);
        obj.Enqueue(3);
        obj.Enqueue(9);
        obj.Dequeue();
        obj.Enqueue(1);
        obj.Enqueue(5);
        obj.show();
        sc.close();



    }

}
