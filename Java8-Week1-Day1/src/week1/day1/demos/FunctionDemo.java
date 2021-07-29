package week1.day1.demos;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> times2 = e -> e * 2;
		
		//Functional Interface 1 // one liner of statement return statement is not required
		
		Function<Integer, Integer> squared = e -> e * e; //Funtional Interface 2

		//System.out.println(times2.andThen(squared).apply(8));
		
		System.out.println(times2.compose(squared).apply(8));
	}

}
