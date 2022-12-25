package linkedlistt;

public class LinkedList<m> {

    node head = null;
    node tail = null;
    int size = 0;

    public void addFirst(node n) {            //   1  2 3 4 5 
        n.next = head;
        head = n;       //node n=new node(4);
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(node m) {
        tail.next = m;
        tail = tail.next;
        size++;
        if (tail == null) {
            tail = head = m;
        }
    }

    public void add(int index, node e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            node temp = current.next;
            current.next = e;
            (current.next).next = temp;
            size++;
        }
    }

    public void removeLast() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            node temp = head;
            head = tail = null;
            size = 0;
        } else {
            node current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            node temp = tail;
            tail = current;
            tail.next = null;
            size--;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            return;
        } else {
            node temp = head;
// Keep the first node temporarily 
            head = head.next;
// Move head to point to next node 
            size--;
            if (head == null) {
                tail = null;
            }
// List becomes empty 
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
//end loop 
            node current = previous.next;
            previous.next = current.next;
            size--;
        }
    } 
    public void print() {
        node c = head;
        while (c != null) {
            System.out.println(c.data);
            c = c.next;

        }
    }


}
