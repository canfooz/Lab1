/**
 * @autor Chekmarev Andrey
 * 3rd year, 7th group
 * @version 1.1
 *  ArrayList implementation class
 */
import java.util.Arrays;

public class ArrayList<T> {
    /** Last index field */
    private int lastIndex = 0;

    /** Initial lenght field */
    private static final int SIZE = 2;

    /** Array of size SIZE */
    private Object[] array = new Object[SIZE];

    /**
     * @param newElement - some T element
     * Increases the array size by 1
     * Places the newElement in a new array element
     */
    public void add(T newElement) {
        if(lastIndex == array.length-1)
        array = Arrays.copyOf(array, array.length + 1);
        array[lastIndex++] = newElement;
    }

    /**
     * Getter-method
     * @param index - some int value
     * @return T element returns an element with index of parameter
     * @throws IndexOutOfBoundsException if no such index exists
     */
    T get(int index) {
        if (index > lastIndex)
            throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    /**
     * Getter-method
     * @param index - some int value
     *  Removes an element with the index specified in the parameter
     * @throws IndexOutOfBoundsException if no such index exists
     */
    void remove(int index) {
        if (index > lastIndex)
            throw new IndexOutOfBoundsException();
        else
            System.arraycopy(array, index + 1, array, index, --lastIndex - index);
        lastIndex--;
    }
}


