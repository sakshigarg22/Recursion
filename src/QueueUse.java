public class QueueUse {
    public static void main(String[] args) {
//        QueueUsingArray queue = new QueueUsingArray(3);
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();

        for(int i=1; i<=5; i++){
//            try{
//                queue.Enqueue(i);
//            } catch (QueueFullException e) {
//            }
            queue.Enqueue(i);
        }
        while(!queue.isEmpty()){
            try{
                System.out.println(queue.Dequeue());
            } catch (QueueEmptyException e){
                e.printStackTrace();
            }
        }
    }
}
