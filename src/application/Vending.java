package application;

//package zzzProjectPt2;

import java.util.ArrayList;
import java.util.Vector;

public class Vending {
	// Simply contains the names of the products
	private ArrayList<String> directory;
	
	// Contains the Snack and Drink objects
	//private ArrayList<Item> slots;
	
	// The outside ArrayList is each slot
	// The inside ArrayList is all of the objects in each slot
	public ArrayList<ArrayList<Item>> slots;
	
	public Vending(ArrayList<String> otherDirectory) {
		// Creating a new array to store the names of all of the object that go into vending machine
		this.directory = new ArrayList<String>();
		// Creating a new array to store all of the Snack and Drink Objects
		this.slots = new ArrayList<ArrayList<Item>>();
		
		loadItem(otherDirectory);
		
	}
	
	public void loadItem(ArrayList<String> otherDirectory) {
		// Loops through
		for(int i = 0; i < otherDirectory.size(); i++) {
			// Prints out the object
			//System.out.println("1." + otherDirectory.get(i));
			
			// Stores each element of each object
			String[] objectArray = otherDirectory.get(i).split(",");
			
			// Counter
			int counter = 0;
			
			// Boolean for whether or not it is a drink
			boolean isDrink = false;
			
			// String for storing the name of the object
			String name = "name";
			// Float for storing the calories of the object
			float calories = 0;
			// If a Drink: Ounces
			float ounces = 0;
			// If a Snack: Weight
			float weight = 0;
			// If a Drink: Type
			String type = "";
			// If a Snack: Contains Nuts
			boolean containsNuts = false;
			// Integer for storing the amount of the object
			Integer quantity = 0;
			
			
			// Loops through object
			for(String object : objectArray) {
				// We have whether it is a Snack or a Drink
				if(counter == 0) {
					Boolean equal = object.equals("Drink");
					// If it is a Drink
					if(equal == true) {
						// Set the boolean to true
						isDrink = true;
					}
				}
				
				// We have the object name
				if(counter == 1) {
					// Remove the space
					name = object.replace(" ", "");
					
					// Add to directory of object names
					this.directory.add(object.replace(" ", ""));
				}
				
				// We have the object's calories
				if(counter == 2) {
					// Remove the space
					object = object.replace(" ", "");
					// Convert from string to float
					calories = Float.parseFloat(object);
				}
				
				// If a Drink: Ounces
				if(counter == 3 && isDrink == true) {
					// Remove the space
					object = object.replace(" ", "");
					// Convert from string to float
					ounces = Float.parseFloat(object);
				}
				
				// If a Snack: Weight
				if(counter == 3 && isDrink == false) {
					// Remove the space
					object = object.replace(" ", "");
					// Convert from string to float
					weight = Float.parseFloat(object);
				}
				
				// If a Drink: Type
				if(counter == 4 && isDrink == true) {
					// Remove the space
					type = object.replace(" ", "");
				}
				
				// If a Snack: Has Nuts
				if(counter == 4 && isDrink == false) {
					object = object.replace(" ", "");
					Boolean equal2 = object.equals("false");
					if(equal2 == true) {
						containsNuts = false;
					}else {
						containsNuts = true;
					}
				}
				
				// We have the quantity of the object
				if(counter == 5) {
					// Remove the space
					object = object.replace(" ", "");
					// Convert from string to integer
					quantity = Integer.parseInt(object);
				}
				
				
				// Increment the counter
				counter++;
			}
			
			// If a drink, creates Drink Object
			if(isDrink == true) {
				// Creates the drink object
				Drink theDrink = new Drink("Drink", name, calories, ounces, type, quantity);
				
				// Creates the slot array
				ArrayList<Item> theSlot = new ArrayList<Item>();
				
				// Adds the object to the array "quantity" amount of times
				for(int k = 0; k < quantity; k++) {
					theSlot.add(theDrink);
				}
				
				// Add the slot to the vending machine
				slots.add(theSlot);
			// If a snack, creates Snack Object
			}else {
				// Creates the snack object
				Snack theSnack = new Snack("Snack", name, calories, weight, containsNuts, quantity);

				// Creates the slot array
				ArrayList<Item> theSlot = new ArrayList<Item>();
				
				// Adds the object to the array "quantity" amount of times
				for(int k = 0; k < quantity; k++) {
					theSlot.add(theSnack);
				}
				
				// Add the slot to the vending machine
				slots.add(theSlot);
			}
			
			
		}
		
		// Prints out all object names
		//for(int i = 0; i < directory.size(); i++) {
			//System.out.println(i + ". " + this.directory.get(i));
		//}
		
		// Prints out all objects
		//for(int i = 0; i < slots.size(); i++) {
		//	System.out.println(this.slots.get(i));
	//	}
	}
	
	public ArrayList<Integer> findProduct(String product) {
		// ArrayList for storing the indexes
		ArrayList<Integer> indexPosition = new ArrayList<Integer>();
		
		//System.out.println("Product: " + product);
		
		// Loops through all items in the directory
		for(int i = 0; i < directory.size(); i++) {
			//System.out.println("Item: " + directory.get(i));
			Boolean equal = product.equals(directory.get(i));
			// If it has the item we want
			if(equal == true) {
				// Add the index position to the array
				indexPosition.add(i);
			}
		}
		return indexPosition;
	}
	
	
	public void unloadItem (int index) {
		// Goes through all the slots
		for(int i = 0; i < slots.size(); i++) {
			// If we find the slot we want
			if(i == index) {
				// If the slot only has 1 item
				if (slots.get(i).size() == 1){
					//System.out.println("cool");
				
					// Create an array to store index positions that contain the same item
					ArrayList<Integer> indexPositions = new ArrayList<Integer>();
					
					// Gets all of the indexes that store the same item
					indexPositions = findProduct(slots.get(i).get(0).GetName());
					
					
					
					// If there is not an alternative option
					if(indexPositions.isEmpty() == true) {
						//System.out.println("No other options");
						// Remove from the head of the queue
						slots.get(i).remove(0);
					// If there is an alternative option
					}else {
						//System.out.println("1");
						//System.out.println("Size: " + indexPositions.size());
						// Stores how much of the item that is left
						ArrayList<Integer> howManyLeft = new ArrayList<Integer>();
						
						// Goes through all of the slots
						for(int j = 0; j < slots.size(); j++) {
							// Goes through all of the index positions of slots with the item we want
							for(int k = 0; k < indexPositions.size(); k++) {
								//System.out.println("Index Position: " + indexPositions.get(k));
								// If we are at a slot with the object we want
								if(indexPositions.get(k) == j) {
									// Add how many of the item there is in the slot to the array
									howManyLeft.add(slots.get(j).size());
								}
							}
						}
						
						//System.out.println("2");
						
						// Stores which slot has the most of the item we want
						Integer largestQuantity = 0;
						
						// Find the slot that has the most of the item we want
						for(int l = 0; l < howManyLeft.size(); l++) {
							//System.out.println("HOW MUCH: " + howManyLeft.get(l));
							// If the current slot is larger than the previous largest slot
							if(howManyLeft.get(l) > largestQuantity) {
								// Makes the current slot the new largest slot
								largestQuantity = howManyLeft.get(l);
							}
						}
						//System.out.println("3");
						// Stores the index of the largest slot
						Integer indexLargestSlot = 0;
						
						// Will flip once the lowest index has been picked from
						// In case of a tie, we want to pick from the lowest index
						boolean lowestIndex = false;
						
						// Loops through array that contains how much of each item is in the relevant slots
						for(int m = 0; m < howManyLeft.size(); m++) {
							//System.out.println("HOW MUCH AGAIN");
							// If we find the slot that contains the largest quantity of the item
							// If there is a tie, this would already account for that as we are already picking from...
							// ... the lowest index
							if(howManyLeft.get(m) == largestQuantity && lowestIndex == false) {
								// Store the index of the largest slot
								indexLargestSlot = m;
								// Flip the boolean as we have picked from the lowest index in the case of a tie
								lowestIndex = true;
							}
						}
						//System.out.println("4");
						// We are going back into IndexPositions Array to retrieve the actual slot position of the object
						Integer actualSlotNumber = 0;
						
						// Loop through array of index positions 
						for(int n = 0; n < indexPositions.size(); n++) {
							// If we find the index position we want in the array
							if(n == indexLargestSlot) {
								// Retrieve the slot that it holds
								actualSlotNumber = indexPositions.get(n);
							}
						}
						//System.out.println("5");
						
						// Loops through all the slots
						for(int o = 0; o < slots.size(); o++) {
							// If we find the slot to remove from
							if(o == actualSlotNumber) {
								// Remove from the head of the queue
								slots.get(o).remove(0);
								
								// If is not the last item in the slot
								if(largestQuantity != 1) {
									// Loop through all of the items in the slot
									for(int p = 0; p < largestQuantity - 1; p++) {
										// Decrease the quantity variable for each by 1
										slots.get(o).get(p).SetQuantity(largestQuantity-1);
									}
								}
							}
						}
						//System.out.println("6");
					}
				// If the slot is empty
				}else if(slots.get(i).size() == 0) {
					System.out.println("Sorry, this slot is empty!");
					
				// If the slot has more than 1 item
				}else {
					// Gets the amount of items in the slot
					Integer amountInSlot = slots.get(i).size();
					//Remove from the head of the queue
					slots.get(i).remove(0);
					
					// Loops through the queue
					for(int j = 0; j < amountInSlot - 1; j++) {
						// Decrementing the quantity by 1 for all of the objects
						slots.get(i).get(j).SetQuantity(amountInSlot - 1);
					}
				}
			}
		}
	}
	
	void unloadItem(ArrayList<Integer> vectorOfIndexes) {
		// Loops through vector that contains indexes of slots to be removed from
		for(int i = 0; i < vectorOfIndexes.size(); i++) {
			// Removes from the vending machine at the slot that is stored at the current index in the vector
			unloadItem(vectorOfIndexes.get(i));
		}
	}
	
	public void DisplayItems() {
		for(int i = 0; i < slots.size(); i++) {
			if(slots.get(i).size() == 0) {
				System.out.println(i + ". Name: " + directory.get(i) + ", Quantity: 0");
			}else {
				System.out.println(i + ". " + slots.get(i).get(0).toString());
			}
		}
	}
	
	public void deconstructor() {
		for(int i = 0; i < slots.size(); i++) {
			if(slots.get(i).size() == 0) {
				System.out.println(i + ". Name: " + directory.get(i) + ", Quantity: 0");
			}else {
				System.out.println(i + ". " + slots.get(i).get(0).toString());
			}
		}
	}
}
