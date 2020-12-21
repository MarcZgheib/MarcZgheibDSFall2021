package Assignment4;

/**
 *
 * @author User
 */
public class Ordered_Queue {

    private String[] array;
    private int rear;

    public Ordered_Queue() {
        array = new String[10];
        rear = -1;
    }

    public Ordered_Queue(int maxSize) {
        array = new String[maxSize];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear + 1 == 0;
    }

    public void makeEmpty() {
        rear = -1;
    }

    public boolean isFull() {
        return rear + 1 == array.length;
    }

    public void expand() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void enqueue(String element) {
        if (isFull()) {
            expand();
        } else {
            for (int i = rear + 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = element;
            rear++;
        }
        sort();
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty. No values to remove.");
        } else {
            System.out.println(array[rear]);
            rear--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < rear + 1; i++) {
                System.out.print(array[i] + "=> ");
            }
            System.out.println();
        }
    }

    public void sort() {
        String current;
        for (int i = 0; i < rear + 1; i++) {
            for (int j = i+1; j < rear + 1; j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    current = array[i];
                    array[i] = array[j];
                    array[j] = current;
                }
            }
        }
    }
}
