import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectStack<T> implements Stack<T> {
    private T[] container;
    private int top = -1;
    private int size = 0;

    public ObjectStack(int size) {
        container=(T[]) new Object [size];
        this.size = size;
    }

    public T pop() {
        if (top == -1)
            return null;
        return container[top--];
    }

    public void push(T nr) {
        if (isFull()==false)
            container[++top] = nr;

         else {
            System.out.println("Overflow, Program Terminated");
            System.exit(1);
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size);
    }

    public T peek() {
        if (top == -1)
            return null;
        return container[top];
    }

    @Override
    public String toString() {

        return "ObjectStack{" +
                //"container=" + Arrays.stream(container).filter(Objects::nonNull).collect(Collectors.joining(", ", "[", "]")) +
                //"container=" + this.container.stream().filter(container::isNotBlank) +
                //"container= "+ (T[]) Arrays.stream(container) .filter(s -> (s != null )) .toArray(String[]::new)+
                "container= "+ Arrays.toString(container)+
                ", top=" + top +
                ", size=" + size +
                '}';
    }
}
