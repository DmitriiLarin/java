package project13.task2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр");
        Person person3 = new Person("Сидоров");

        System.out.println(person1.getFullName()); // Выводит "Иванов И.И."
        System.out.println(person2.getFullName()); // Выводит "Петров П."
        System.out.println(person3.getFullName()); // Выводит "Сидоров"
    }
}
