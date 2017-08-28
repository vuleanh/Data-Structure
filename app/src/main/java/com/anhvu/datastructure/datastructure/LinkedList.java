package com.anhvu.datastructure.datastructure;

/**
 * Created by leanh on 8/27/17.
 */

public class LinkedList {

    private Node root;
    private int size;

    public LinkedList(int data) {
        this.root = new Node(data);
        this.size = 1;
    }

    /**
     *
     * @param data
     * @return
     */
    public Node insertToStart(int data){
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    /**
     *
     * @param data
     * @return
     */
    public Node insertToEnd(int data){
        Node newNode = new Node(data);
        Node thisNode = this.root;
        Node prevNode = null;
        while (thisNode != null){
            prevNode = thisNode;
            thisNode = thisNode.getNext();
        }

        prevNode.setNext(newNode);
        this.root = prevNode;
        return prevNode;
    }

    /**
     *
     * @param data
     * @return
     */
    public Node find(int data){
        Node thisNode = this.root;

        while (thisNode != null){
            if (thisNode.getData() == data) {
                return thisNode;
            }
            thisNode = thisNode.getNext();
        }

        return null;
    }

    /**
     *
     * @param data
     * @return
     */
    public boolean remove(int data){
        Node thisNode = this.root;
        Node prevNode = null;

        while (thisNode != null){
            if (thisNode.getData() == data) {
                prevNode.setNext(thisNode.getNext());
                this.root = prevNode;
                return true;
            }

            prevNode = thisNode;
            thisNode = thisNode.getNext();
        }

        return false;
    }

    /**
     *
     */
    public void print(){
        Node thisNode = this.root;

        while (thisNode != null){
            System.out.println(thisNode.getData() + " ");
            thisNode = thisNode.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
