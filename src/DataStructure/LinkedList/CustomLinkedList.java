package DataStructure.LinkedList;

public class CustomLinkedList<E> {
	
	private static class Node<E> {
		
		private Node<E> prev;
		private Node<E> next;
		private E e;
		
		public Node() {
			this.prev = null;
			this.next = null;
			this.e = null;
		}
		
	}
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public CustomLinkedList() {
		this.head = new Node<>();
		this.tail = new Node<>();
		this.size = 0;
	}
	
	public Node<E> searchNode(int idx){
		Node<E> node = head;
		
		for(int i=0; i<=idx; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	public void add(E e) {
		add(size, e);
	}
	
	public void add(int idx, E e) {
		if(idx < 0 || idx > size) throw new IndexOutOfBoundsException("Index: "+idx+", Size: "+size);
		
		Node<E> newNode = new Node<>();
		newNode.e = e;
		
		if(size == 0) {
			head.next = newNode;
			newNode.prev = head;
			
			newNode.next = tail;
			tail.prev = newNode;
		}else {
			Node<E> node = searchNode(idx);
			
			node.prev.next = newNode;
			newNode.prev = node.prev;
			
			newNode.next = node;
			node.prev = newNode;
		}
		
		size++;
	}
	
	public void remove(int idx) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size"+size);
		
		Node<E> node = searchNode(idx);
		
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
		node = null;
		
		size--;
	}
	
	public void set(int idx, E e) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size"+size);
		
		Node<E> node = searchNode(idx);
		
		node.e = e;
	}
	
	public E get(int idx) {
		if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Index: "+idx+", Size"+size);
		
		Node<E> node = searchNode(idx);
		
		return node.e;
	}
	
	public void initialize(E e) {
		Node<E> node = head;
		
		for(int i=0; i<size; i++) {
			node = node.next;
			node.e = e;
		}
	}
	
	public void print() {
		Node<E> node = head;
		
		while(node.next.e != null) {
			node = node.next;

			System.out.print(node.e);
			
			if(node.next.e != null) System.out.print(" ");
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

