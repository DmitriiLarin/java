package pract23.task1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Module size: " + ArrayQueueModule.size());
        System.out.println("Module element: " + ArrayQueueModule.element());
        System.out.println("Module dequeue: " + ArrayQueueModule.dequeue());
        System.out.println("Module size after dequeue: " + ArrayQueueModule.size());

        ArrayQueueADT queueADT = new ArrayQueue();
        queueADT.enqueue(3);
        queueADT.enqueue(4);
        System.out.println("ADT size: " + queueADT.size());
        System.out.println("ADT element: " + queueADT.element());
        System.out.println("ADT dequeue: " + queueADT.dequeue());
        System.out.println("ADT size after dequeue: " + queueADT.size());
    }
}
