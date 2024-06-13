package Stack;

import java.util.*;
import java.util.EmptyStackException;

public class Stack {
    int size=0;
    int st[];
    int tos =-1;
    ArrayList<Integer> list = new ArrayList<>();
    Stack(){
        st = new int[5];

    }
    Stack(int size){
        st = new int[size];

    }
   public boolean isEmpty(){
    return tos==-1;
   }
   public boolean isFull(){
    return tos==st.length-1;
   }
   public void push(int val) throws Exception{
    if (isFull()) {
       int [] newst = new int[2*st.length];
   st=Arrays.copyOf(newst, 2*st.length);

       st=newst;
    }
    st[++tos]=val;
    size++;
    
   }
   public int pop() throws Exception{
    if (isEmpty()) {
        throw new Exception("Stack is Empty");
    }
    int data = st[tos--];
    size--;
    return data;
    
   }
   public int peek() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    return st[tos];
   }
   public int size(){
    return size;
   }


  
    public static void main(String[] args) throws Exception  {
        Stack s = new Stack();
        s.push(8);
        s.push(8);
        s.push(8);
        s.push(8);
        s.push(8);
        s.push(8);
      
        System.out.println(s.size);
    }
    
}
