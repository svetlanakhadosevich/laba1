public class Cont<T> {

    private Object[] mas;
    private int size = 1;

    public Cont() {
        mas = new Object[size];
    }

    public T get(int i) {
        final T e = (T) mas[i];
        return e;
    }

    public T set(int index, T element) {
        T temp = (T) mas[index];
        mas[index] = element;
        return temp;
    }

    public void remove(int index) {
        size--;
        Object[] arrTemp = new Object[size];
        int indexTemp = 0;
        for (int ind = 0; ind < size + 1; ind++) {
            if (ind == index) {

                continue;
            }
            arrTemp[indexTemp] = mas[ind];
            indexTemp++;
        }
        mas = arrTemp;
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(mas[i])) return i;
        }
        return -1;
    }

    public int size() {
        return size - 1;
    }

    public void add(T value) {
        mas[size - 1] = value;
        size++;
        Object[] arrTemp = new Object[size];
        System.arraycopy(mas, 0, arrTemp, 0, size - 1);
        mas = arrTemp;
    }

    public void clear() {
        while (size != 1) {
            remove(size - 1);
        }
    }
}
