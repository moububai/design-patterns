package iterator;

import java.util.*;

/*
 * Allows the user to see the changes when creating a document, giving the ability to redo and undo those changes
 * 
 * Current Stacks in the Document:
 *  undoStack
 *  redoStack
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 30, 2023
 */

public class Document {

    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /*
     * Starts the Document Stacks 
     * 
     * Allows for the document to see changes with the undoStack and redoStack. Addionallty, the title for the 
     * document is declared here, currently unchangable.
     * 
     * @param title     The name of the Document
     */

    public Document(String title){
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();
    }

    /*
     * Add's a change to the given document
     * 
     * Changes are stored in the undoStack
     * 
     * @param change    The change added to the undo document
     * @return String   Tell's Driver/User the change added to the stack
     */

    public String makeChange(String change){
        return "Making change: " + undoStack.push(change);
    }

    /*
     * Undoes a last change commited to the undoStack
     * 
     * Checks if the undoStack contains a change and pushes it into the redoStack
     * 
     * @return String   Tell's Driver/User what change is being undone
     */

    public String undoChange(){
        if (!canUndo()) return null;
        return "Undoing: " + redoStack.push(undoStack.pop());
    }

    /*
     * Determine's if the undoStack is contains an item or is empty.
     * 
     * @return Boolean      Tell's the user if the current undoStack contains an item
     */

    public boolean canUndo(){
        return !(undoStack.empty());
    }

    /*
     * Undoes a last change commited to the redoStack
     * 
     * Checks if the redoStack contains a change and pushes it into the undoStack
     * 
     * @return String   Tell's Driver/User what change is being redone
     */

    public String redoChange(){
        if (!canRedo()) return null;
        return "Redoing: " + undoStack.push(redoStack.pop());
    }

    /*
     * Determine's if the redoStack is contains an item or is empty.
     * 
     * @return Boolean      Tell's the user if the current redoStack contains an item
     */

    public boolean canRedo(){
        return !(redoStack.empty());
    }

    /*
     * Allows the user to see each Stack in the undoStack
     * 
     * @return StackIterator    returns the undoStack as a StackIterator
     */

    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }

    /*
     * Allows the user to see each Stack in the redoStack
     * 
     * @return StackIterator    returns the redoStack as a StackIterator
     */

    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
     
}
