package Queue;

public class Queue {
    int [] queue;
    int front =0;
    int rear =-1;
    int size=0;
    public Queue(){
        queue=new int[5];
    }
    public Queue(int size){
        queue = new int[size];
    }
   public  boolean isEmpty(){
    return size==0;
   }
   public boolean isFull(){
    return size==queue.length;
   }
   public void enque(int val){
    if (isFull()) {
        System.out.println("Queue is full"); 
    }
    rear=(rear+1)%queue.length;
    queue[rear] = val;
    size++;



   }
   public int Denque(){
    if (isEmpty()) {
        System.out.println("Queue is Empty"); 
        return -1;
    }
    int val = queue[front];
    front = (front+1)%queue.length;
    size--;
    return val;



   }
   public static void main(String[] args) {
    Queue q = new Queue();
    q.enque(5);
    q.enque(8);
    q.enque(5);
    q.enque(8);
    q.enque(5);
    q.enque(8);
    q.display();
   }
private void display() {
    for (int i = 0; i < queue.length; i++) {
       System.out.print(queue[i]+" ");
    }

}

}
