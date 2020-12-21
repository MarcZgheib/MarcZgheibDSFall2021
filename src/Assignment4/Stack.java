/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * @author User
 */
public class Stack {

    private Object array[];
    private int top;

    public Stack() {

        array = new Object[10];
        top = -1;
    }

    public Stack(int maxSize) {
        array = new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top + 1 == 0;
    }

    public void makeEmpty() {
        if (!isEmpty()) {
            top = -1;

        }
    }

    public boolean isFull() {
        return top + 1 == array.length;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is empty. No values to show.");
        } else {
            return array[top];
        }
    }

    public void push(Object value) {
        if (isFull()) {
            expand();
        }
        top++;
        array[top] = value;
    }

    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException("Stack is empty. No values to remove.");
        } else {
            top--;
        }
    }

    public void expand() {
        Object[] newArray = new Object[array.length * 2];

        System.arraycopy(array, 0, newArray, 0, array.length);

        this.array = newArray;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + "=> ");
            }
            System.out.println();
        }
    }

    public Stack copy() {
        Stack newStack = new Stack(array.length);
        for (int i = 0; i < top + 1; i++) {
            newStack.array[i] = array[i];
            newStack.top++;
        }
        newStack.print();
        return newStack;
    }

    public Stack reverseCopy() {
        Stack newStack = new Stack(array.length);
        for (int i = 0; i < top + 1; i++) {
            newStack.array[i] = array[top - i];
            newStack.top++;
        }
        newStack.print();
        return newStack;
    }
}
