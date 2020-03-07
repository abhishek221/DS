/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 07-03-2020
 *  Time: 15:20
 */
package Queue;

import adt.QueueADT;

public class Queue implements QueueADT
{
    int size=0;
    int front;
    int rear;
    int[] queue = new int[4];


    @Override
    public void Enqueue(int data)
    {
        queue[rear] = data;
        rear = rear +1;
        size = size+1;


    }

    @Override
    public int Dequeue()
    {
        int data = queue[front];
        front = front +1;
        size= size-1;
        return data;
    }

    @Override
    public void show()
    {
        for (int i = 0+front; i <rear ; i++)
        {
            System.out.println(queue[i]);

        }
        System.out.println("the size is "+size);

    }
}
