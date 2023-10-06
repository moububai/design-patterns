package iterator;

import java.util.*;

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
        undoStack.push(change);
        return "Making change: " + change;
    }

    public String undoChange(){
        if (canUndo()){
            return redoStack.pop();
        }
        return "";
    }

    public boolean canUndo(){
        return ! undoStack.empty();
    }

    public String redoChange(){
        if (canRedo()){
            return undoStack.pop();
        }
        return "";
    }

    public boolean canRedo(){
        return !redoStack.empty();
    }

    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
     
}
