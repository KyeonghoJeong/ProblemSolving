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
	
}
