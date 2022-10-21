package Document;

public class DemandThread extends Thread {  //create thread
	private Producer pr;

	public DemandThread(Producer pr) {     //parameterized cons
		super();
		this.pr = pr;
	}
	
	public void run() {         //method overridden to get demand
		pr.demand(100);
		
	}

}
