package Heap;

public class HeapElement {
    private int value;
    private int id;
    private HeapElement prev = null;

    public HeapElement(int value, HeapElement prev, int id)
    {
        this.value = value;
        this.prev = prev;
        this.id = id;
    }
    public HeapElement(HeapElement item)
    {
        this.value = item.value;
        this.prev = item.prev;
    }

    public int getValue() {
        return this.value;
    }

    public HeapElement getPrev() {
        return this.prev;
    }
    public void setPrev(HeapElement item) {
        this.prev = item;
    }
}
