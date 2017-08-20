package Queue;

import Helpers.Helper;

public class Queue {

    private QueueElement first = null;
    private QueueElement last = null;

    public void addToQueue(int value) {

        QueueElement item = new QueueElement(value);
        item.setPrev(this.last);
        this.last = item;

        if (this.first == null) {
            this.first = item;
        }
    }

    public int removeFromQueue()
    {
        if (this.last != null) {
            int temp = this.last.getValue();
            this.last = this.last.getPrev();
            return temp;
        }
        return -1;
    }

    public boolean isEmpty()
    {
        if (this.last == null) {
            return true;
        }

        return false;
    }

    public int getPickOfQueue()
    {
        if (this.first != null) {
            return this.first.getValue();
        }

        return -1;
    }

    public int getLastAdded()
    {
        if (this.last != null) {
            return this.last.getValue();
        }

        return -1;
    }

    public void printQueue()
    {
        if (this.last != null) {
            QueueElement temp = this.last;
            while(temp.getPrev() != null) {
                Helper.printInt(temp.getValue());
                temp = temp.getPrev();
            }
            Helper.printInt(temp.getValue());
        }

    }
}
