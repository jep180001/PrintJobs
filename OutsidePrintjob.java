
public class OutsidePrintjob extends Printjob{
	
	private double cost;

	//constructor
	OutsidePrintjob(String userName, int userPriority, int numOfPages) {
		
		super(userName, userPriority, numOfPages);
	}
	//determine the cost of the print job
	public double getCost(int numOfPages) {
		
		//calculate the cost of the job
		cost = numOfPages * .10;
		
		//return cost of job
		return cost;
	}
	//format output of print job
	public String toString() {
		
		String st = String.format("Name: %s\r\nPriority: %d\r\nNumber of pages: %d\r\nCost: $%.2f\r\n", 
	                getUserName(), getUserPriority(), getNumOfPages(), getCost(getNumOfPages())); 
		
		return st;
	}
	
}
