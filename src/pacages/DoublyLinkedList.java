package pacages;

import jdk.internal.icu.impl.NormalizerImpl;

import java.util.Scanner;

class Node
{
    protected Cars data;
    protected Node next, prev;

    /* Constructor */
    public Node()
    {
        next = null;
        prev = null;
        data = null;
    }
    /* Constructor */
    public Node(Cars d, Node n, Node p)
    {
        data = d;
        next = n;
        prev = p;
    }
    /* Function to set link to next node */
    public void setLinkNext(Node n)
    {
        next = n;
    }
    /* Function to set link to previous node */
    public void setLinkPrev(Node p)
    {
        prev = p;
    }
    /* Funtion to get link to next node */
    public Node getLinkNext()
    {
        return next;
    }
    /* Function to get link to previous node */
    public Node getLinkPrev()
    {
        return prev;
    }
    /* Function to set data to node */
    public void setData(Cars d)
    {
        data = d;
    }
    /* Function to get data from node */
    public Cars getData()
    {
        return data;
    }
}

/* Class linkedList */
public class DoublyLinkedList
{
    protected Node start;
    protected Node end ;
    public int size;

    /* Constructor */
    public DoublyLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at begining */
    public void appendAtHead(Cars val)
    {
        Node nptr = new Node(val, null, null);
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }
    /* Function to insert element at end */
    public void appendAtTail(Cars val)
    {
        Node nptr = new Node(val, null, null);
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }

    /* Function to remove element at end */
    public void deleteAtTail()
    {
        end = end.getLinkPrev();
        end.setLinkNext(null);
        size-- ;
    }

    public void deleteAtHead()
    {
        start = start.getLinkNext();
        start.setLinkPrev(null);
        size--;
    }


    /* Function to display the list */
    public void display()
    {
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null)
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "\n");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            System.out.print(ptr.getData()+ "\n");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n\n");
    }

    public Cars filter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Car Brand:");
        String brand = sc.nextLine();

        if (size == 0)
        {
            System.out.print("empty\n");
            return null;
        }
        if (start.getLinkNext() == null)
        {
            if(start.getData().getMake().equals(brand) ){
            System.out.println(start.getData() );}
            return start.getData();
        }
        Node ptr = start;
        if(start.getData().getMake().equals(brand) ){
        System.out.print(start.getData()+ "\n");
        return start.getData();}
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            if(ptr.getData().getMake().equals(brand) ){
            System.out.print(ptr.getData()+ "\n");
            return ptr.getData();}
            ptr = ptr.getLinkNext();
        }
        if(ptr.getData().getMake().equals(brand) ){
        System.out.print(ptr.getData()+ "\n\n");
        return ptr.getData();}

        return null;
    }



    public void MinHeap() {
    }
}
