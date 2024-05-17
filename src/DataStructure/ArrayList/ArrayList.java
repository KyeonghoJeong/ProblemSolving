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