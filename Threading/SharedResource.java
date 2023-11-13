package Threading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        this.bufferSize = bufferSize;
        sharedBuffer = new LinkedList<>();
    }

    public synchronized void produceItem(int item){
        System.out.println("Inside produce item method");
        if(bufferSize == 0){
            System.out.println("Buffer size is full");
            try { 
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        sharedBuffer.add(item);
        System.out.println("Item added successfully!!!");
        bufferSize--;
        notify();
    }

    public synchronized int consumeItem(){
        while(sharedBuffer.size() == 0){
            System.out.println("Buffer size is empty");
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        int item = sharedBuffer.poll();
        System.out.println("Item consumed successfully!!!");
        notify();
        return item;
    }

}
