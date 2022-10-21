package Document;

public class Producer {
	int avProduct=500;
	synchronized public void  demand(int demand) {    //synchronized method to fulfill demand
		try {
			System.out.println("Available Product before demand is fulfilled :"+avProduct);

			if(demand>avProduct) {
				wait();                           //wait until the Another method runs
			}
			avProduct-=demand;
			System.out.println("Available Product after demand :"+avProduct);
				
		}
		catch(InterruptedException ie) {
			System.out.print(ie);
		}
	}
	synchronized public void supply(int supply) {
		System.out.println("Available Product before supply:"+avProduct);
		avProduct+=supply;
		System.out.println("Available Product after supply :"+avProduct);

		notify();     //notify when task is completed
	}

}