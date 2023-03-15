import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tasks {
    public static void main(String[] args) {


        Set<Task> tasks = new HashSet<>();

        while (tasks.size() <= 15) {
            Task task = new Task();
            tasks.add(task);

        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }


}
