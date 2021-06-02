public class QueueUsingArray {
    int[] data;
    int front;
    int rear;
    int size;
    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;

    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    int front() throws QueueEmptyException {
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
    void Enqueue(int element) throws QueueFullException {
        if(size() == data.length){
//            throw new QueueFullException();
            doubleCapacity();
        }
        if(size() == 0){
            front = 0;
        }
        rear++;
        if(size() == data.length){
            rear = 0;
        }
        size++;
        data[rear] = element;
    }
    private void doubleCapacity(){
        int[] temp = data;
        data = new int[2*temp.length];
        int index = 0;
        for(int i = front; i<temp.length; i++){
            data[index] = temp[i];
            index++;
        }
        for(int i = 0; i<=front-1;i++){
            data[index] = temp[i];
            index++;
        }

    }
    int Dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new   QueueEmptyException();
        }
        if(size == 0){
            front = -1;
            rear = -1;
        }
        int temp = data[front];
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        return temp;

    }
}

