package DataStructure.Queue;

public class CustomQueue<E> {
	
	private int capacity = 10000;
	private Object[] arr;
	private int head;
	private int tail;
	
	public CustomQueue() {
		this.arr = new Object[capacity];
		this.head = 0;
		this.tail = 0;
	}
	
	public void add(E e) {
		arr[tail++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E poll() {
		return (E) arr[head++];
	}
	
	@SuppressWarnings("unchecked")
	public E peek() {
		return (E) arr[head];
	}
	
	@SuppressWarnings("unchecked")
	public E back() {
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
