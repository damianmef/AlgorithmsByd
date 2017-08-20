package Queue;

import Helpers.Helper;

public class Queue {

    private QueueElement first = null;
    private QueueElement last = null;

    public void addToQueue(int value) {

        QueueElement item = new QueueElement(value);

        if (this.first == null) {
            this.first = item;
        }
        if (last != null) {
            this.last.setNext(item);
        }
        this.last = item;
    }

    public int removeFromQueue()
    {
        if (this.first != null) {
            int temp = this.first.getValue();
            this.first = first.getNext();
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
        if (this.first != null) {
            QueueElement temp = this.first;
            while(temp.getNext() != null) {
                Helper.printInt(temp.getValue());
                temp = temp.getNext();
            }
            Helper.printInt(temp.getValue());
        }

    }
}
