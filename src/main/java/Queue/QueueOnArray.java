package Queue;

public class QueueOnArray {

    private int[] queue;
    private int currentIndex = 0;

    public QueueOnArray(int size)
    {
        this.queue = new int[size];
    }

    public void addToQueue(int item)
    {
        if (currentIndex < this.queue.length-1) {
            this.queue[currentIndex] = item;
        }
    }




    public boolean isEmpty()
    {
        if (this.currentIndex == 0) {
            return true;
        }

        return false;
    }


}
