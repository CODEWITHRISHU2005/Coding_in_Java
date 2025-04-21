package com.DSA;

class MyLinked_List {

    Node head;
    private int size;

    public void setSize(int size) {
        size = 0;
    }

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("NoSuchElementException");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("NoSuchElementException");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public void addAt(int idx, int data) throws NullPointerException {
        if (idx > size || idx < 0) {
            System.out.println("Warning! Invalid Index value");
            return;
        }
        Node newNode = new Node(data);
        if (head == null || idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (i == idx) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }

    }

    public void deleteAt(int target) {
        if (head == null) {
            System.out.println("NoSuchElementException");
            return;
        }
        if (head.data == target) {
            head = head.next;
            size--;
            return;
        }
        Node currNode = head;
        Node nextNode = head.next;
        while (nextNode != null) {
            if (nextNode.data == target) {
                currNode.next = nextNode.next;
                size--;
                return;
            }
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        System.out.println("NoSuchElementException");
    }

    public void reverseIterative() {
        if(head == null || head.next == null)
            return;        
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public int getSize() {
        return size;
    }

    public int indexOf(int target) {
        Node currNode = head;
        int idx = 0;
        while (currNode != null) {
            if (currNode.data == target) {
                return idx;
            }
            currNode = currNode.next;
            idx++;
        }
        return -1;
    }

    public void printList() {
        Node currNode = head;
        System.out.print("[");
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null" + "]" + "\n");
    }

    public static void main(String[] args) {
        MyLinked_List list = new MyLinked_List();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        // list.deleteFirst();
        // list.deleteLast();
        // list.deleteAt(2);
        // try {
        // 	list.addAt(1, 4);
        // 	list.addAt(0, 1);
        // }
        // catch(Exception e) {
        // 	System.out.println("NullPointerException");
        // }
        //System.out.println(list.indexOf(4));
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        //System.out.println("\n" + list.getSize());
    }
}
