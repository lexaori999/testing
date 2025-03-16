import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Иван Иванов", "Группа 1", 1, Arrays.asList(4, 3, 5)),
                new Student("Петр Петров", "Группа 1", 2, Arrays.asList(2, 2, 3)),
                new Student("Анна Смирнова", "Группа 2", 1, Arrays.asList(5, 4, 5)),
                new Student("Елена Кузнецова", "Группа 2", 2, Arrays.asList(3, 3, 4))
        ));

        System.out.println("Список студентов до удаления:");
        students.forEach(System.out::println);

        Student.removeLowPerformingStudents(students);
        System.out.println("\nСписок студентов после удаления с низким баллом:");
        students.forEach(System.out::println);

        Student.promoteStudents(students);
        System.out.println("\nСписок студентов после перевода:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты на 2 курсе:");
        Student.printStudents(students, 2);
    }
}