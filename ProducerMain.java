package Document;

	public class ProducerMain {

		public static void main(String[] args) {
			Producer p=new Producer();
			
			DemandThread dt=new DemandThread(p);         //thread 1
			SupplyThread st=new SupplyThread(p);         	//thread 2
			
			dt.start();                   //run the thread1 &2
			st.start();
			
		}

	}