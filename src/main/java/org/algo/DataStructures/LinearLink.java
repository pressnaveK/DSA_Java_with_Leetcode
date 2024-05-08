package org.algo.DataStructures;


@SuppressWarnings("unused")
public interface LinearLink <type> {
    void print();
    int length();
    void addFirst(type data);
    void addLast(type data);
    boolean add(int position , type data);
    boolean set(int position , type value);
    void removeFirst();
    void removeLast();
}
