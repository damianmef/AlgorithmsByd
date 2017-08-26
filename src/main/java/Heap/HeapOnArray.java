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

    public void quickCleanHeap() {
        this.currentIndex = 0;
    }

    public void cleanHeap() {
        for(int i =0; i < this.heap.length; i++) {
            this.heap[i] = 0;
        }
        quickCleanHeap();
    }

    public void removeByValue(int value) {
        int[] temp = new int[this.heap.length];
        int tempIndex = 0;
        for(int i = 0; i < this.heap.length; i++) {
            if (this.heap[i] != value) {
                temp[tempIndex] = this.heap[i];
                tempIndex++;
            } else {
                this.currentIndex--;
            }
        }
        this.heap = temp;
    }

    public void removeByValueReplace(int value) {
        for(int i = 0; i < this.heap.length; i++) {
            if (this.heap[i] == value) {
                for(int j = i+1; j < this.heap.length;j++){
                    this.heap[j-1] = this.heap[j];
                }
                this.currentIndex--;
            }
        }
        /* pętla czyszcząca elementy od currentindex w górę */
        for(int i = this.currentIndex; i < this.heap.length; i++) {
            this.heap[i] = 0;
        }
    }

}
