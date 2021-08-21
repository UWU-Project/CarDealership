package pacages;

public class MaxHeap
{
    private Cars[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new Cars[this.maxsize + 1];
        Heap[0] = null;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size)
        {
            return true;
        }
        return false;
    }

    private void swap(int fpos,int spos)
    {
        Cars tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void maxHeapify(int pos)
    {
        if (!isLeaf(pos))
        {
            if ( Heap[pos].getPrice() < Heap[leftChild(pos)].getPrice() || Heap[pos].getPrice() < Heap[rightChild(pos)].getPrice())
            {
                if (Heap[leftChild(pos)].getPrice() > Heap[rightChild(pos)].getPrice())
                {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insertion(Cars car)
    {


        Heap[++size] = car;
        int current = size-1;
        if(size>2)
        {
            while(Heap[current].getPrice() > Heap[parent(current)].getPrice())
            {
                swap(current,parent(current));
                current = parent(current);
            }
        }

    }


    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }

    public Cars extraction()
    {
        Cars popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        maxHeapify(FRONT);
        return popped;
    }


    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }
}