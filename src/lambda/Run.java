package lambda;

public class Run implements Runnable {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
		Runnable r = () -> System.out.println(i); 
		i++;
		r.run();
		
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
