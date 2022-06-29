package CodeSchool;

public class MyLinkedList<T> implements DynamicArray<T> {
    private Node<T> value;
    private int size;

    //Default Constructor
    MyLinkedList() {
        this.size = 0;
    }

    //Avelacnuma element verjic
    @Override
    public void add(T value) {
        if (this.size == 0) {
            addBeginning(value);
        } else {
            Node<T> newNode = new Node<T>();
            newNode.setValue(value);
            Node<T> temp = this.value;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newNode);
            newNode.setPrev(temp);
            newNode.setNext(null);
            this.size++;

        }
    }

    //Avelacnuma element skzbic
    public void addBeginning(T value) {
        Node<T> newNode = new Node<T>();
        newNode.setValue(value);

        if (this.size == 0) {
            newNode.setNext(this.value);
            this.value = newNode;
        } else {

            newNode.setNext(this.value);
            this.value = newNode;
            this.value.getNext().setPrev(newNode);

        }

        this.size++;
    }

    //jnjuma element
    @Override
    public void remove(int index) {
        try {
            if (index >= size) {
                throw new Exception();
            }
                int i = 0;
                Node<T> node = this.value;

                while (i < index) {
                    i++;
                    node = node.getNext();
                }

                Node<T> next = node.getNext().getNext();
                next.setPrev(node);
                node.setNext(next);

                this.size--;

        }catch (Exception e){
            System.out.println("Wrong Index!!!");
        }
    }


    //get-a anum element
    @Override
    public T getElement(int index) {
        int counter = 0;
        Node<T> newNode = this.value;

        while (counter != index) {
            newNode = newNode.getNext();
            counter++;
        }

        return newNode.getValue();
    }


    //talis dynamic zangvaci chapy
    @Override
    public int size() {
        return this.size;
    }


    @Override
    public void clear() {
        size = 0;
    }
}
