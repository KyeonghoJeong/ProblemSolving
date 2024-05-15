package DataStructure.ArrayList;

public class ArrayList {
	
	public static void main(String[] args) {
		CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
		
		System.out.println(customArrayList.size());
		System.out.println(customArrayList.isEmpty());
		
		customArrayList.add(1);
		customArrayList.remove(0);
		customArrayList.print();
		
		customArrayList.add(100);
		customArrayList.add(200);
		customArrayList.add(2, 300);
		customArrayList.print();

		System.out.println(customArrayList.get(1));
		
		customArrayList.set(0, 400);
		customArrayList.print();
		
		customArrayList.remove(2);
		customArrayList.print();
		
		customArrayList.add(0, 1);
		customArrayList.add(1, 2);
		customArrayList.add(2, 3);
		customArrayList.add(3, 4);
		customArrayList.add(4, 5);
		customArrayList.add(4, 6);
		customArrayList.add(4, 7);
		customArrayList.add(4, 8);
		customArrayList.add(4, 9);
		customArrayList.add(4, 10);
		customArrayList.print();
		
		customArrayList.remove(2);
		customArrayList.remove(0);
		customArrayList.print();
		
		customArrayList.remove(0);
		customArrayList.print();
		
		customArrayList.remove(5);
		customArrayList.print();
		
		customArrayList.initialize(100);
		customArrayList.print();
		
		System.out.println(customArrayList.size());
		System.out.println(customArrayList.isEmpty());
	}
	
}

class CustomArrayList<E> {
	
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
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		
		return false;
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
	
}