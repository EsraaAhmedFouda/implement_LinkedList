/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistt;

/**
 *
 * @author power
 */
public class Linkedlistt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList ls =new LinkedList();
        ls.addFirst(new node(5));
        ls.addFirst(new node(4));
        ls.addFirst(new node(3));
        ls.addLast(new  node(6));
        ls.removeFirst();
        ls.removeLast();
        ls.remove(1);
        ls.print();
        
      //  ls.add_first(4);
      
    }
    
}
