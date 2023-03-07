public class Pair<T> {
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(T last) {
        this.last = last;
    }

    private T first;

    public T getLast() {
        return last;
    }

    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }


    public static <K> Pair<K> create(K first, K last) {
        return new Pair<>(first, last);
    }
}

