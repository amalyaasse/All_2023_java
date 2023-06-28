import java.util.ArrayList;
import java.util.concurrent.Semaphore;


public class CallCenterTest {

	public static void main(String[] args) {
		
		Telefonanlage tel = new Telefonanlage();
		int numberOfWorkers = 3;
		Semaphore sem = new Semaphore(numberOfWorkers, true);
        
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		int numOfThreads = 30;
		
		for(int i=0; i<numOfThreads; i++){
			Thread currThread = new AnrufThread(i, tel, sem);
			threadList.add(currThread);
			currThread.start();
		}
		
		for(int i=0; i<numOfThreads; i++){
			try {
				threadList.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        System.out.println("Alle Anrufe erledigt.");

	}

}
