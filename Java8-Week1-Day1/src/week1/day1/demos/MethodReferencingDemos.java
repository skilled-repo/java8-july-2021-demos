package week1.day1.demos;

//Creating a custom function interface
//@FunctionalInterface //- Optional
//interface ICarFunctionality<T,R>{
//	public R get(T name);
//}

@FunctionalInterface // - Optional
interface ICarFunctionality<R,T> {
	public R get(T t);
}

class Car {

	String name;

//	public Car() {
//		System.out.println("No Arg Constructor");
//	}

	public Car(String name) {
		System.out.println("One Argumented Constructor");
		this.name = name;
	}

	public void print() {
		System.out.println(this.name);
	}
}

public class MethodReferencingDemos {

	public static void main(String[] args) {

		// ICarFunctionality<Double> carObj = (p1) -> {Math.ceil(p1);};
		// listOfCountriesUpperCase.forEach(System.out::println);
		// ICarFunctionality<Double> carObj = Math::ceil;
		// ICarFunctionality<Car> obj = () -> {return new Car();};

		// ICarFunctionality<Car> obj = () -> new Car();

		//ICarFunctionality<Car> obj = Car::new;
		//ICarFunctionality<Car,String> obj1 = (String s1) -> {return new Car(s1);};
		//ICarFunctionality<Car,String> obj2 = (s1) -> {return new Car(s1);};
		//ICarFunctionality<Car,String> obj3 = (s1) -> new Car(s1);
		//ICarFunctionality<Car,String> obj4 = s1 -> new Car(s1);
		ICarFunctionality<Car,String> obj = Car::new; //Constructor method Referencing

		obj.get("Audi").print();

	}

}
