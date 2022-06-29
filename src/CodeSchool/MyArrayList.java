package CodeSchool;

public class MyArrayList<T> implements DynamicArray<T> {

    private Object[] objects = new Object[10];


    //Avelacnuma element
    @Override
    public void add(T value) {
        if (size() == objects.length) {
            Object[] cloneObjects = this.objects;
            this.objects = new Object[2 * cloneObjects.length];

            for (int i = 0; i < cloneObjects.length; i++) {
                objects[i] = cloneObjects[i];
            }
        }
        objects[size()] = (T) value;
    }


    //jnjuma element
    @Override
    public void remove(int index) {
        try {

            if (index >= size()) {
                throw new Exception();
            }

            Object[] cloneObjects = new Object[this.objects.length];

            for (int i = 0; i < this.objects.length; i++) {
                cloneObjects[i] = this.objects[i];
            }

            cloneObjects[index] = null;

            clear();

            for (int i = 0; i < cloneObjects.length; i++) {
                if (cloneObjects[i] != null) {
                    this.add((T) cloneObjects[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Wrong Index!!!");
        }
    }


    //get-a anum element
    @Override
    public T getElement(int index) {
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) this.objects[index];
    }


    //talis dynamic zangvaci chapy
    @Override
    public int size() {
        int cout = 0;

        for (int i = 0; i < this.objects.length; i++) {

            if (this.objects[i] != null) {
                cout++;
            } else {
                break;
            }

        }

        return cout;
    }


    @Override
    public void clear() {
        for (int i = 0; i < this.objects.length; i++) {
            if (this.objects[i] == null) {
                break;
            } else {
                this.objects[i] = null;
            }
        }

    }


}
