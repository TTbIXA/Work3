import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
/*
логгер для класса TeacherView.
* */
    Logger logger = Logger.getLogger(TeacherView.class.getName());
/*
Прием списка учителей и записывание в лог.
* */
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user: teachers){
            logger.info(user.toString());
        }

    }
}
