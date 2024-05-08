package org.algo.DataStructures;

@SuppressWarnings("unused")
public class SinglyLinkedList<type> implements LinearLink<type>{
    protected static class Node <type>{
        type value;
        Node<type> next;
        public Node( type value) {
            this.value = value;
            this.next = null;
        }
    }
    //Declare LinkedList class data member
    protected Node<type> head;
    public SinglyLinkedList(){
        this.head = null;
    }

    @Override
    public void print(){
        StringBuilder text = new StringBuilder();
        if(this.head == null){
            text.append("null");

        }else if(this.head.next == null){
            text.append(this.head.value);
        }else{
            Node<type> temp = this.head;

            while(temp.next != null) {
                if(temp.value != null){
                    text.append(temp.value);
                    text.append(" -> ");

                }
                temp = temp.next;
            }
            text.append(temp.value);
        }

        text.append(" -> null");
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
            Node<type> temp = this.head;
            count = 1;
            while(temp.next != null){
                temp = temp.next;
                count += 1;
            }
        }
        return count;
    }

    //Insert at the beginning
    @Override
    public void addFirst(type data){
        Node<type> newNode = new Node<>(data);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head =  newNode;
    }
    //Insert at the end
    @Override
    public void addLast(type data){
        if(this.head == null){
            this.head = new Node <>(data);
        }else {
            Node<type> temp = this.head; //Here An object of a class works as pointer which means temp access this.head memory location.
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node<>(data);
        }

    }
    // Insert in a particular position
    @Override
    public boolean add(int position , type data){
        Node<type> temp = this.head;
        for(int i =0; temp != null && i < position - 1; i++){
            temp = temp.next;
        }
        Node<type> newNode = new Node<>(data);
        if(temp != null && temp.next != null) {
            newNode.next = temp.next;
            temp.next = newNode;
            return true;
        } else{
            return false;
        }
    }
    //Update particular node's value
    @Override
    public boolean set(int position , type value){
        Node<type> temp = this.head;
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

    //Delete at the beginning
    @Override
    public void removeFirst(){
        if(this.head !=null ){
            if(this.head.next == null){
                this.head = null;
            }else{
                this.head = this.head.next;
            }
        }
    }
    @Override
    public void removeLast(){
        if(this.head != null){
            if(this.head.next == null){
                this.head = null;
            }else if(this.head.next.next == null){
                this.head.next = null;

            }else{
                Node<type> temp = this.head;
                while(temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
            }
        }

    }

}
