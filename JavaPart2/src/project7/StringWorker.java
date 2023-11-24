package project7;

public class StringWorker implements StringWorkable {
    @Override
    public int countCharacters(String line) {
        return line.length();
    }

    @Override
    public String getOddCharacters(String line) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < line.length(); i+=2) {
            builder.append(line.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String invert(String line) {
        StringBuilder builder = new StringBuilder();
        for (int i = line.length()-1; i >= 0; i--) {
            builder.append(line.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String line = "hello mirea!";
        StringWorker worker = new StringWorker();
        System.out.println(worker.countCharacters(line));
        System.out.println(worker.getOddCharacters(line));
        System.out.println(worker.invert(line));
    }
}
