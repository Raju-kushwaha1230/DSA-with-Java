package org.mighty;

public class LL {
    // create a head and tail
    private Node head;
    private Node tail;

    // create a size
    private int size;
    // constructor to access the size


    public LL() {
        this.size = 0;
    }
    // Insert as First
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;

        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }
    // insert at last
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insert(int val,int index){
        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        Node node = new Node(val, temp.next );
        temp.next = node;
        size += 1;

    }

    public int deleteFirst(){
        int val = head.value;

        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return val;

    }

    public int deleteLast(){
        if (size <= 1){
            deleteFirst();
            return head.value;
        }
        int val = tail.value;
        Node temp = head;
        for (int i = 1; i < size -1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index){

        Node temp = head;


        return temp;

    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // create a node first
    private class Node{
        private int value;
        private Node next;

        // constructor to access the value when Node called
        public Node(int value) {
            this.value = value;
        }
        //constructor to access the value and next
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
