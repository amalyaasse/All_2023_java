import java.util.Random;
import java.util.concurrent.Semaphore;

public class AnrufThread extends Thread {
	
	int anrufID;
	Telefonanlage tel;
	Semaphore sem;
	
	public AnrufThread(int anrufID, Telefonanlage tel, Semaphore sem){
		this.anrufID = anrufID;
		this.tel = tel;
		this.sem = sem;
	}
	
	public void run(){
		Random rand = new Random();
		int randInt = rand.nextInt(100); // + 2000;
		try {
			Thread.sleep(randInt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Eingehender Anruf: Nr. " + Integer.toString(this.anrufID));
		try {
			this.sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tel.call(this.anrufID);
        this.sem.release();
	}
	
}
