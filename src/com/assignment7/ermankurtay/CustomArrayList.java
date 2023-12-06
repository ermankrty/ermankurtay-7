package com.assignment7.ermankurtay;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {


    private Object[] items = new Object[10];
	private int size = 0;
	private int counter = 0;
	

 
    
    @Override
	public boolean add(T item) {
		
		if (item == null) return false;
 
		if (items.length == size) {
	 
 
			items = Arrays.copyOf(items, items.length * 2);
 
			items[counter] = item;
 
			counter++;
 
			size++;
 
		}
 
		else {
	 
			items[counter] = item;
 
			size++;
 
			counter++;
			
		}
 
		return true;
 
	}

   

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
    	
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }

        items[index] = item;
        size++;
        return true;
    }
    

	
    
    

    @Override
    public int getSize() {
    	
    	int count =0;
		for(int i=0; i < items.length; i++) {
	
		if (items[i] != null){
		
		count ++;
	}
		}
			return items.length;
}    

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            T result = (T) items[index];
            return result;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

   
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if(index < 0 && index > size) {
			throw new IndexOutOfBoundsException();
			
		}
		T itemToRemove = (T) items[index];
		
		for(int i = index;i < size-1;i++) {
			
			items[i] = items[i+1];
		}
		
		items[size-1] = null;
		size--;
		
		
		return itemToRemove;
	}
}
