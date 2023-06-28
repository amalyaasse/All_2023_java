import java.util.Random;


public class Telefonanlage {
	
	public void call(int anrufID){
		Random rand = new Random();
		int randInt = rand.nextInt(1000);// + 1000;
		try {
			Thread.sleep(randInt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Anruf Nr." + Integer.toString(anrufID) + " erledigt." );
	}

}
