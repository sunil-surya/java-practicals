package multithreadding.threads.creation;

public class UsingThreads {
	
	public static void main(String[] args) {
		
		FirstWay firstWay = new FirstWay();
		firstWay.start();
		
	}

}

class FirstWay extends Thread{
	
	public void run() {
		System.out.println("Thread running");
	}
	
}