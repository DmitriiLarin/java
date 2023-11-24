package project4.task1;

public enum Season {
    SUMMER(25) {
        @Override
        public String getDescription() {
            return("Теплое время года");
        }
    },
    AUTUMN(8),
    WINTER(-5),
    SPRING(15);

    private int temp;
    private Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return("Холодное время года");
    }
}
