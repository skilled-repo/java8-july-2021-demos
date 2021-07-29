package week1.day1.demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
	 List<String> countries = Arrays.asList("Sydney", "usa","German","London");
	
	 
	 //Readability of Code
	 Consumer<List<String>> upperCaseCountry = listOfCountries -> {
		 for(int i=0;i<listOfCountries.size();i++) {
			 listOfCountries.set(i, listOfCountries.get(i).toUpperCase());
		 }
	 };
	 
	 Consumer<List<String>> printConsumer =  listOfCountriesUpperCase -> {
		 //Consumer<String> cons = 
		 listOfCountriesUpperCase.forEach((String country) -> {
			 System.out.println(country);
		 }); 
	 };

	 //printConsumer.accept(countries); //Chaining Lambdas
	upperCaseCountry.andThen(printConsumer).accept(countries);
	 
	}

}
