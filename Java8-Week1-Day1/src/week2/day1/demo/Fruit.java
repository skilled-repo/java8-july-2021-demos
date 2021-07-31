package week2.day1.demo;

public class Fruit implements i1,i2 {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub	
	}
	
	//Duplicate default methods named taste with the parameters () and () 
	//are inherited from the types i2 and i1
	//This diamond issue is resolved by overriding
	@Override
	public void taste() {
		//i1.super.taste(); re-usibility i1.super i2.super
		//i2.super.taste();
	}
}
