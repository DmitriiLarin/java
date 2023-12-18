package pract23.task1;

import java.util.Arrays;

class ArrayQueue extends ArrayQueueADT {
    private static final int DEFAULT_CAPACITY = 10;
    public ArrayQueue() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public void enqueue(Object element) {
        ensureCapacity();
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = -1;
    }
}
