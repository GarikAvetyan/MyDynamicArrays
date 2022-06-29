package CodeSchool;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;


    //getters
    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }


    //setters
    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
