package Heap;

import Helpers.Helper;

public class HeapOnArray {

    private int[] heap;
    private int currentIndex = 0;

    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void addToHeap(int item) {
        if (currentIndex < this.heap.length -1) {
            this.heap[this.currentIndex] = item;
            this.currentIndex++;
        }
    }

    public int removeFromHeap() {
        if (currentIndex > 0) {
            currentIndex--;
            return this.heap[this.currentIndex];
        }
        return 0;
    }

    public boolean isEmpty() {
        if (this.currentIndex == 0) {
            return true;
        }
        return false;
    }

    public int getPickOfHeap()
    {
        return this.heap[this.currentIndex-1];
    }

    public void printHeap() {
        for(int i = 0; i < this.currentIndex;i++) {
            Helper.printInt(this.heap[i]);
        }
    }

}
