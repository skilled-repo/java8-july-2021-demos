package week1.day1.demos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Functional Interface - Ready Made kept inside the java.util.function package
//General Purpose Function Interfaces introduced only from java 8
//1. Predicate - test() SAM input (one parameter) anything but return boolean
//2. Consumer - accept() SAM input (one parameter) is anything but return is void
//3. Supplier - get() SAM zero input but return anything
//4. Function - apply() SAM input one parameter anything and return anything
@FunctionalInterface
interface AppleSupplier { // 43 = 44
	Apple test();// SAM
}

interface Iplayer {

	public void t1();// abstract method

	public void t2();

	public void t3();
}

class Abc implements Iplayer {
	@Override
	public void t1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void t2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void t3() {
		// TODO Auto-generated method stub

	}
}

interface Sabari {
	public void coach(String course); // SAM
	// public void architect();
}

public class AppleApplicationWithLambda {

	public static void main(String args[]) {

		List<Apple> listOfApples = new ArrayList<>(); // Type Referencing

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
		// Lambda Operator ->
		// Arrow Token ->
		// Type Referencing or Type Inference (Judging)
		Comparator<Apple> appleComparator = (a1, a2) -> {
			if (a1.getWeight() == a2.getWeight())
				return 0;
			else if (a1.getWeight() > a2.getWeight())
				return 1;
			else
				return -1;
		}; // definition for the abstract method //lambda expression

	}
}
