/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emilio Díaz y Samantha Duarte
 */
public class VectorHeapTest {

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add("A");
        instance.add("B");
        instance.add("C");
        instance.add("D");
        assertEquals("A",instance.remove());
        
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add("S");
        assertEquals("S",instance.getFirst());
    }

 
    
}
