package DataStructure.LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
		
		System.out.println(customLinkedList.size());
		System.out.println(customLinkedList.isEmpty());
		
		customLinkedList.add(1);
		customLinkedList.print();
		
		customLinkedList.add(2);
		customLinkedList.print();
		
		customLinkedList.add(3);
		customLinkedList.print();
		
		customLinkedList.add(1, 4);
		customLinkedList.print();
		
		customLinkedList.add(0, 5);
		customLinkedList.print();
		
		customLinkedList.add(5, 6);
		customLinkedList.print();
		
		customLinkedList.add(6, 7);
		customLinkedList.print();
		
		customLinkedList.add(7, 8);
		customLinkedList.print();
		
		customLinkedList.add(8, 9);
		customLinkedList.print();
		
		System.out.println(customLinkedList.get(0));
		System.out.println(customLinkedList.get(4));
		System.out.println(customLinkedList.get(8));
		
		customLinkedList.remove(8);
		customLinkedList.print();
		
		customLinkedList.remove(0);
		customLinkedList.print();
		
		customLinkedList.remove(1);
		customLinkedList.print();
		
		customLinkedList.remove(2);
		customLinkedList.print();
		
		customLinkedList.set(3, 100);
		customLinkedList.print();
		
		System.out.println(customLinkedList.size());
		System.out.println(customLinkedList.isEmpty());
	
		customLinkedList.initialize(7);
		customLinkedList.print();
	}
	
}