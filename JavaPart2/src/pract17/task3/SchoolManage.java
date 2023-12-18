package pract17.task3;

public class SchoolManage
{
    public static void main(String[] args)
    {
        View view = new View();
        Model model = FillingDatabaseModel();
        Controller controller = new Controller(model, view);

        controller.Update();
    }

    public static Model FillingDatabaseModel()
    {
        Model model = new Model();

        model.setSchoolName("1547");
        model.setSchoolAddress("Belorechenskaya 26/7");
        model.addingStudent("Nick", 16, 4.5);
        model.addingStudent("Val", 17, 3.8);
        model.addingStudent("Nastya", 16, 4.7);
        model.addingStudent("Slava", 17, 4.9);

        return model;
    }
}
