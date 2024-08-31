package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SampleController {
	
	@FXML
	private AnchorPane theAnchorPane;
	
	@FXML
	private Label theTitle = new Label("Jay's Vending");
	
	@FXML
	private Label itemOneName = new Label("EMPTY");
	
	@FXML
	private Label itemTwoName = new Label("EMPTY");
	
	@FXML
	private Label itemThreeName = new Label("EMPTY");
	
	@FXML
	private Label itemFourName = new Label("EMPTY");
	
	@FXML
	private Label itemFiveName = new Label("EMPTY");
	
	@FXML
	private Label itemSixName = new Label("EMPTY");
	
	@FXML
	private Label itemSevenName = new Label("EMPTY");
	
	@FXML
	private Label itemEightName = new Label("EMPTY");
	
	
	
	@FXML
	private Label itemOneQuantity = new Label("0");
	
	@FXML
	private Label itemTwoQuantity = new Label("0");
	
	@FXML
	private Label itemThreeQuantity = new Label("0");
	
	@FXML
	private Label itemFourQuantity = new Label("0");
	
	@FXML
	private Label itemFiveQuantity = new Label("0");
	
	@FXML
	private Label itemSixQuantity = new Label("0");
	
	@FXML
	private Label itemSevenQuantity = new Label("0");
	
	@FXML
	private Label itemEightQuantity = new Label("0");
	
	
	//private Button Button1 = new Button();
	
	@FXML
	private Button button1 = new Button();
	
	
	@FXML
	private Button button2 = new Button();
	
	@FXML
	private Button button3 = new Button();
	
	@FXML
	private Button button4 = new Button();
	
	@FXML
	private Button button5 = new Button();
	
	@FXML
	private Button button6 = new Button();
	
	@FXML
	private Button button7 = new Button();
	
	@FXML
	private Button button8 = new Button();
	
	@FXML
	private Button resetButton = new Button();
	
	private Vending myMachine;
	
	private ArrayList<Label> nameLabels;
	private ArrayList<Label> quantityLabels;
	
	
	public void initialize() {
		// Insert and remove files
		DataFile myData = new DataFile("insertVendingMachine.txt", "removeVendingMachine.txt");
		
		// Reads in the entire line for the object
	    myData.LoadDirectory();
	    // For storing what we will remove from the vending machine
	    myData.LoadSampleInput();
		
	    // Stores all of the vending machine objects
	    ArrayList <String> myVending = myData.GetDirectory();
	    // Stores what we will remove from the vending machine
	    ArrayList <Integer> mySelections = myData.GetSelections();
	    
	    
	    // Storing all of the items in the vending machine
	    myMachine = new Vending(myVending);
	    
	    theAnchorPane.setStyle("-fx-background-color: pink");
	    
	    theTitle.setStyle("-fx-text-fill: white");
	    
		//ArrayList<Label> nameLabels = new ArrayList<Label>();
	    nameLabels = new ArrayList<Label>();
		nameLabels.add(itemOneName);
		nameLabels.add(itemTwoName);
		nameLabels.add(itemThreeName);
		nameLabels.add(itemFourName);
		nameLabels.add(itemFiveName);
		nameLabels.add(itemSixName);
		nameLabels.add(itemSevenName);
		nameLabels.add(itemEightName);
		
		//ArrayList<Label> quantityLabels = new ArrayList<Label>();
		quantityLabels = new ArrayList<Label>();
		quantityLabels.add(itemOneQuantity);
		quantityLabels.add(itemTwoQuantity);
		quantityLabels.add(itemThreeQuantity);
		quantityLabels.add(itemFourQuantity);
		quantityLabels.add(itemFiveQuantity);
		quantityLabels.add(itemSixQuantity);
		quantityLabels.add(itemSevenQuantity);
		quantityLabels.add(itemEightQuantity);
		
		
		/*
		ArrayList<Button> theButtons = new ArrayList<Button>();
		theButtons.add(button1);
		theButtons.add(button2);
		theButtons.add(button3);
		theButtons.add(button4);
		theButtons.add(button5);
		theButtons.add(button6);
		theButtons.add(button7);
		theButtons.add(button8);
		*/
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 0 && theItem.get(0).GetItemType() == "Snack") {
					button1.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 0 && theItem.get(0).GetItemType() == "Drink") {
					button1.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 1 && theItem.get(0).GetItemType() == "Snack") {
					button2.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 1 && theItem.get(0).GetItemType() == "Drink") {
					button2.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 2 && theItem.get(0).GetItemType() == "Snack") {
					button3.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 2 && theItem.get(0).GetItemType() == "Drink") {
					button3.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 3 && theItem.get(0).GetItemType() == "Snack") {
					button4.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 3 && theItem.get(0).GetItemType() == "Drink") {
					button4.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 4 && theItem.get(0).GetItemType() == "Snack") {
					button5.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 4 && theItem.get(0).GetItemType() == "Drink") {
					button5.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 5 && theItem.get(0).GetItemType() == "Snack") {
					button6.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 5 && theItem.get(0).GetItemType() == "Drink") {
					button6.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 6 && theItem.get(0).GetItemType() == "Snack") {
					button7.setStyle("-fx-background-color: lightcyan");
				}
				if(i == 6 && theItem.get(0).GetItemType() == "Drink") {
					button7.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the item type: Snack or Drink
			if(theItem.size() != 0) {
				if(i == 7 && theItem.get(0).GetItemType() == "Snack") {
					button8.setStyle("-fx-background-color: aliceblue");
				}
				if(i == 7 && theItem.get(0).GetItemType() == "Drink") {
					button8.setStyle("-fx-background-color: mediumpurple");
				}
			}
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
		
		
	}
	
	public void ButtonClick1(ActionEvent e) {
			myMachine.unloadItem(0);
			
			
			String nameLabelString = "";
			Integer amountOfItem = -1;
			
			// Loops through the ArrayList of queues
			for(int i = 0; i < myMachine.slots.size(); i++) {
				// Stores the queue in a variable
				ArrayList<Item> theItem = myMachine.slots.get(i);
				
				// Get the name of the item in the queue
				if(theItem.size() != 0) {
					nameLabelString = theItem.get(0).GetName();
				}else {
					nameLabelString = "EMPTY";
				}
				
				
				// Get the amount of the item that there is in the queue
				amountOfItem = theItem.size();
				
				// Create a label
				Label itemQuantity = new Label("0");
				
				// Put the amount of the item into the label
				int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
				itemQuantity.setText(newValue + "");
				
				// Insert in place of the dummy label
				quantityLabels.set(i, itemQuantity);
			
				
				// Create a label
				Label itemName = new Label("EMPTY");
				
				// Put the name of the item into the label
				itemName.setText(nameLabelString);
				
				// Insert in place of the dummy label
				nameLabels.set(i, itemName);
				
				
			}
		
			// For the empty slots
			for(int i = myMachine.slots.size(); i < 8; i++) {
			    // Create a label
				Label itemQuantity = new Label("0");
				
				// Put the amount of the item into the label
				itemQuantity.setText("0");
				
				// Insert in place of the dummy label
				quantityLabels.set(i, itemQuantity);
			
				
				// Create a label
				Label itemName = new Label("EMPTY");
				
				// Put the name of the item into the label
				itemName.setText("EMPTY");
				
				// Insert in place of the dummy label
				nameLabels.set(i, itemName);
			}
			
			itemOneName.setText(nameLabels.get(0).getText());
			itemTwoName.setText(nameLabels.get(1).getText());
			itemThreeName.setText(nameLabels.get(2).getText());
			itemFourName.setText(nameLabels.get(3).getText());
			itemFiveName.setText(nameLabels.get(4).getText());
			itemSixName.setText(nameLabels.get(5).getText());
			itemSevenName.setText(nameLabels.get(6).getText());
			itemEightName.setText(nameLabels.get(7).getText());
			
			itemOneQuantity.setText(quantityLabels.get(0).getText());
			itemTwoQuantity.setText(quantityLabels.get(1).getText());
			itemThreeQuantity.setText(quantityLabels.get(2).getText());
			itemFourQuantity.setText(quantityLabels.get(3).getText());
			itemFiveQuantity.setText(quantityLabels.get(4).getText());
			itemSixQuantity.setText(quantityLabels.get(5).getText());
			itemSevenQuantity.setText(quantityLabels.get(6).getText());
			itemEightQuantity.setText(quantityLabels.get(7).getText());
			
			if(itemOneQuantity.getText() == "0") {
				button1.setDisable(true);
			}
			if(itemTwoQuantity.getText() == "0") {
				button2.setDisable(true);
			}
			if(itemThreeQuantity.getText() == "0") {
				button3.setDisable(true);
			}
			if(itemFourQuantity.getText() == "0") {
				button4.setDisable(true);
			}
			if(itemFiveQuantity.getText() == "0") {
				button5.setDisable(true);
			}
			if(itemSixQuantity.getText() == "0") {

				button6.setDisable(true);
			}
			if(itemSevenQuantity.getText() == "0") {
				button7.setDisable(true);
			}
			if(itemEightQuantity.getText() == "0") {
				button8.setDisable(true);
			}
			
			if(itemOneQuantity.getText() == "0") {
				itemOneQuantity.setStyle("-fx-text-fill: red");
				button1.setDisable(true);
			}else {
				itemOneQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemTwoQuantity.getText() == "0") {
				itemTwoQuantity.setStyle("-fx-text-fill: red");
				button2.setDisable(true);
			}else {
				itemTwoQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemThreeQuantity.getText() == "0") {
				itemThreeQuantity.setStyle("-fx-text-fill: red");
			}else {
				itemThreeQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemFourQuantity.getText() == "0") {
				itemFourQuantity.setStyle("-fx-text-fill: red");
				button4.setDisable(true);
			}else {
				itemFourQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemFiveQuantity.getText() == "0") {
				itemFiveQuantity.setStyle("-fx-text-fill: red");
				button5.setDisable(true);
			}else {
				itemFiveQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemSixQuantity.getText() == "0") {
				itemSixQuantity.setStyle("-fx-text-fill: red");
				button6.setDisable(true);
			}else {
				itemSixQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemSevenQuantity.getText() == "0") {
				itemSevenQuantity.setStyle("-fx-text-fill: red");
				button7.setDisable(true);
			}else {
				itemSevenQuantity.setStyle("-fx-text-fill: green");
			}
			if(itemEightQuantity.getText() == "0") {
				itemEightQuantity.setStyle("-fx-text-fill: red");
				button8.setDisable(true);
			}else {
				itemEightQuantity.setStyle("-fx-text-fill: green");
			}
		
	}
	
	public void ButtonClick2(ActionEvent e) {
		myMachine.unloadItem(1);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick3(ActionEvent e) {
		myMachine.unloadItem(2);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick4(ActionEvent e) {
		myMachine.unloadItem(3);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}

			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick5(ActionEvent e) {
		myMachine.unloadItem(4);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick6(ActionEvent e) {
		myMachine.unloadItem(5);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick7(ActionEvent e) {
		myMachine.unloadItem(6);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	public void ButtonClick8(ActionEvent e) {
		myMachine.unloadItem(7);
		
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
		    // Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}
		if(itemSixQuantity.getText() == "0") {

			button6.setDisable(true);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	
	}
	
	public void ResetClick(ActionEvent e) {
		// Insert and remove files
		DataFile myData = new DataFile("insertVendingMachine.txt", "removeVendingMachine.txt");
		
		// Reads in the entire line for the object
	    myData.LoadDirectory();
	    // For storing what we will remove from the vending machine
	    myData.LoadSampleInput();
		
	    // Stores all of the vending machine objects
	    ArrayList <String> myVending = myData.GetDirectory();
	    // Stores what we will remove from the vending machine
	    ArrayList <Integer> mySelections = myData.GetSelections();
	    
	    
	    // Storing all of the items in the vending machine
	    myMachine = new Vending(myVending);
	    
	    
	    
		//ArrayList<Label> nameLabels = new ArrayList<Label>();
	    nameLabels = new ArrayList<Label>();
		nameLabels.add(itemOneName);
		nameLabels.add(itemTwoName);
		nameLabels.add(itemThreeName);
		nameLabels.add(itemFourName);
		nameLabels.add(itemFiveName);
		nameLabels.add(itemSixName);
		nameLabels.add(itemSevenName);
		nameLabels.add(itemEightName);
		
		//ArrayList<Label> quantityLabels = new ArrayList<Label>();
		quantityLabels = new ArrayList<Label>();
		quantityLabels.add(itemOneQuantity);
		quantityLabels.add(itemTwoQuantity);
		quantityLabels.add(itemThreeQuantity);
		quantityLabels.add(itemFourQuantity);
		quantityLabels.add(itemFiveQuantity);
		quantityLabels.add(itemSixQuantity);
		quantityLabels.add(itemSevenQuantity);
		quantityLabels.add(itemEightQuantity);
		
		
		/*
		ArrayList<Button> theButtons = new ArrayList<Button>();
		theButtons.add(button1);
		theButtons.add(button2);
		theButtons.add(button3);
		theButtons.add(button4);
		theButtons.add(button5);
		theButtons.add(button6);
		theButtons.add(button7);
		theButtons.add(button8);
		*/
		
		String nameLabelString = "";
		Integer amountOfItem = -1;
		
		// Loops through the ArrayList of queues
		for(int i = 0; i < myMachine.slots.size(); i++) {
			// Stores the queue in a variable
			ArrayList<Item> theItem = myMachine.slots.get(i);
			
			// Get the name of the item in the queue
			if(theItem.size() != 0) {
				nameLabelString = theItem.get(0).GetName();
			}else {
				nameLabelString = "EMPTY";
			}
			
			
			// Get the amount of the item that there is in the queue
			amountOfItem = theItem.size();
			
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			int newValue = Integer.parseInt(itemQuantity.getText()) + amountOfItem;
			itemQuantity.setText(newValue + "");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText(nameLabelString);
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
			
			
		}
	
		// For the empty slots
		for(int i = myMachine.slots.size(); i < 8; i++) {
			// Create a label
			Label itemQuantity = new Label("0");
			
			// Put the amount of the item into the label
			itemQuantity.setText("0");
			
			// Insert in place of the dummy label
			quantityLabels.set(i, itemQuantity);
		
			
			// Create a label
			Label itemName = new Label("EMPTY");
			
			// Put the name of the item into the label
			itemName.setText("EMPTY");
			
			// Insert in place of the dummy label
			nameLabels.set(i, itemName);
		}
		
		itemOneName.setText(nameLabels.get(0).getText());
		itemTwoName.setText(nameLabels.get(1).getText());
		itemThreeName.setText(nameLabels.get(2).getText());
		itemFourName.setText(nameLabels.get(3).getText());
		itemFiveName.setText(nameLabels.get(4).getText());
		itemSixName.setText(nameLabels.get(5).getText());
		itemSevenName.setText(nameLabels.get(6).getText());
		itemEightName.setText(nameLabels.get(7).getText());
		
		itemOneQuantity.setText(quantityLabels.get(0).getText());
		itemTwoQuantity.setText(quantityLabels.get(1).getText());
		itemThreeQuantity.setText(quantityLabels.get(2).getText());
		itemFourQuantity.setText(quantityLabels.get(3).getText());
		itemFiveQuantity.setText(quantityLabels.get(4).getText());
		itemSixQuantity.setText(quantityLabels.get(5).getText());
		itemSevenQuantity.setText(quantityLabels.get(6).getText());
		itemEightQuantity.setText(quantityLabels.get(7).getText());
		
		if(itemOneQuantity.getText() == "0") {
			button1.setDisable(true);
		}else {
			button1.setDisable(false);
		}
		if(itemTwoQuantity.getText() == "0") {
			button2.setDisable(true);
		}else {
			button2.setDisable(false);
		}
		if(itemThreeQuantity.getText() == "0") {
			button3.setDisable(true);
		}else {
			button3.setDisable(false);
		}
		if(itemFourQuantity.getText() == "0") {
			button4.setDisable(true);
		}else {
			button4.setDisable(false);
		}
		if(itemFiveQuantity.getText() == "0") {
			button5.setDisable(true);
		}else {
			button5.setDisable(false);
		}
		if(itemSixQuantity.getText() == "0") {
			button6.setDisable(true);
		}else {
			button6.setDisable(false);
		}
		if(itemSevenQuantity.getText() == "0") {
			button7.setDisable(true);
		}else {
			button7.setDisable(false);
		}
		if(itemEightQuantity.getText() == "0") {
			button8.setDisable(true);
		}else {
			button8.setDisable(false);
		}
		
		if(itemOneQuantity.getText() == "0") {
			itemOneQuantity.setStyle("-fx-text-fill: red");
			button1.setDisable(true);
		}else {
			itemOneQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemTwoQuantity.getText() == "0") {
			itemTwoQuantity.setStyle("-fx-text-fill: red");
			button2.setDisable(true);
		}else {
			itemTwoQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemThreeQuantity.getText() == "0") {
			itemThreeQuantity.setStyle("-fx-text-fill: red");
		}else {
			itemThreeQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFourQuantity.getText() == "0") {
			itemFourQuantity.setStyle("-fx-text-fill: red");
			button4.setDisable(true);
		}else {
			itemFourQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemFiveQuantity.getText() == "0") {
			itemFiveQuantity.setStyle("-fx-text-fill: red");
			button5.setDisable(true);
		}else {
			itemFiveQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSixQuantity.getText() == "0") {
			itemSixQuantity.setStyle("-fx-text-fill: red");
			button6.setDisable(true);
		}else {
			itemSixQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemSevenQuantity.getText() == "0") {
			itemSevenQuantity.setStyle("-fx-text-fill: red");
			button7.setDisable(true);
		}else {
			itemSevenQuantity.setStyle("-fx-text-fill: green");
		}
		if(itemEightQuantity.getText() == "0") {
			itemEightQuantity.setStyle("-fx-text-fill: red");
			button8.setDisable(true);
		}else {
			itemEightQuantity.setStyle("-fx-text-fill: green");
		}
	}
}
