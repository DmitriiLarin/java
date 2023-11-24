package project4.task4;

public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public class Processor {
        private int hz;

        public Processor(int hz) {
            this.hz = hz;
        }

        public void run() {
            System.out.println("Процессор запущен...");
        }
    }
    public class Memory {
        private int freeMemory;
        private int expendedMemory = 0;
        public Memory(int freeMemory) {
            this.freeMemory = freeMemory;
        }
        public void showFreeMemory() {
            System.out.println("Доступно " + freeMemory + "ГБ памяти");
        }
        public void showExpendedMemory() {
            System.out.println("Используется " + expendedMemory + "ГБ памяти");
        }
        public void expendMemory(int memory) {
            expendedMemory += memory;
            freeMemory -= memory;
        }
    }
    public class Monitor {
        private int width;
        private int lenght;

        public Monitor(int width, int lenght) {
            this.width = width;
            this.lenght = lenght;
        }

        public void run() {
            System.out.println("Монитор запущен...");
        }
    }

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.monitor = monitor;
        this.memory = memory;
        this.processor = processor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
