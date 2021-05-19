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
public class HeapEmptyException extends Exception{
    
    private static final long serailVersionUID =1L;

    public HeapEmptyException(String message){
        super(message);
    }
}
