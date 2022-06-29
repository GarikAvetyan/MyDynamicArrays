package CodeSchool;

public interface DynamicArray<T> {
    void add(T value);

    void remove(int index);

    T getElement(int index);

    int size();

    void clear();

}
