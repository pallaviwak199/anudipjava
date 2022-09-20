package Document;

public class Prime {
    static int c;
	static void primeNumber(int n) {
		for(int i=1;i<=n;i++) {
			c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		primeNumber(20);
	}
}