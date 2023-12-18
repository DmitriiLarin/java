package pract23.task2;

interface Queue<E> {
    void enqueue(E element);

    E dequeue();

    E peek();

    int size();

    boolean isEmpty();
    void clear();
}