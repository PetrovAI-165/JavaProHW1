import java.sql.Array;
import java.util.*;

public class CustomArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = new Object[10];
    private static final Object[] DEFAULTCAPACITY_EMPTY_ARRAY = new Object[10];
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
        listSize = baseArray.length-1;
    }

    /*
        Constructor for empty array without given value
    */
    public CustomArrayList() {
            this.baseArray = DEFAULTCAPACITY_EMPTY_ARRAY;
            listSize = baseArray.length-1;
    }

    public String toString(){
        String result = new String();
        for(int i = 0;i<listSize;i++){
            if(baseArray[i]!=null){
                result+= baseArray[i].toString()+" ";
            }
        }
        return result;
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
        return listSize;
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
        return baseArray;
    }

    @Override
    public boolean add(E o) {
        if(listSize >= baseArray.length){
            int i = 0;
            E[] buffer = (E[]) new Object[(int)(listSize*1.5+1)];

            for ( i = 0; i < listSize; i++ ) {
               buffer[i] =  (E)baseArray[i];
            }

            buffer[listSize]=o;
            baseArray = buffer;
            listSize+=1;
        }else{
            baseArray[listSize]=o;
            listSize+=1;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {

            Object[] buffer = new Object[listSize];

            for(int i = 0; i < listSize; i++){
                if(baseArray[i].equals(o)){
                    baseArray[i]=null;
                }
            }

            for (int i = 0; i <= listSize; i++ ) {
                if(baseArray[i]!=null){
                    buffer[i] = baseArray[i];
                }else{

                }
            }

            baseArray =  buffer;

        return true;
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
    public void add(int index, E element) {

    }

    @Override
    public Object set(int index, Object element) {
        return null;
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


