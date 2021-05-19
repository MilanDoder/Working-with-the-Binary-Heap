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
public class MaxHeap<T extends Comparable<T>> extends Heap<T>{

    public MaxHeap(Class<T> clazz){
        super(clazz);
    }
    
    @Override
    protected void siftDown(int index) {
        
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);
        
        int largerIndex =-1;
        
        if(leftIndex!=-1 && rightIndex!=-1){
            T leftElement = getElementAtIndex(leftIndex);
            T rightElement =  getElementAtIndex(rightIndex);
            
            largerIndex = leftElement.compareTo(rightElement)>0 ? leftIndex:rightIndex;      
        }else if(leftIndex!=-1){
            largerIndex =leftIndex;
        }else if(rightIndex!=-1){
            largerIndex = rightIndex;
        }
        
        if(largerIndex==-1){
            System.out.println("Stop shifting down");
            return;
        }
        
        
        if(getElementAtIndex(largerIndex).compareTo(getElementAtIndex(index))>0){
            swap(largerIndex, index);
            
            siftDown(largerIndex);
        
        }
        
    }

    @Override
    protected void siftUp(int index) {
        int parentIndex = getParentIndex(index);
        
        if(parentIndex== -1)
            return;
        
        if(getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex))>0){
            swap(parentIndex,index);
            siftUp(parentIndex);
        
        }
            

    }
    
}
