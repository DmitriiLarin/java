package pract17.task1;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class StudentController implements Observer {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void start() {
        view.showApp();
    }

    @Override
    public void update(Observable o, Object arg) {
        Map data = (Map)arg;
        String name = (String) data.get("name");
        String rollNo = (String) data.get("rollNo");
        setStudentName(name);
        setStudentRollNo(rollNo);

        view.updateStudent(name, rollNo);
    }
}
