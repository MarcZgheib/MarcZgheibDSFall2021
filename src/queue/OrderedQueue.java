/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import List.ArrayList;

/**
 *
 * @author User
 */
public class OrderedQueue<T extends Comparable> {

    private List.List list = new ArrayList();

    public int size() {
        return list.size();
    }

    public void enqueue(T element) {

        if (list.size() == 0) {
            list.add(element);
        } else {
            for (int i = 0; i < size(); i++) {
                T ithElement = (T) list.get(i);
                if (element.compareTo(ithElement) < 0) {
                    list.insert(i,element);
                    break;
                }
            }
            list.add(element);
        }
    }

    public T dequeue() {
        return (T) list.remove(0);
    }

    public static void main(String args[]) {
        OrderedQueue<String> q = new OrderedQueue<>();
        q.enqueue("Fouad");
        q.enqueue("Ziad");
        q.enqueue("Ahmad");
        q.enqueue("Mohamad");
        q.enqueue("Ali");

        System.out.println("First element is: " + q.dequeue());
        System.out.println("Second element is: " + q.dequeue());
        System.out.println("Third element is: " + q.dequeue());
        System.out.println("Fourth element is: " + q.dequeue());
        System.out.println("Fifth element is: " + q.dequeue());
    }
}
