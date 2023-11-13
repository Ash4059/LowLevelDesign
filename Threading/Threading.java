package Threading;

public class Threading {
    
    
    public static void Main(String args[]){
        
        SharedResource resource = new SharedResource(5);

        Thread produceThread = new Thread(() -> {
            for(int i = 0; i <= 6; i++){
                resource.produceItem(i);
            }
        });
    
        Thread consumeThread = new Thread(() -> {
            for(int i = 0; i <= 6; i++){
                resource.consumeItem();
            }
        });
        produceThread.start();
        consumeThread.start();
    }

}
