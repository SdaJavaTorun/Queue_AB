package sdajava.queue;

/**
 * Created by Andrzej on 09.03.2017.
 */
public class QueueImplementation {

    private String value;  //wartosc ktora bedziemy chcieli wlozyc do kolejki
    private QueueImplementation next; //wskazuje nastepny element

    public QueueImplementation(String value){
        this.value=value;
        this.next=null;   //wartosc nast elementu ustawiona na null, przy inicjalizacji
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public QueueImplementation getNext() {
        return next;
    }

    public void setNext(QueueImplementation next) {
        this.next = next;
    }





}
