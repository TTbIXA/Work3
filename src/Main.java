import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.create("Иван", "Иванов", "Иванович", LocalDate.of(1980, 1, 1));
        teacherController.create("Петр", "Петров", "Петрович", LocalDate.of(1985, 2, 2));
        teacherController.create("Сидор", "Сидоров", "Сидорович", LocalDate.of(1990, 3, 3));

    }
}


