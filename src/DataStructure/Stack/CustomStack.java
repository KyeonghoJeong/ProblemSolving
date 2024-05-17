package DataStructure.Stack;

public class CustomStack<E> {
	
	
	
	private int capacity = 10000;
	private Object[] arr;
	private int size;
	
	public CustomStack() {
		this.arr = new Object[capacity];
		this.size = 0;
	}
	
	public void add(E element) {
		arr[size++] = element;
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
		else return false;
	}
	
	
	
	/*
	
	private LinkedList<E> linkedList;

	public CustomStack() {
		this.linkedList = new LinkedList<E>();
	}
	
	public void add(E e) {
		linkedList.add(e);
	}
	
	public E pop() {
		E e = linkedList.get(linkedList.size()-1);
		
		linkedList.remove(linkedList.size()-1);
		
		return e;
	}
	
	public E peek() {
		return linkedList.get(linkedList.size()-1);
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	*/
	
	/*
	
	private CustomLinkedList<E> customLinkedList;
	
	public CustomStack() {
		this.customLinkedList = new CustomLinkedList<E>();
	}
	
	public void add(E e) {
		customLinkedList.add(e);
	}
	
	public E pop() {
		E e = customLinkedList.get(customLinkedList.size()-1);
		customLinkedList.remove(customLinkedList.size()-1);
		
		return e;
	}
	
	public E peek() {
		return customLinkedList.get(customLinkedList.size()-1);
	}
	
	public int size() {
		return customLinkedList.size();
	}
	
	public boolean isEmpty() {
		return customLinkedList.isEmpty();
	}
	
	*/
	
}