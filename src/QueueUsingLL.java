public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;
    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    T front(){
        return front.data;
    }
    void Enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(size == 0){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }
    T Dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        T tempData = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        size--;
        return tempData;
    }

}
