/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import list.ArrayList;

/**
 *
 * @author User
 */
public class Stack {

    private list.List list = new ArrayList();
    
    public int size()
    {
        return list.size();
    }
    
    public void push(Object element)
    {
        list.add(element);
    }
    
    public Object pop()
    {
        return list.remove(list.size()-1);
    }
}
