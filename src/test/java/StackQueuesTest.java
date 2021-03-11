import org.junit.jupiter.api.Test;

public class StackQueuesTest {

    @Test
    public void aadAtEnd()
    {
        StackQueues list =new StackQueues();
        list.push(56);
        list.push(30);
        list.push(70);
    }

    @Test
    public void pop_at_front()
    {
        StackQueues list =new StackQueues();
        int i=0;
        list.push(56);
        list.push(30);
        list.push(70);
        System.out.println("After deleting");
        while(i < 3)
        {
            list.pop();
            i++;
        }
    }

    @Test
    public void AddAtEnd()
    {
        StackQueues list =new StackQueues();
        list.queue_push(56);
        list.queue_push(30);
        list.queue_push(70);
    }

    @Test
    public void deleteAtfirst()
    {
        StackQueues list =new StackQueues();
        int i=0;
        list.queue_push(56);
        list.queue_push(30);
        list.queue_push(70);
        System.out.println("After deleting");
        while(i<3)
        {
            list.queue_pop();
            i++;
        }
    }
}


