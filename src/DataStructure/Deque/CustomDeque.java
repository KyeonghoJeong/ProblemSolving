package DataStructure.Deque;

public class CustomDeque<E> {

	
	
	private int capacity = 10000;
	private Object[] arr;
	private int head;
	private int tail;
	
	public CustomDeque() {
		this.arr = new Object[capacity * 2 + 1];
		this.head = capacity;
		this.tail = capacity;
	}
	
	public void addFirst(E e) {
		arr[--head] = e;
	}
	
	public void addLast(E e) {
		arr[tail++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E pollFirst() {
		return (E) arr[head++];
	}
	
	@SuppressWarnings("unchecked")
	public E pollLast() {
		return (E) arr[--tail];
	}
	
	@SuppressWarnings("unchecked")
	public E peekFirst() {
		return (E) arr[head];
	}
	
	@SuppressWarnings("unchecked")
	public E peekLast() {
		return (E) arr[tail-1];
	}
	
	public int size() {
		return tail-head;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		
		return false;
	}
	
	
	
	/*
	
	private LinkedList<E> linkedList;
	
	public CustomDeque() {
		this.linkedList = new LinkedList<E>();
	}
	
	public void addFirst(E e) {
		linkedList.add(0, e);
	}
	
	public void addLast(E e) {
		linkedList.add(e);
	}
	
	public E pollFirst() {
		E e = linkedList.get(0);
		linkedList.remove(0);
		
		return e;
	}
	
	public E pollLast() {
		E e = linkedList.get(linkedList.size()-1);
		linkedList.remove(linkedList.size()-1);
		
		return e;
	}
	
	public E peekFirst() {
		return linkedList.get(0);
	}
	
	public E peekLast() {
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
	
	public CustomDeque() {
		this.customLinkedList = new CustomLinkedList<E>();
	}
	
	public void addFirst(E e) {
		customLinkedList.add(0, e);
	}
	
	public void addLast(E e) {
		customLinkedList.add(e);
	}
	
	public E pollFirst() {
		E e = customLinkedList.get(0);
		customLinkedList.remove(0);
		
		return e;
	}
	
	public E pollLast() {
		E e = customLinkedList.get(customLinkedList.size()-1);
		customLinkedList.remove(customLinkedList.size()-1);
		
		return e;
	}
	
	public E peekFirst() {
		return customLinkedList.get(0);
	}
	
	public E peekLast() {
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
