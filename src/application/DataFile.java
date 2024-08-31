package application;

//package zzzProjectPt2;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class DataFile {
	private String insertVendingMachineFile;
	private String removeVendingMachineFile;
	// Holds all of the Snack and Drink Objects that have been put into the vending machine
	private ArrayList<String> directory;
	// Holds selections for removing from vending machine
	private ArrayList<Integer> selections;
	
	public DataFile(String insertVendingMachineFile, String removeVendingMachineFile) {
		this.insertVendingMachineFile = insertVendingMachineFile;
		this.removeVendingMachineFile = removeVendingMachineFile;
		
		directory = new ArrayList<String>();
		selections = new ArrayList<Integer>();
	}
	
	public ArrayList<String> LoadDirectory() {
		boolean debug = true;
		
		
		Scanner infile = null;
		
		try {
			//System.out.println(insertVendingMachineFile);
			// How we are reading in the file
			infile = new Scanner(new FileReader(insertVendingMachineFile));
		}
		catch (FileNotFoundException e){
			System.out.println("Insertion file not found!");
			e.printStackTrace();
			System.exit(0);
		}
		
		String insertVendingMachineObjectString;
		
		
		// Makes sure the line is there
		while(infile.hasNextLine()) {
			// Reading in the line
			// Store the line
			String line = infile.nextLine();
			
			//StringTokenizer tokenizer = new StringTokenizer(line);
			

			//insertVendingMachineObjectString = tokenizer.nextToken();
			
			insertVendingMachineObjectString = line;
			
			if(debug) {
				//System.out.println("Object Inserted Recieved: " + insertVendingMachineObjectString);
			}
			
			directory.add(insertVendingMachineObjectString);
		}
		infile.close();
		
		return directory;
	}
	
	public ArrayList<Integer> LoadSampleInput() {
		boolean debug = true;
		
		
		Scanner infile = null;
		
		try {
			//System.out.println(removeVendingMachineFile);
			// How we are reading in the file
			infile = new Scanner(new FileReader(removeVendingMachineFile));
		}
		catch (FileNotFoundException e){
			System.out.println("Removal file not found!");
			e.printStackTrace();
			System.exit(0);
		}
		
		Integer removeVendingMachineIndex;
		
		
		// Makes sure the line is there
		while(infile.hasNextLine()) {
			// Reading in the line
			// Store the line
			String line = infile.nextLine();
			
			StringTokenizer tokenizer = new StringTokenizer(line);
			

			//insertVendingMachineObjectString = tokenizer.nextToken();
			
			// Convert from string to integer
			removeVendingMachineIndex = Integer.parseInt(tokenizer.nextToken());
			
			
			if(debug) {
				//System.out.println("Index Inserted Recieved: " + removeVendingMachineIndex);
			}
			
			selections.add(removeVendingMachineIndex);
		}
		infile.close();
		
		return selections;
	}
	
	
	void SetDirectory (ArrayList<String> directory) {
		this.directory = directory;
	}
	void SetSelections (ArrayList<Integer> selections) {
		this.selections = selections;
	}
	ArrayList<String> GetDirectory() {
		return directory;
	}
	ArrayList<Integer> GetSelections() {
		return selections;
	}
	
	
}