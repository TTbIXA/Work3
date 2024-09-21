import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
/*
Отслежование текущей позиции в списке и хранение ссылки на список студентов.
* */
    private int counter;
    private final List<Student> students;
/*
Получение списка студентов из StudentGroup
* */
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }
/*
Проверка есть ли следующий элемент в списке.
* */
    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }
/*
Возращение следующего элемента в интерации.
* */
    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
