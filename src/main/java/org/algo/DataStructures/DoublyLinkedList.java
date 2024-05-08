package org.algo.DataStructures;

@SuppressWarnings("unused")
public class DoublyLinkedList<type> implements LinearLink<type> {

    protected static class DNode<type> {
        type value;
        DNode<type> prev;
        DNode<type> next;
        public DNode(type value) {

            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private DNode<type> head , tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void print(){
        StringBuilder text = new StringBuilder();
        if(this.head == null){
            text.append("null");

        }else if(this.head.next == null){
            text.append(this.head.value);
        }else{
            DNode<type> temp = this.head;
            while(temp.next != null) {
                if(temp.value != null){
                    text.append(temp.value);
                    text.append(" <-> ");

                }
                temp = temp.next;
            }
            text.append(temp.value);
        }
        text.append(" <-> null");
        System.out.println(text);

    }
    @Override
    public int length(){
        int count;
        if(this.head == null){
            count = 0;
        } else if(this.head.next == null){
            count = 1;
        }else{
            DNode<type> temp = this.head;
            count = 1;
            while(temp.next != null){
                temp = temp.next;
                count += 1;
            }
        }
        return count;
    }

    @Override
    public void addFirst(type data) {
        DNode<type> newNode = new DNode<>(data);
        if(this.head != null){
            newNode.next = this.head;
            this.head.prev = newNode;
        }else{
            this.tail = newNode;
        }
        this.head = newNode;
    }

    @Override
    public void addLast(type data) {
        DNode<type> newNode = new DNode<>(data);
        if(this.head != null){
            newNode.prev = this.tail;
            this.tail.next = newNode;
        }else{
            this.head = newNode;
        }
        this.tail = newNode;
    }

    @Override
    public boolean add(int position, type data) {
        DNode<type> temp = this.head;
        for(int i =0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }
        DNode<type> newNode = new DNode<>(data);
        if(temp != null && temp.next != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            return true;
        } else{
            return false;
        }

    }

    @Override
    public boolean set(int position, type value) {
        DNode<type> temp = this.head; // Just only traverse , therefore single node is enough
        for(int i =0; temp != null && i < position ; i++){
            temp = temp.next;
        }
        if(temp != null){
            temp.value = value;
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void removeFirst() {


    }

    @Override
    public void removeLast() {

    }
}
