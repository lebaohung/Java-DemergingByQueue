import java.util.LinkedList;
import java.util.Queue;

public class Controller {
    private LinkedList<Student> list;

    public Controller(LinkedList<Student> list) {
        this.list = list;
    }

    public LinkedList<Student> sortByGender() {
        Queue<Student> queue = new LinkedList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender().equals("male")) {
                queue.add(list.get(i));
                list.remove(i);
            }
        }
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }
}
