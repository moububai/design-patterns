package iterator;

import java.util.*;

public class StackIterator implements Iterator{

    private Stack<String> items;
    private int position = 0;

    public StackIterator(Stack<String> items){
        this.items = items;
    }

    public String next(){
        if (!hasNext()) return null;
        String item = items.get(position);
        position++;
        return item;
    }

    public boolean hasNext(){
        return !(items.empty()) && position < items.size();
    }
    
}
