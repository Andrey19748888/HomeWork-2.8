import java.util.Objects;
import java.util.Random;

public class Task {
    static Random r = new Random();
    private int n1;
    private int n2;


    public Task() {
        this.n1 = r.nextInt(8)+2;
        this.n2 = r.nextInt(8)+2;
    }

    @Override
    public String toString() {
        return n1 + "*" + n2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;

        return (n1 == task.n1 && n2 == task.n2) || (n1 == task.n2 && n2 == task.n1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n1+n2, n1*n2);
    }
}
