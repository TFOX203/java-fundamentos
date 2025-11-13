package datastructure;
/*
This is a class that represents an extensible array.
An array has a fixed capacity, when reaching the end
of the array, we have to expand itautomatically.
 */

public class FlexibleArray<E>{
    //An array with fixed size
    private E[] elements;
    private static final int INITIAL_CAPACITY = 5;
    // The variable to store how many element we have added to the array
    private int size = 0;

    /**
     * we use this contructor to create an array when we know
     * how many elements to store in the array
     * @param size
     */
    public FlexibleArray(int size){

        elements = (E[]) new Object[INITIAL_CAPACITY];
    }
    /**
     * Use this contructor to create an array with a default capacity
     */
    public FlexibleArray(){
        elements = (E[]) new Object[INITIAL_CAPACITY];

    }

    /**
     * Add an element to the array at its last position
     * @param e
     */

    public void add(E e) {
        //PASO 0: Check if we have reached to the las position
        //if tru,we have to expand the capacity of the array
        //PASO 1:Add the element to the last positions of the array
    }

    /**
     * Remove the element at position "i"
     * @param i
     */
    public void remove(E i) {
    }

    public int size() {
        return 0;
    }
}
