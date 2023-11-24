package project4.task4;

public enum ComputerBrand {
    APPLE("Apple"),
    DNS("DNS"),
    ASUS("Asus"),
    AVAST("Avast"),
    LENOVO("Lenovo");

    private String name;

    private ComputerBrand (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
