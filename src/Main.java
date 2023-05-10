import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Veronika", "Dozhdzhanyk");
        Student student2 = new Student(2, "Ivan", "Check");
        Student student3 = new Student(3, "Oleg", "Bodnar");
        Group group = new Group(student2);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        System.out.println("Captain: " + group.getCaptain().getName() + " " + group.getCaptain().getSurname());
        System.out.println("Students: ");
        for (Student student : group.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname());
        }

        List<Student> renamedStudents = group.renameStudent(student1.getName(), student1.getSurname(), "Veronika", "Bodnar" );
        renamedStudents.addAll(group.renameStudent(student2.getName(), student2.getSurname(), "Ivan", "Smit"));

        System.out.println("Renamed students: ");
        for (Student student : renamedStudents) {
            System.out.println(student.getName() + " " + student.getSurname());
        }

        group.addTask("Task 1");
        group.addTask("Task 2");
        System.out.println("Tasks: ");
        for (String task : group.getTasks()) {
            System.out.println(task);
        }
        group.markTaskAsDone(student1, "Task 1");
    }
}