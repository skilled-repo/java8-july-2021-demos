package week1.day1.demos;
//POJO Class -Plain Old Java Object
public class Apple {

	//Instance Variable
	private int weight;
	private String color;
	
	public Apple(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}


	public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
