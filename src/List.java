public interface List <T> {
    void add(T item);
    T getElement(int index);
    T remove(int index);
    int getSize();
    boolean contains(Object o);
    void clear();
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();

}