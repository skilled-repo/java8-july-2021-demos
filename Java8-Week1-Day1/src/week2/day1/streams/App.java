package week2.day1.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.joining;
import static java.util.Comparator.comparing;


public class App {

	public static void main(String[] args) {

		var freddy = new Trader("freddy", "NewYork");
		var john = new Trader("john", "Washington");
		var abraham = new Trader("abraham", "Cambridge");
		var philip = new Trader("philip", "New Jersey");
		var steve = new Trader("steve", "Cambridge");

		var transaction1 = new Transaction(freddy, 2019, 300);
		var transaction2 = new Transaction(john, 2021, 100);
		var transaction3 = new Transaction(abraham, 2018, 400);
		var transaction4 = new Transaction(abraham, 2017, 600);
		var transaction5 = new Transaction(philip, 2017, 150);
		var transaction6 = new Transaction(steve, 2018, 200);
		var transaction7 = new Transaction(freddy, 2017, 250);
		var transaction8 = new Transaction(philip, 2016, 120);

		List<Transaction> listOfTransactions = new ArrayList<>();

		listOfTransactions.add(transaction1);
		listOfTransactions.add(transaction2);
		listOfTransactions.add(transaction3);
		listOfTransactions.add(transaction4);
		listOfTransactions.add(transaction5);
		listOfTransactions.add(transaction6);
		listOfTransactions.add(transaction7);
		listOfTransactions.add(transaction8);

		// Start the Streaming Process

		// 1. Find all transaction in 2017 and sort by value (small to high)

		List<Transaction> filteredTransaction = listOfTransactions.stream()
		                                                          .filter((t) -> t.getYear() == 2017) // 2017
		                                                          .sorted(comparing(
		                                                              Transaction::getValue).reversed())
		                                                          .collect(toList());
		// .forEach(System.out::println);

		// filteredTransaction.forEach(System.out::println);

		// 2. What are all the unique cities where the traders work?
		// SQL Queries
		listOfTransactions.stream()
		                  .map(transaction -> transaction.getTrader()
		                                                 .getCity()) // Convert the transaction object
		                                                             // into some string?

		                  .collect(toSet()) // .distinct()
		                  .forEach(System.out::println);

		// 3. Find all trader from Cambridge and sort them by name

		listOfTransactions.stream()
		                  // .map(t -> t.getTrader())
		                  .map(Transaction::getTrader) // arbitrary method referencing operator
		                                               // instance,static,constructor,arbitrary
		                  .filter(trader -> trader.getCity()
		                                          .equals("Cambridge"))
		                  .distinct()
		                  .sorted(comparing(Trader::getName).reversed())
		                  .collect(toList())
		                  .forEach(System.out::println);

		// 4. Returns a String which contains all Trader names sorted alphabetically

		String finalString = listOfTransactions.stream()
		                                       .map(transaction -> transaction.getTrader()
		                                                                      .getName()) // here you
		                                                                                  // cannot use
		                                                                                  // method
		                                                                                  // referencing
		                                       .distinct()
		                                       .sorted()
		                                       // .reduce("", (n1,n2)-> n1+" "+n2); //Drawback?
		                                       .collect(joining()); // Memory Effecient Method of logic
		// .forEach(System.out::print);

		System.out.println(finalString);

		// 5. Are any traders based in Washington

		boolean washingtonBased = listOfTransactions.stream()
		                                            .anyMatch(t -> t.getTrader()
		                                                            .getCity()
		                                                            .equals("Delhi"));

		System.out.println(washingtonBased);

		// 6. What's the highest value of all transaction (with reduce)

		Optional<Integer> highestValue = listOfTransactions.stream()
		                                                   .map(Transaction::getValue) //intermediate operator
		                                                   .reduce(Integer::max); //terminal operator

		System.out.println(highestValue.get());

		
		// 6. What's the highest value of all transaction (directly with max terminal operator)
		Optional<Transaction> highestValue2 = listOfTransactions.stream()
		                                                        .max(comparing(Transaction::getValue)); //terminal operator

		System.out.println(highestValue2.get());

	}

}
