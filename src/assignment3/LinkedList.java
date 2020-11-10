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

 public class LinkedList implements list {
     
     private class Node {
     
         Object value;
         Node next;
     
        public Node (Object value){
        
            this.value=value;
     }
     
     }
     private Node head;

    @Override
    public void add(Object newElement) {
        if (head == null) {
                
            head = new Node(newElement);
            }
        else
        {
            Node currentNode = head;
            while (currentNode.next != null)
            {                
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(newElement);
        }
    }

    @Override
    public Object get(int index) {
        
            Node currentNode = head;
            int counter = 0;
            while(currentNode != null)
            {
                if(counter==index){
                    return currentNode.value;
                }
                currentNode = currentNode.next;
                counter++;
            }
        
         throw new IndexOutOfBoundsException("Index not found: " + index);
    }

    @Override
    public int size() {
        Node currentNode = head;
        int counter=0;
        while (currentNode!=null)
            {
                currentNode = currentNode.next;
                counter++;
            }
            return counter;
        
    }

    @Override
    public int indexOf(Object element) {
        Node currentNode = head;
        int counter=0;
        while(currentNode!=null)
        {
            if(currentNode.value.equals(element))
            {
                return counter;
            }
            counter++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        
        Node currentNode = head;
        Node previousNode;
        int counter=0;
        while(currentNode!=null)
        {
            if(counter == index)
            {
                previousNode = currentNode.next;
                currentNode = null;
                return currentNode;
                
            }
            counter++;
            currentNode=currentNode.next;
        }
        throw new ArrayIndexOutOfBoundsException("index not found: " +index );
    }

    @Override
    public boolean remove(Object element) {
        Node currentNode = head;
        Node previousNode;
        while(currentNode != null)
        {
            if(currentNode.value.equals(element))
            {
                previousNode = currentNode.next;
                currentNode = null;
                return true; 
            }
            currentNode=currentNode.next;
        }
        
        return false;
    }
     
 }