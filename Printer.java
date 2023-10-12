import java.io.*;
import java.util.*;

public class Printer {
	
	//printer variables
	String userName;
	String printType;
	int numOfPages;
	int userPriority;
	
	//main method
	public static void main(String[] args) {
		
		//create binary heap to store objects
		BinaryHeap<Printjob> printJobs = new BinaryHeap<>();
		
		//read the input file
		Scanner scan = null;
		try {
			
			scan = new Scanner(new File("/Users/jungpark/eclipse-workspace/project 3/src/input.txt"));
			
			//create objects from information read from input file
			while(scan.hasNext()) {
				
				String name = scan.next();
				int priority = scan.nextInt();
				int pages = scan.nextInt();
				String type = scan.next();
				
				//determine if the print job is an inside or outside job
				if(type.equals("I")) {
					
					//create inside print job object
					Printjob insideJob = new Printjob(name, priority, pages);
					
					//add object to heap for priority queue
					printJobs.insert(insideJob);
					
				} else {
					
					//create outside print job object
					OutsidePrintjob outsideJob = new OutsidePrintjob(name, priority, pages);
					
					//add object to heap
					printJobs.insert(outsideJob);
				}
			}
		} catch (FileNotFoundException e) {
			
			//error message displayed
			System.out.println("Error: File could not be found.");
			
		}
		//close file after reading
		scan.close();
		
		//variable used to display print job
		Printjob temp = null;
		
		//remove until all objects are removed from heap
		while(printJobs.isEmpty() != true) {
			
			//use deletemin to remove an object
			temp = printJobs.deleteMin();
			
			//display print job to user
			System.out.println(temp.toString());
			
		}
	}

}
