package DataStructure.ArrayList;

public class CustomArrayList<E> {
	
	private int capacity = 1;
	private Object[] arr;
	private int size;
	
	public CustomArrayList() {
		this.arr = new Object[capacity];
		this.size = 0;
	}
	
	public void resizeArray() {
		int newCapacity = arr.length * 2;
		Object[] newArr = new Object[newCapacity];
		
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		arr = newArr;
	}
	
	public void add(E e) {
		if(size == arr.length) resizeArray();
		
		arr[size++] = e;
	}
	
	public void add(int idx, E e) {
		if(size == arr.length) resizeArray();
		
		for(int i=size; i>idx; i--) arr[i] = arr[i-1];
		
		arr[idx] = e;
		
		size++;
	}
	
	public void remove(int idx) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size: "+size);
		
		for(int i=idx; i<size-1; i++) arr[i] = arr[i+1];
		
		size--;
	}
	
	public void set(int idx, E e) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size: "+size);
		
		arr[idx] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int idx) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size: "+size);
		
		return (E) arr[idx];
	}
	
	public void initialize(E e) {
		for(int i=0; i<size; i++) arr[i] = e;
	}
	
	public void print() {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]);
			
			if(i != size-1) System.out.print(" ");
		}
		
		System.out.println();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		
		return false;
	}
	
}
