package capitulo9.queue;

public interface ICharQ {
    
    void put(char ch) throws QueueFullException;

    char get() throws QueueEmptyException;
}