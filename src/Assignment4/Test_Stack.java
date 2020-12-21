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
public class Test_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push("marc");
        stack.push("charbel");
        stack.push("elie");
        stack.push("joe");
        stack.print();
        stack.reverseCopy();
       
    }
}
