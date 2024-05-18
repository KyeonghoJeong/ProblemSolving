package DataStructure.Stack;

public class CustomStack<E> {
	
	private int capacity = 10000;
	private Object[] arr;
	private int size;
	
	public CustomStack() {
		this.arr = new Object[capacity];
		this.size = 0;
	}
	
	public void add(E e) {
		arr[size++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		return (E) arr[--size];
	}
	
	@SuppressWarnings("unchecked")
	public E peek() {
		return (E) arr[size-1];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		
		return false;
	}
	
}