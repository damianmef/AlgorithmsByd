package List;

import Helpers.Helper;

public class List {
    private ListElement first = null;
    private ListElement last = null;

    public void addToList(int value) {

        ListElement newItem = new ListElement(value);

        if (this.first == null) {
            this.first = newItem;
        }

        if (this.last != null) {
            this.last.setNext(newItem);
            newItem.setPrev(this.last);
        }

        this.last = newItem;
    }

    public void removeFirst() {

        if (this.first != null) {
            this.first = this.first.getNext();
        }

    }

    public void removeLast() {
        if (this.last != null) {
            this.last = this.last.getPrev();
        }
    }

    public void printQueue()
    {
        if (this.first != null) {
            ListElement item = this.first;
            do {
                Helper.printInt(item.getValue());
                item = item.getNext();
            } while (item.getNext() != null);
            Helper.printInt(item.getValue());
        }
    }

    public void reversePrintQueue()
    {
        if (this.last != null) {
            ListElement item = this.last;
            do {
                Helper.printInt(item.getValue());
                item = item.getPrev();
            } while (item.getPrev() != null);
            Helper.printInt(item.getValue());
        }
    }


    public int removeByValue(int value) {

//        ListElement temp = this.first;
//        if (this.first != null) {
//            do {
//                if (temp.getValue() == value) {
//                    // remove item
//                    if(temp.getPrev() != null) {
//                        temp.getPrev().setNext(temp.getNext());
//                    }
//                    if(temp.getNext() != null) {
//                        temp.getNext().setPrev(temp.getPrev());
//                    }
//
//                }
//                temp = temp.getNext();
//            } while (temp.getNext() != null);
//        }
        if (this.first != null) {
            do {
                if (first.getValue() == value) {
                    // remove item
                    if(first.getPrev() != null) {
                        first.getPrev().setNext(first.getNext());
                    }
                    if(first.getNext() != null) {
                        first.getNext().setPrev(first.getPrev());
                    }
                }
                first = first.getNext();
            } while (first.getNext() != null);

            ListElement temp = this.last;
            do {
                this.first = temp.getPrev();
                temp = temp.getPrev();
            } while (temp.getPrev() != null);
        }

        return -1;

    }


}
