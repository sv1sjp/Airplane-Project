import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	private int id;
	ArrayList<String> dishes = new ArrayList<String>();
	ArrayList<String> deserts = new ArrayList<String>();
	ArrayList<String> drinks = new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//Arraylists gets/sets
	
//MAIN DISH
	public ArrayList<String> getDish() {
		return dishes; 
	}
	
	public void setDish() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<dishes.size();i++) {
			dishes.remove(i);
		}
		while(true) {
			System.out.print("Enter the dish(Enter STOP to end): ");
			String input=sc.nextLine();
			if(input.equals("STOP")) 
					break;
			else 
				dishes.add(input);
			
		}
		
	}
	
//DESERT
	
	public ArrayList<String> getDesert() {
		return deserts; 
	}
	
	public void setDesert() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<deserts.size();i++) {
			deserts.remove(i);
			}
			while(true) {
				System.out.print("Enter the desert(Enter STOP to end): ");
				String input=sc.nextLine();
				if(input.equals("STOP")) 
					break;
				else 
					deserts.add(input);
			
				}
		
		}
		
		
//DRINK
		public ArrayList<String> getDrink() {
			return drinks; 
		}
		
		public void setDrink() {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<deserts.size();i++) {
				deserts.remove(i);
			}
			while(true) {
				System.out.print("Enter the drink(Enter STOP to end): ");
				String input=sc.nextLine();
				if(input.equals("STOP")) 
						break;
				else 
					deserts.add(input);
				
			}
		
	}
	
	
	
	
	
}
