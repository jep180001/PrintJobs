
//represents a job that needs to be printed
public class Printjob implements Comparable<Printjob>{
	
	//print job variables
	private String userName;
	private int userPriority;
	private int numOfPages;
	private int jobPriority;
	private int finalPriority;
	
	Printjob(String userName, int userPriority, int numOfPages) {
		
		this.userName = userName;
		this.userPriority = userPriority;
		this.numOfPages = numOfPages;
		this.finalPriority = userPriority * numOfPages;
	}
	//compare to method to determine priority of a print job
	@Override
	public int compareTo(Printjob x) {
		
		int c = Integer.compare(finalPriority, x.finalPriority);
		
		return c;
	}
	//methods to get Printjob variable in sub-class
	public String getUserName() {
		
		return userName;
	}
	public int getUserPriority() {
		
		return finalPriority;
	}
	public int getNumOfPages() {
		
		return numOfPages;
	}
	//format output to user
	public String toString() {
		
		String str = String.format("Name: %s\r\nPriority: %d\r\nNumber of pages: %d\n", 
	                getUserName(), getUserPriority(), getNumOfPages()); 
		
		return str;
	}
}
