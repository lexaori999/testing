import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public boolean canBePromoted() {
        return getAverageGrade() >= 3.0;
    }

    public void promote() {
        if (canBePromoted()) {
            this.course++;
        }
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public static void removeLowPerformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        students.forEach(Student::promote);
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }

    @Override
    public String toString() {
        return name + " (группа: " + group + ", курс: " + course + ", средний балл: " + getAverageGrade() + ")";
    }
}