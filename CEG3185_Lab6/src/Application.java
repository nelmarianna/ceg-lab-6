
public class Application {
	public static void main (String[] args)
	{
		System.out.println("Starting Application");
		new Thread(new Server()).start();
		new Thread(new ClientB()).start();
		new Thread(new ClientC()).start();
		
	}

}
