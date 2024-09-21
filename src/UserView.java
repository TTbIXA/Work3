import java.util.List;

public interface UserView<T extends User>{
    /*
    Вывод в консоль List<T>.
    * */
    void sendOnConsole(List<T> list);
}
