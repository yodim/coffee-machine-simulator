import java.io.IOException;
import java.util.Scanner;

public class Client extends Personne {

	public Client() {	}
	
	final static int teaPrice = 5;
	final static int coffeePrice = 10;
	static Scanner clavier = new Scanner(System.in);
	Technicien tech = new Technicien();

	public void clientMenu() throws IOException, InterruptedException {
		do {
			System.out.println("Veuillez choisir un boisson:\n");
			System.out.println("1: thé");
			System.out.println("2: café noire (concentrée)");
			System.out.println("3: café au lait");
			System.out.println("4: café avec sucre");
			System.out.println("5: café sans sucre");
			System.out.println("0: Menu Technicien");
			System.out.println("choix :");
			
			
			int DrinkChoice = clavier.nextInt();
			int DrinkPrice = 0;
			
			switch(DrinkChoice)
	           {  
	             case 0:
		 				System.out.println("mot de passe :");
		 				String pwd = clavier.next();
		 				if ("1223".equals(pwd)) {
		 					tech.techMenu();
		 				}
		 				else {
		 					System.out.println("mot de passe incorrect !");
		 					clientMenu();
		 				}
	                 break;
	            	
	             case 1:
		         	  DrinkPrice = teaPrice;
		         	  if (tech.remainingTea() > 0.02 && tech.remainingWater()>0.02 && tech.totalCups()>0) {
		         		  payment(DrinkPrice);
			         	  tech.addTea(-0.02);
			         	  tech.addWater(-0.02);
			         	  tech.addGoblets(-1);
		         	  }
		         	  else {
		         		 System.out.println("Désolé ! pas assez de ressources :/");
		         	  }
		         	  
	                 break;
	                 
	              case 2:
	            	  DrinkPrice = coffeePrice;
	            	  if (tech.remainingCoffee() > 0.02 && tech.remainingWater()>0.02 && tech.totalCups()>0) {
		         		  payment(DrinkPrice);
		            	  tech.addCoffee(-0.02);
		            	  tech.addWater(-0.02);
		            	  tech.addGoblets(-1);
		         	  }
		         	  else {
		         		 System.out.println("Désolé ! pas assez de ressources :/");
		         	  }
	            	  
	                 break;
	                 
	              case 3:
	            	  DrinkPrice = coffeePrice;
	            	  if(tech.remainingCoffee() > 0.02 && tech.remainingMilk()>0.02 && tech.totalCups()>0) {
		         		  payment(DrinkPrice);
		            	  tech.addCoffee(-0.01);
		            	  tech.addMilk(-0.01);
		            	  tech.addGoblets(-1);
		         	  }
		         	  else {
		         		 System.out.println("Désolé ! pas assez de ressources :/");
		         	  }
	            	  
	                 break;
	                 
	              case 4:
	            	  DrinkPrice = coffeePrice;
	            	  if(tech.remainingCoffee() > 0.02 && tech.remainingWater()>0.02 && tech.remainingSugar()>0.005 && tech.totalCups()>0) {
		         		  payment(DrinkPrice);
		            	  tech.addCoffee(-0.02);
		            	  tech.addSugar(-0.005);
		            	  tech.addWater(-0.02);
		            	  tech.addGoblets(-1);
		         	  }
		         	  else {
		         		 System.out.println("Désolé ! pas assez de ressources :/");
		         	  }
	            	  
	                 break;
	                 
	              case 5: 
	            	  DrinkPrice = coffeePrice;
	            	  if(tech.remainingCoffee() > 0.01 && tech.remainingWater()>0.02 && tech.totalCups()>0) {
		         		  payment(DrinkPrice);
		            	  tech.addCoffee(-0.01);
		            	  tech.addWater(-0.02);
		            	  tech.addGoblets(-1);
		         	  }
		         	  else {
		         		 System.out.println("Désolé ! pas assez de ressources :/");
		         	  }
	            	  
	            	  break;

	                 
	              default : 
	            	  System.out.println("Choix erroné");
	            	  clientMenu();
	           }			
		}while(true);		
	}
	
	
	
	
	static int changeClacul (int DrinkPrice, int InsertedMoney) {
		int d;
		d = InsertedMoney - DrinkPrice;
		return d;
	}
	
	
	
	
	static boolean PrepareDrink() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("\nVotre boisson est en train de prépration...");
		System.out.println("Veuillez attendre un petit moment.");
		Thread.sleep(10000); 	// 10000ms = 10s 
		System.out.println("\nVotre boisson est prêt !"
							+ "\nEnjoy it !\n\n");
		return true;
	}
	
	
	
	
	static void payment(int DrinkPrice) throws InterruptedException {
		System.out.println("Insérez " + DrinkPrice + " dirhams.");
		int InsertedMoney = clavier.nextInt();
		int change = changeClacul(DrinkPrice, InsertedMoney);
		
		if (change == 0) {
			PrepareDrink();
		}
		if (change < 0) {
			System.out.println("montant insufisant !");
		}
		if (change > 0) {
			System.out.println("Montant à retouner : " + change + " dirhams.");
			System.out.println("Veuillez récuperer votre change.\n");
			PrepareDrink();
		}
	}

}
