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
        if(size ==4)
        {
            System.out.println("the queue is full , cant insert ! ");
        }
        else {


            queue[rear] = data;
            rear = (rear + 1) % 4;
            size = (size + 1);
        }

    }

    @Override
    public int Dequeue()
    {
        int data = queue[front];
        front = (front +1)%4;
        size= size-1;
        return data;
    }

    @Override
    public void show()
    {
        for (int i = 0; i <size ; i++)
        {
            System.out.println(queue[(i+front)%4]);

        }
        System.out.println("the size is "+size);

    }

    @Override
    public int front() {
        return 0;
    }

    @Override
    public int rear() {
        return 0;
    }

    @Override
    public void isEmpty() {

    }
}
