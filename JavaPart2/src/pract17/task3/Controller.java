package pract17.task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller
{
    private Model model;
    private View view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    public void UpdateName()
    {
        view.getButtonName().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.getLabel().setText("School name: " + model.getSchoolName());
            }
        });
    }

    public void UpdateAddress()
    {
        view.getButtonAddress().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.getLabel().setText("School address: " + model.getSchoolAddress());
            }
        });
    }

    public void UpdateStudentsInfo()
    {
        view.getButtonStudents().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                List <Model.Student> students = model.getStudentList();
                String info = "";

                for(int i = 0; i < students.size(); i++)
                {
                    info += "Student " + students.get(i).getName() + " age is " + students.get(i).getAge() + " has average score " + students.get(i).getAvgScore() + "\n";
                }

                view.getLabel().setText(info);
            }
        });
    }

    public void Update()
    {
        UpdateName();
        UpdateAddress();
        UpdateStudentsInfo();
    }
}
