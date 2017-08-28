package com.anhvu.datastructure.datastructure;

/**
 * Created by leanh on 8/27/17.
 */

public class Node {

    private int data;

    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString(){
        return data + "";
    }
}
