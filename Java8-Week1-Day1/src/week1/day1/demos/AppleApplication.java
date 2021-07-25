package week1.day1.demos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//Explicit Class written for Comparator
class AppleComparison implements Comparator<Apple> {

//	@Override
//	public int compare(Apple a1, Apple a2) {
//		
//		return a1.getColor().compareTo(a2.getColor());
//	}
	int x =90;

	@Override
	public int compare(Apple a1, Apple a2) {
		x =78;
		// TODO Auto-generated method stub
		if (a1.getWeight() == a2.getWeight())
			return 0;
		else if (a1.getWeight() > a2.getWeight())
			return 1;
		else
			return -1;
	}
}

public class AppleApplication {

	static int z =77;
	public static void main(String args[]) {

		List<Apple> listOfApples = new ArrayList<>();

		Apple apple1 = new Apple(75, "Green");
		Apple apple2 = new Apple(25, "Red");
		Apple apple3 = new Apple(100, "Red");
	
		Apple apple4 = new Apple(120, "Green");
		Apple apple5 = new Apple(15, "Red");
		Apple apple6 = new Apple(64, "DarkGreen");
		Apple apple7 = new Apple(34, "Blue");
		Apple apple8 = new Apple(34, "Orange");
		
		Apple apple9 = new Apple(34, "Alpha");
		
		listOfApples.add(apple1);
		listOfApples.add(apple2);
		listOfApples.add(apple3);
		listOfApples.add(apple4);
		
		listOfApples.add(apple5);
		listOfApples.add(apple6);
		listOfApples.add(apple7);
		listOfApples.add(apple8);
		
		listOfApples.add(apple9);

	   int x = 10; //Local Variable
		Comparator<Apple> appleComparator = new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				//z=908;
				//Cannot refer to the non-final local variable x defined in an enclosing scope
				//x =90; //Local variable x defined in an enclosing scope must be final or effectively final
				//return a1.getColor().compareTo(a2.getColor());
				if (a1.getWeight() == a2.getWeight())
					return 0;
				else if (a1.getWeight() > a2.getWeight())
					return 1;
				else
					return -1;
			}
		};

		System.out.println(listOfApples);

		listOfApples.sort(new AppleComparison());
		// //Passing in the Comparator Class for Sorting
		// listOfApples.sort(appleComparator); // Passing in the Comparator Class for
		// Sorting
		System.out.println(listOfApples);

	}
}
