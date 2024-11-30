package capitulo9.queue;

public class QueueEmptyException extends Exception{
    
    public String toString(){
        return "\nQueue is empty.";
    }
}
