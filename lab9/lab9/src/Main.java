import java.util.*;

   class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Олег", 1));
        students.add(new Student("Надія", 2));
        students.add(new Student("Ігор", 3));
        students.add(new Student("Юля", 1));
        students.add(new Student("Петро", 2));
        students.add(new Student("Марія", 1));
        students.add(new Student("Ольга", 3));
        students.add(new Student("Іван", 2));
        students.add(new Student("Світлана", 3));
        students.add(new Student("Максим", 1));

        int course = 1;
        System.out.println("Студенти на " + course + " курсі:");
        printStudents(students, course);
    }
}