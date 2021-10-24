package com.company;

public class MyArrayList <T> {
    private Object[] data = new Object[0];
    private int length = 0;

    public void add(T element){
        if (length == data.length){
            Object[] newData = new Object[data.length*2+1];
            System.arraycopy(data,0, newData,0, data.length);
            data = newData;
        }
        data[length] = element;
        length++;
    }

    public T get(int index){
        if ((index >= length) || (index < 0)){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) data[index];
    }

    public int getLength() {
        return length;
    }

    public void clear(){
        data = new Object[0];
        length = 0;
    }
}
