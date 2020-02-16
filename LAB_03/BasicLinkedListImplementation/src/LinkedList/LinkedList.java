package LinkedList;

import Node.Node;

public class LinkedList
{
    Node head;
    public LinkedList()
    {
        head = null;
    }

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data ;
        node.next = null;

        if(head==null)
        {
            head=node;
        }

        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("the linked list is empty");
        }
        else
        {
            Node n =head;
            while(n.next!=null)
            {
                System.out.println(n.data);
            }
            System.out.println(n.data);
        }
    }

    public void search(int value)
    {
        if(head==null)
        {
            System.out.println("the linked list is empty");
        }
        Node n = head;

        while(n.next!=null)
        {
            if(n.data==value)
            {
                System.out.println(" value found");
                break;
            }
        }


    }
    public void removeHead()
    {
        if (head==null)
        {
            System.out.println("link list is empty , nothing to delete");
        }
        else {
            Node temp;
            temp = head;
            head = head.next;
        }

    }
}
