package application;

//package zzzProjectpt2;

public class Item {
	private String name;
	private float calories;
	private String itemType;
	private Integer quantity;
	
	public Item(String name, float calories, String itemType, Integer quantity) {
		this.name = name;
		this.calories = calories;
		this.itemType = itemType;
		this.quantity = quantity;
	}
	
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetCalories(float calories) {
		this.calories = calories;
	}
	public void SetItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String GetName() {
		return name;
	}
	public float GetCalories() {
		return calories;
	}
	public String GetItemType() {
		return itemType;
	}
	
	public void SetQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int GetQuantity() {
		return quantity;
	}
	
	public String toString() {
		return "Name: " + name + ", Calories: " + calories + ", Item Type: " + itemType + ", Quantity: " + quantity;
	}
}

