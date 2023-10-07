package iterator;

import java.util.*;

/*
 * Allows the ability to tranverse the Stack
 * 
 * This allows us to go through the elements of a Stack<String>. Implements the java.util.Iterator
 * Current uses in Document class: 
 *  undoStack
 *  redoStack
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 30, 2023
 */

public class StackIterator implements Iterator{

    private Stack<String> items;
    private int position = 0;

    /*
     * A new Stack Iterator is created to tranverse across the given elements in the stack
     * 
     * @param items     The stack of items to tranverse
     */

    public StackIterator(Stack<String> items){
        this.items = items;
    }

    /*
     * Gives the user the item in the stack
     * 
     * Tranverses through the Stack, through the pointer: Position. Relies on method hasNext() to 
     * ge the item in the stack, and pointer to determine if the position exist or is null. 
     * 
     * @return item     The current index of the item in the Iterator is returned in String
     */

    public String next(){
        if (!hasNext()) return null;
        String item = items.get(position);
        position++;
        return item;
    }
    
    /*
     * Determines if there exist an element in the stack
     * 
     * The position points to an element in the stack and check's the stack size to determine if the position is valid.
     * 
     * @return boolean      True if there is a next element in the stack
     */

    public boolean hasNext(){
        return position < items.size();
    }
    
}
