import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{
/*
Инициализация логгера для класса StudentView.
* */
    Logger logger = Logger.getLogger(StudentView.class.getName());
/*
Запись информации в лог.
* */
    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }
/*
Отображение информации о группе студентов.
* */
    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}