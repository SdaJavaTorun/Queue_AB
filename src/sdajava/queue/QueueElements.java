package sdajava.queue;

/**
 * Created by Andrzej on 09.03.2017.
 */
public class QueueElements {

    private QueueImplementation first;
    private QueueImplementation last;

    public QueueElements() {
        first = last = null;  //zerowanie obydwu wartości
    }

    public QueueImplementation getFirst() {
        return first;
    }

    public void setFirst(QueueImplementation first) {
        this.first = first;
    }

    public QueueImplementation getLast() {
        return last;
    }

    public void setLast(QueueImplementation last) {
        this.last = last;
    }

    //dodajemy metodę
    public void add(String value){
        QueueImplementation queue = new QueueImplementation(value);  // QueueImplementation  to jeden element kolejki
                                                                    // QueueElements to cała struktura
        //jezeli kolejka jest pusta to element przychodzacy jest pierwszy i sotatni
        if (first==null){
            first = last = queue;
        }
        else{
            //jezeli kolejka nie jest pusta to element przychodzacy jest ustawiany jako ostatni
            last.setNext(queue); //kolejnego ustawiamy jako nasteonego w kolejce
            last=queue;             //a ostatni bedzie wyznaczac koniec kolejki
        }
    }

    public void show() {
        if(first != null){
            QueueImplementation element = first;
            while(element!=null){
                System.out.println(element.getValue());
                element=element.getNext();
            }
        }
    }
}
