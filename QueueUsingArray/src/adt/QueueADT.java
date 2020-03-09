package adt;

public interface QueueADT
{
    void Enqueue(int data);
    int Dequeue();
    void show();
    int front();
    int rear();
    void isEmpty();

}
