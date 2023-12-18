package pract23.task1;

import java.util.Arrays;

abstract class ArrayQueueADT {
    protected Object[] elements;
    protected int size;
    protected int front;
    protected int rear;

    public abstract void enqueue(Object element);

    public abstract Object element();

    public abstract Object dequeue();

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void clear();

    protected void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}
