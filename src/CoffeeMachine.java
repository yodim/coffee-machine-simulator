import java.io.IOException;

public class CoffeeMachine {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("Bienvenue. \n");
		
		Client client = new Client();
		
		client.clientMenu();

	}

}
