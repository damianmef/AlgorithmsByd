package Heap;

import Helpers.Helper;

public class Heap {

    private HeapElement top = null;
    private int lastId = 0;

    public void addToHeap(int value)
    {
        this.top = new HeapElement(value, this.top, this.lastId);
        this.lastId++;
    }

    public int getPickOfHeap()
    {
        if (this.top != null) {
            return this.top.getValue();
        }
        return -1;
    }

    public void printHeap()
    {
        if(this.top != null) {
            HeapElement temp = new HeapElement(this.top);
            while (temp != null) {
                Helper.printInt(temp.getValue());
                temp = temp.getPrev();
            }
        }
    }

    public int removeFromHeap()
    {
        if (this.top != null) {
            int temp = top.getValue();
            this.top = top.getPrev();
            return temp;
        }

        return -1;
    }

    public boolean isEmpty()
    {
        if (this.top == null) {
            return true;
        }

        return false;
    }

    public void removeByValue(int value) {
        if (this.top != null) {

            HeapElement temp = null;
            HeapElement last = this.top;
            do {
                if (this.top.getValue() == value) {
                    if (temp == null) {
                        this.top = this.top.getPrev();
                    }
                }
                if (temp != null) {
                    if(temp.getValue() == value) {
                        last.setPrev(temp.getPrev());
                        updateHeap(last);
                    }
                    temp = temp.getPrev();
                } else {
                    temp = this.top.getPrev();
                }

            } while (temp.getPrev() != null);
        }
    }

    public void updateHeap(HeapElement last){

        HeapElement temp = this.top;
        if(temp.getId == last.getId) {
            temp.getPrev() = last.getPrev();
        }
        temp = temp.getPrev();

    }

}
