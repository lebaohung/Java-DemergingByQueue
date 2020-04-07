import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hung", "female", LocalDate.of(1996, 2,12));
        Student student2 = new Student("Thai", "male", LocalDate.of(1996, 1,7));
        Student student3 = new Student("Hana", "famale", LocalDate.of(1996, 05, 05));
        Student student4 = new Student("John", "male", LocalDate.of(1996,9,9));

        LinkedList<Student> studentList = new LinkedList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Controller controller = new Controller(studentList);
        controller.sortByGender();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getName());
        }
     }
}
