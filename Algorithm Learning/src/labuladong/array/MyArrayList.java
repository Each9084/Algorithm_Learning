package labuladong.array;

public class MyArrayList<E> {
    private E[] data;
    private int size;
    private static final int INIT_CAP = 1;

    public MyArrayList(){
        this(INIT_CAP);
    }

    public MyArrayList(int initCapacity) {
        data = (E[]) new Object[initCapacity];
        size = 0;
    }

    public void addLast(E e) {
        int cap = data.length;
        if (size == cap) {
            //resize(2 * cap);
        }
    }
}
