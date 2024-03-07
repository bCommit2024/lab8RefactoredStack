package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<E> extends ArrayList<E> {
    private ArrayList<E> delegate;
    public MyStack() {
        this.delegate=this;
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (delegate.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(delegate.size() - 1);
        delegate.remove(delegate.size() -1 );
        return e;
    }

    @Override
    public boolean isEmpty(){
        return (delegate.size() == 0);
    }

    @Override
    public int size(){
        int sizeDelegate = 0;
        for ( Iterator<E> iterateDelegate = delegate.iterator();iterateDelegate.hasNext();iterateDelegate.next()) {
            sizeDelegate++;
        }
        return sizeDelegate;
    }
}
