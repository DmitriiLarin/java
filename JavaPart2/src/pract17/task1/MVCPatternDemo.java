package pract17.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        view.addObserver(controller);
        controller.start();
    }
}
