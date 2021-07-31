package week2.day1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo1 {

	public static void main(String args[]) {

		List<Double> doubleValues = Arrays.asList(3.45, 4.56, 7.65, 2.37, 4.89);

		// From this list we can create a stream
		// Sequential Stream
		List<Double> newDoubleList = doubleValues.stream()
		                                         .filter((val) -> val > 3)
		                                         .map((val) -> Math.ceil(val))
		                                         .collect(Collectors.toList());
		// .forEach((val) -> System.out.println(val));

		doubleValues.stream()
		            .filter((val) -> val > 3)
		            .map(Math::ceil) //With Static Method Referencing
		            .collect(Collectors.toList())//terminal operation
		            .forEach(System.out::println); //Instance Method Referencing

		//System.out.println(newDoubleList1);

	}
}
