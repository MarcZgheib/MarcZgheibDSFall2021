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
public class Test_Ordered_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Ordered_Queue queue = new Ordered_Queue();
       queue.enqueue("fouad");
       queue.enqueue("ziad"); 
       queue.enqueue("ahmad");
       queue.dequeue();
       queue.dequeue();
       queue.dequeue();
       
               
               
     
    }
}
