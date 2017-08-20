package Queue;

import Helpers.Helper;

public class InvokeQueue {
    public static void main(String[] args) {
        invokeQueue();
//        invokeQueueOnArray();
    }

    public static void invokeQueue() {
        Queue queue = new Queue();
        queue.isEmpty();
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
        Helper.printString(String.valueOf(queue.isEmpty()));
        Helper.printString(String.valueOf(queue.getPickOfQueue()));
        Helper.printString(String.valueOf(queue.getLastAdded()));
        Helper.printString(String.valueOf(queue.removeFromQueue()));
        Helper.printString(String.valueOf(queue.getPickOfQueue()));
    }

    public static void invokeQueueOnArray() {
        QueueOnArray queue = new QueueOnArray(5);
        Helper.printString(String.valueOf(queue.isEmpty()));
        queue.addToQueue(10);
        queue.addToQueue(11);
        queue.addToQueue(5);
        queue.printQueue();
        Helper.printString(String.valueOf(queue.getLastAdded()));
        Helper.printString(String.valueOf(queue.getPickOfQueue()));
        Helper.printString(String.valueOf(queue.removeFromQueue()));
        Helper.printString(String.valueOf(queue.getPickOfQueue()));
        Helper.printString(String.valueOf(queue.isEmpty()));
    }
}
