import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student captain;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public Group(Student captain) {
        this.captain = captain;
    }

    public Student getCaptain() {
        return captain;
    }

    public void setCaptain(Student captain) {
        this.captain = captain;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> renameStudent(String oldName, String oldSurname, String newName, String newSurname) {
        List<Student> renamedStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(oldName) && student.getSurname().equals(oldSurname)) {
                if (!student.getName().equals(newName) || !student.getSurname().equals(newSurname)) {
                    student.setName(newName);
                    student.setSurname(newSurname);
                    renamedStudents.add(student);
                }
                break;
            }
        }
        return renamedStudents;
    }


    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
    public void markTaskAsDone(Student student, String task) {
        for (int i = 0; i < tasks.size(); i++) {
            String currentTask = tasks.get(i);
            if (currentTask.equals(task)) {
                System.out.println("Task \"" + task + "\" has been marked as done for student "
                        + student.getName() + " " + student.getSurname());
                break;
            }
        }
    }
}

