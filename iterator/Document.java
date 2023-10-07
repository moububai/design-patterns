package iterator;

import java.util.*;

/*
 * 
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 30, 2023
 */

public class Document {

    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public Document(String title){
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();
    }

    public String makeChange(String change){
        return "Making change: " + undoStack.push(change);
    }

    public String undoChange(){
        if (!canUndo()) return null;
        return "Undoing: " + redoStack.push(undoStack.pop());
    }

    public boolean canUndo(){
        return !(undoStack.empty());
    }

    public String redoChange(){
        if (!canRedo()) return null;
        return "Redoing: " + undoStack.push(redoStack.pop());
    }

    public boolean canRedo(){
        return !(redoStack.empty());
    }

    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
     
}
