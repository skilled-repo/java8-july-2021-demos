package wee3.day1.demos;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {
		String ename = new String("Sabari");
		String empid = null;
		
		empid.toUpperCase();
		
		Optional<String> optionalObject = Optional.empty();
		
		Optional<String> optionalObject1 = Optional.ofNullable(ename);
		
		//System.out.println(optionalObject.isEmpty());//true
		System.out.println(optionalObject1.isEmpty());//true

	}

}
