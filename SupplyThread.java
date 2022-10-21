package Document;

public class SupplyThread extends Thread{   //create thread 1
	private Producer pr;

	public SupplyThread(Producer pr) {   //parameterized cons
		super();
		this.pr = pr;
	}
	
	public void run() {           //method overriden to give supply
		pr.supply(50);
	}

}