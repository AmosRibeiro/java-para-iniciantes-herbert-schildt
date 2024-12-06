package capitulo13.genericqueue;

import capitulo09.queue.QueueEmptyException;
import capitulo09.queue.QueueFullException;

public interface IGenQ<T> {

    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
    
}
