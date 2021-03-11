
public class StackQueues<T extends Comparable> {
    LinkedList listadd=new LinkedList();

    public void push(T value)
    {
        this.listadd.addAtEnd(value);
        this.listadd.displayList();
    }
    public void pop()
    {
        this.listadd.deleteFirstElement();
        this.listadd.displayList();
    }
    public void queue_push(T value)
    {
        this.listadd.addAtEnd(value);
        this.listadd.displayList();
    }
    public void queue_pop()
    {
        this.listadd.deleteFirstElement();
        this.listadd.displayList();

    }
}
