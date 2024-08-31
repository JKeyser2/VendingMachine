package application;

//package zzzProjectPt2;

//import zzzProjectPt2.Item;

public class Snack extends Item{
	private float weight;
	private boolean containsNuts;
	
	
	public Snack(String itemType, String name, float calories, float weight, boolean containsNuts, Integer quantity) {
		super(name, calories, itemType, quantity);
		this.weight = weight;
		this.containsNuts = containsNuts;
	}
	
	
	public void SetWeight(float weight) {
		this.weight = weight;
	}
	public void SetContainsNuts(boolean containsNuts) {
		this.containsNuts = containsNuts;
	}
	
	public float GetWeight() {
		return weight;
	}
	public boolean GetContainsNuts() {
		return containsNuts;
	}
	
	public String toString() {
		return super.toString() + ", Weight: " + weight + ", Contains Nuts: " + containsNuts;
	}
	
}
