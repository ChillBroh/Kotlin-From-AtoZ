

public class Myqueue{
    private int[] queueArr;
    private int maxSize;
    private int rear;
    private int front;
    private int nItems;

    // constractor implimentation

    public Myqueue(int s) {
        queueArr = new int[maxSize];
        maxSize = s;
        rear = -1;
        front = 0;
        nItems = 0;
    }


    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (rear == (maxSize-1));
    }

    // insert method
    public void insert(int j) {
        if(rear == (maxSize-1)){
            System.out.println("myqueue is full");
        }
        else {
            queueArr[++rear] = j;
            nItems++;
        }
    }

    // delete method
    public int remove() {
        if(nItems == 0) {
            System.out.println("Queue is Empty");
            return -99;
        }
        else {
            nItems--;
            return queueArr[front++];
        }
    }














}