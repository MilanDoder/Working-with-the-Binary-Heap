/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwiththebinaryheap;

/**
 *
 * @author milan
 */
public class WorkingWithTheBinaryHeap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeapFullException, HeapEmptyException {
        // TODO code application logic here
        System.out.println("BInary Heap");
        
        MaxHeap<Integer> maxHeap = new MaxHeap<>(Integer.class);
        
        System.out.println(maxHeap);
        maxHeap.insert(4);
                System.out.println(maxHeap);
                
        maxHeap.insert(10);
        System.out.println(maxHeap);
         
        maxHeap.insert(56);
        System.out.println(maxHeap);
        
        
        maxHeap.insert(6);
        System.out.println(maxHeap);
        
        System.out.println("Highest priority: "+ maxHeap.getHighestPriority());
        
        Integer removeHighestPriority = maxHeap.removeHighestPriority();
        System.out.println(removeHighestPriority );
        
        System.out.println(maxHeap);

        
    }
    
}
