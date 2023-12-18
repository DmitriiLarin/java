package pract23.task1;

import java.util.Arrays;

class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements = new Object[DEFAULT_CAPACITY];
    private static int size = 0;
    private static int front = 0;
    private static int rear = -1;

    public static void enqueue(Object element) {
        ensureCapacity();
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = -1;
    }

    private static void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}