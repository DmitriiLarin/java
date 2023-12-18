package pract23.task2;

import java.util.Arrays;
import java.util.NoSuchElementException;

abstract class AbstractQueue<E> implements Queue<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    protected Object[] elements;
    protected int size;
    protected int front;
    protected int rear;

    public AbstractQueue() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public void enqueue(E element) {
        ensureCapacity();
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        E removedElement = getElement(front);
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return getElement(front);
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

    protected void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @SuppressWarnings("unchecked")
    protected E getElement(int index) {
        return (E) elements[index];
    }
}