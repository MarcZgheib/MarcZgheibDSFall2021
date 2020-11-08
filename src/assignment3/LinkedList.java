/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author User
 */
public class LinkedList implements ListInterface {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(Object nodeValue) {
        this.head = new Node(nodeValue);
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
            //you can also check here if head.getNext() == null to return 1
            //but it's not necessary as it will be checked in the loop
        } else {
            Node currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    //clear linked list
    public void makeEmpty() {
        this.head = null;
    }

    @Override
    public void add(Object newElement) {
        if (head == null) { //or if(isEmpty())
            head = new Node(newElement);
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(newElement));
        }
    }

    public Node getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        //initialize
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    public Node getNode(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            Node currentNode = this.head;
            int i = 0;
            while (currentNode != null) {
                if (i == index) {
                    return currentNode;
                }
                i++;
                currentNode = currentNode.getNext();
            }
            throw new RuntimeException("Object at given index is not found!");
        }
    }

    @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    //similar to contain method
    @Override
    public int indexOf(Object element) {
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)){
                return index;
        }
        index++;
        currentNode=currentNode.getNext();
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Course homework
    //Hint: make use of get functions defined above
    @Override
    public Object remove(int index) {
        if (isEmpty())
        {  
            throw new RuntimeException("list is empty");
        }
        else
        {
            for (int i = 0; i < index; i++) {
                Node currentNode = head;
            }
            Node currentNode = null;
                   
        }
        return index;
    }

    @Override
    public boolean remove(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
