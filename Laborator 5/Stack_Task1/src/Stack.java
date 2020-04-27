public interface Stack<T> {
    T pop();
    void push(T nr);
    boolean isEmpty();
    boolean isFull();
    T peek();
}
