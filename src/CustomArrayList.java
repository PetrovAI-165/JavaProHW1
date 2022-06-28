import java.util.*;

public class CustomArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ARRAY = {};
    private int listSize;
    Object[] baseArray;

    /*
       Constructor for empty list with given capacity
    */
    public CustomArrayList (int capacity){
        if (capacity > 0) {
            //set array with given capacity
            this.baseArray = new Object[capacity];
        } else if (capacity == 0) {
            //set empty array
            this.baseArray = EMPTY_ARRAY;
        } else {
            //for negative values
            throw new IllegalArgumentException("Cannot be lass then 0");
        }
    }

    /*
        Constructor for empty array without given value
    */
    public CustomArrayList() {
            this.baseArray = DEFAULTCAPACITY_EMPTY_ARRAY;
    }

    /*
        Constructor for arraylist with given values
    */
    public CustomArrayList(Collection<? extends E> givenList) {
        Object[] array = givenList.toArray();
        listSize = array.length;
        if (listSize != 0) {
            if (givenList.getClass() == CustomArrayList.class) {
                baseArray = array;
            } else {
                baseArray = Arrays.copyOf(array, listSize, Object[].class);
            }
        } else {
            baseArray = EMPTY_ARRAY;
        }
    }

    @Override
    public int size() {
        return baseArray.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}