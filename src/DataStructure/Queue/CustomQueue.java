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
	
	
	
	/*
	
	private LinkedList<E> linkedList;
	
	public CustomQueue() {
		this.linkedList = new LinkedList<E>();
	}
	
	public void add(E e) {
		linkedList.add(e);
	}

	public E poll() {
		E e = linkedList.get(0);
		linkedList.remove(0);
		
		return e;
	}

	public E peek() {
		return linkedList.get(0);
	}

	public E back() {
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
	
	public CustomQueue() {
		this.customLinkedList = new CustomLinkedList<E>();
	}
	
	public void add(E e) {
		customLinkedList.add(e);
	}

	public E poll() {
		E e = customLinkedList.get(0);
		customLinkedList.remove(0);
		
		return e;
	}

	public E peek() {
		return customLinkedList.get(0);
	}

	public E back() {
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
