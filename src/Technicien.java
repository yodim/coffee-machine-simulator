import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Technicien extends Personne {

	public Technicien() {}
	
	
	public void techMenu() throws  InterruptedException, NumberFormatException, IOException {
		Scanner clavier = new Scanner(System.in);
		int choix;
		
		do {
			System.out.println("\n1: Afficher les statistiques");
			System.out.println("2: Ajouter des goblets");
			System.out.println("3: Ajouter de l'eau (en litre)");
			System.out.println("4: Ajouter du thé (en Kg)");
			System.out.println("5: Ajouter du café (en Kg)");
			System.out.println("6: Ajouter du lait (en litre)");
			System.out.println("7: Ajouter du sucre (en Kg)");
			System.out.println("8: Quitter le menu Technicien");
			System.out.println("choix :");
			
			choix = clavier.nextInt();
			
			switch(choix)
	           {  case 1:
	        	   statistics();
	                 break;
	                 
	              case 2:
	            	  System.out.println("Entrer la quantité de goblets à ajouter :");
	            	  int qtt = clavier.nextInt();
	            	  addGoblets(qtt);
	            	  System.out.println("Ajouté avec succès !");
	                 break;
	                 
	              case 3:
	            	  System.out.println("Entrer la quantité d'eau à ajouter (en L):");
	            	  double eauQtt = clavier.nextDouble();
	            	  addWater(eauQtt);
	            	  System.out.println("Ajouté avec succès !");
	                 break;
	                 
	              case 4:
	            	  System.out.println("Entrer la quantité du thé à ajouter (en Kg):");
            	   	  double teaQtt = clavier.nextDouble();
	            	  addTea(teaQtt);
	            	  System.out.println("Ajouté avec succès !");
	                 break;
	                 
	              case 5: 
	            	  System.out.println("Entrer la quantité du café à ajouter (en Kg):");
	            	  double cafeQtt = clavier.nextDouble();
	            	  addCoffee(cafeQtt);
	            	  System.out.println("Ajouté avec succès !");
                 break;
                 
	              case 6: 
	            	  System.out.println("Entrer la quantité du lait à ajouter (en L):");
	            	  double MilkQtt = clavier.nextDouble();
	            	  addMilk(MilkQtt);
	            	  System.out.println("Ajouté avec succès !");
                 break;
	                 
	              case 7: 
	            	  System.out.println("Entrer la quantité de sucre à ajouter (en Kg):");
	            	  double sugQtt = clavier.nextDouble();
	            	  addSugar(sugQtt);
	            	  System.out.println("Ajouté avec succès !");
	                 break;
	                 
	              case 8: 
	            	  Client cl = new Client();
	            	  cl.clientMenu();
	                 break;
	                 
	              default : System.out.println("Choix erroné");
	           }
			
		}while(choix != 7);
		clavier.close();
	}
	
	
		


	public void addSugar(double d) {
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("remainingSugar")) {
	            	 double old = Double.parseDouble(split[1]);
	            	 double neew = d+old;
	            	 String newStr = neew+"";
	            	line = "remainingSugar:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        }
	}


	
	
	public void addCoffee(double d) {	
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("remainingCoffee")) {
	            	 double old = Double.parseDouble(split[1]);
	            	 double neew = d+old;
	            	 String newStr = neew+"";
	            	line = "remainingCoffee:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}

	
	

	public void addTea(double d) {
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("remainingTea")) {
	            	 double old = Double.parseDouble(split[1]);
	            	 double neew = d+old;
	            	 String newStr = neew+"";
	            	line = "remainingTea:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	


	public void addWater(double eauQtt)  {
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("remainingWater")) {
	            	 double old = Double.parseDouble(split[1]);
	            	 double neew = eauQtt+old;
	            	 String newStr = neew+"";
	            	//line.replace(split[1], newStr);
	            	line = "remainingWater:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        }
	}


	public void addGoblets(int qtt) {
		
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("totalCups")) {
	            	 int old = Integer.parseInt(split[1]);
	            	 int neew = qtt+old;
	            	 String newStr = neew+"";
	            	//line.replace(split[1], newStr);
	            	line = "totalCups:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        }      		
	}
	
	
	
	
	
	public void addMilk(double d) {
		try {			
			// input the (modified) file content to the StringBuffer "input"
	        BufferedReader file = new BufferedReader(new FileReader("coffeeMachine.stats.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String line;
	        
	        while ((line = file.readLine()) != null) {
	        	String[] split = line.split(":");
	        	if (split[0].equals("remainingMilk")) {
	            	 double old = Double.parseDouble(split[1]);
	            	 double neew = d+old;
	            	 String newStr = neew+"";
	            	line = "remainingMilk:"+newStr;
	            }
	            inputBuffer.append(line);
            	inputBuffer.append('\n');
	        }
	        file.close();

	        // write the new string with the replaced line OVER the same file
	        FileOutputStream fileOut = new FileOutputStream("coffeeMachine.stats.txt");
	        fileOut.write(inputBuffer.toString().getBytes());
	        fileOut.close();                     
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	
	int totalCups() throws NumberFormatException, IOException {
		int totalCups = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("totalCups".equals(split[0])) {
            	totalCups = Integer.parseInt(split[1]);
            }
        }
        return totalCups;
	}
	
	double remainingWater() throws NumberFormatException, IOException {
		double remainingWater = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("remainingWater".equals(split[0])) {
            	remainingWater = Double.parseDouble(split[1]);
            }
        }
        return remainingWater;
	}
	
	
	double remainingTea() throws NumberFormatException, IOException {
		double remainingTea = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("remainingTea".equals(split[0])) {
            	remainingTea = Double.parseDouble(split[1]);
            }
        }
        return remainingTea;
	}
	
	
	double remainingCoffee() throws NumberFormatException, IOException {
		double remainingCoffee = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("remainingCoffee".equals(split[0])) {
            	remainingCoffee = Double.parseDouble(split[1]);
            }
        }
        return remainingCoffee;
	}
	
	
	double remainingMilk() throws NumberFormatException, IOException {
		double remainingMilk = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("remainingMilk".equals(split[0])) {
            	remainingMilk = Double.parseDouble(split[1]);
            }
        }
        return remainingMilk;
	}
	
	
	double remainingSugar() throws NumberFormatException, IOException {
		double remainingSugar = 0;
		String record = null;
        FileReader in = new FileReader("coffeeMachine.stats.txt");

        @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(in);
        
        while ((record = br.readLine()) != null) {
            String[] split = record.split(":");
            if ("remainingSugar".equals(split[0])) {
            	remainingSugar = Double.parseDouble(split[1]);
            }
        }
        return remainingSugar;
	}
	
	

	public void statistics() throws NumberFormatException, IOException {
		System.out.println("\n Statistics :" +
			                "\n nombre de goblets restants : " + totalCups() + 
			                "\n Eau restante : " + remainingWater() + " L"+
			                "\n Thé restant : " + remainingTea() + " Kg"+
			                "\n Café restante : " + remainingCoffee() + " Kg" +
			                "\n Lait restant : " + remainingMilk() + " L" +
			                "\n Sucre restant : " + remainingSugar() + " Kg");
        
	}
}

