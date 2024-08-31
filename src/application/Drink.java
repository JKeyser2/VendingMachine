package application;

//package zzzProjectPt2;

//import zzzProject.Item;

public class Drink extends Item{
	private float ounces;
	private String type;
	
	

	
	
	public Drink(String itemType, String name, float calories, float ounces, String type, Integer quantity) {
		super(name, calories, itemType, quantity);
		this.ounces = ounces;
		this.type = type;
	}
	
	
	public void SetOunces(float ounces) {
		this.ounces = ounces;
	}
	public void SetType(String type) {
		this.type = type;
	}
	
	public float GetOunces() {
		return ounces;
	}
	public String GetType() {
		return type;
	}
	
	public String toString() {
		return super.toString() + ", Ounces: " + ounces + ", Type: " + type;
	}
	
}
