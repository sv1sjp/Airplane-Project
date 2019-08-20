import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class Client {

	public static void main(String[] args) {
		
//FIELDS		
		int choice,index=0,idChoice,x;
		boolean Found=false; //will be used to see if the object with a certain id is already present
@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");//String to LocalDate
		DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:MM");//String to LocalTime
		LocalDate date;//temporary placeholder for the date
		String seatType = null;//type of the seat 
		
		
	//Arraylists for objects
		 ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
		 ArrayList<Menu> menu = new ArrayList<Menu>();
		 ArrayList<Flight> flight = new ArrayList<Flight>();
		 ArrayList<Ticket> ticket = new ArrayList<Ticket>();
		
		
		 

		do {

			//only accept integers from 0 to 8
				do {
					printListing();//Main menu
					choice=sc.nextInt();
						
				}while(choice>8 || choice<0);
				
				Found=false;//Make boolean Found false in order to be used later
				switch (choice) {
//A				
					case 1:
					
						System.out.println("Enter Airplane id and press Enter");
						idChoice = sc.nextInt();
						for(index=0;index<airplanes.size();index++){
							
							if(idCompare(airplanes.get(index).getId(), idChoice)==0) {	//Break if idChoice is found in arraylist airplanes
								System.out.printf("Found airplane with that id.Editing airplane with id %d...\n",airplanes.get(index).getId());
								Found=true;
								break;
							}
						}
						//if the id has not been found
						if(Found==false) {
							System.out.println("Airplane with that id is not found.Creating new...");
							airplanes.add(new Airplane(idChoice, null, 0, 0, 0));
							
						}
						//set values to fields by getting the object from the arraylist
						System.out.print("Enter the rows of seats: ");
						airplanes.get(index).setRows(sc.nextInt());
						System.out.print("Enter the columns of seats: ");
						airplanes.get(index).setColumns(sc.nextInt());
						System.out.print("Enter the Business Class seat rows: ");
						airplanes.get(index).setBusinessRows(sc.nextInt());
						break;
						
						
//B						
					case 2:
						System.out.println("Enter Menu id and press Enter");
						idChoice = sc.nextInt();
						for(index=0;index<menu.size();index++){
						
							if(idCompare(menu.get(index).getId(), idChoice)==0) {	//Break if idChoice is found in arraylist menu
								System.out.printf("Found menu with that id.Editing menu with id %d...\n",menu.get(index).getId());
								Found=true;
								break;
							}
						}
						//in case the menu with that id is not found make a blank menu
						if(Found==false) {
							System.out.println("Menu with that id is not found.Creating new...");
							menu.add(new Menu());
							menu.get(index).setId(idChoice);
							
						}
						menu.get(index).setDish();
						menu.get(index).setDesert();
						menu.get(index).setDrink();
						break;
//C					
					case 3:
						boolean flightidFound=false;
						System.out.println("Enter Flight's id and press Enter");
						idChoice = sc.nextInt();
						System.out.print("Enter Flight's date and press Enter(in format dd-MM-YYYY): ");
						date=LocalDate.parse(sc.next(),dtfDate);
						sc.nextLine();
						System.out.print("Enter airplane: ");
						String airplaneName = sc.nextLine();
						for (index=0; index<flight.size() ;index++){
							
							if (flight.get(index).getAircraft().equals(airplaneName) && flight.get(index).getDepDate()== date)
							{
								System.out.printf("Found plane with that name .Editing airplane with name %s...\n",flight.get(index).getAircraft());
								Found=true;
								break;
							}
							if(flight.get(index).getId()==idChoice) {
								
								flightidFound=true;
							}
						}
						
						if(Found==false && flightidFound==false) {
								System.out.println("Aircraft with that name is not found.Creating new...");
								flight.add(new Flight());
								flight.get(index).setAircraft(airplaneName);
								flight.get(index).setDepDate(date);
								System.out.print("Enter departure airport: ");
								flight.get(index).setDepAirport(sc.nextLine());
								System.out.print("Enter destination airport: ");
								flight.get(index).setDestAirport(sc.nextLine());
								System.out.print("Enter menu id for this flight: ");
								flight.get(index).setMenuId(sc.nextInt());
								System.out.print("Enter the total number of seats for this flight: ");
								flight.get(index).setAllSeats(sc.nextInt());
								do
								{
									System.out.print("Enter the number of taken seats: ");
									flight.get(index).setTakenSeats(sc.nextInt());
								}
								while(flight.get(index).getTakenSeats()>flight.get(index).getAllSeats());   //Taken Seats cannot be more than All Seats
								setRowsColumns(airplanes,flight,idChoice,index);
								flight.get(index).setId(idChoice);
								System.out.print("Enter Flight's time  and press Enter(in format HH:MM): ");
								flight.get(index).setDepTime(LocalTime.parse(sc.next(),dtfTime));
							
						}
						
						
						
						
						break;
						
//D						
					case 4:
						System.out.print("Enter flight id to remove: ");
						idChoice=sc.nextInt();
						for(index=0;index<flight.size();index++) {
							if(idCompare(idChoice,flight.get(index).getId())==0) {
								Found=true;
								flight.remove(index); 
								break;
							}
						}
						if(Found==false)
						{
							System.out.println("Flight with that id not found");
							
						}

						if(ticket.size()==0) {
							System.out.println("No tickets to remove");
						}
						else {
							for(int j=0; j<ticket.size();j++){
								if (idCompare(ticket.get(index).getId(),idChoice)==0)
								{
									System.out.printf("Names: \t  ");
									System.out.printf(ticket.get(index).getPassengerName());
									System.out.printf(" Prices: ");
									System.out.println(ticket.get(index).getPrice());
									ticket.remove(index);
								}
							}	
						}
						break;
//E
					case 5:
						seatType=null;
						System.out.print("Enter Flight id: ");
						int flightid=sc.nextInt();
						System.out.println("Enter the type of the seat(economy,business): ");
						do {
							seatType=sc.next();
						}while(!seatType.equals("economy") && !seatType.equals("business"));
						for(index=0;index<flight.size();index++) {
							if(idCompare(flightid,flight.get(index).getId())==0) {
								Found=true;
								System.out.printf("Found flight with that id. Making ticket for flight %d...\n",flight.get(index).getId());
								break;
							}
						}
			//check if all conditions are met(empty seat+type of seat exists)
						if(Found==false)
							System.out.println("Flight not found");
						else if(flight.get(index).getAllSeats() - flight.get(index).getTakenSeats()==0)
							System.out.println("There are currently no empty seats. Sorry! ");
						else if(seatType.equals("economy") || seatType.equals("business")) {
					//find ticket with that id
							ticket.add(new Ticket(0, flightid, null, null, null, 0, null, null, null, null));
							index=ticket.size()-1;
							ticket.get(index).setKindClass(seatType);//set the kind of the class as economy or business
							System.out.print("Enter the name of the passenger: ");
							ticket.get(index).setPassengerName(sc.next());
							System.out.print("Enter issuance date (in format dd-MM-YYYY): ");
							ticket.get(index).setIssuance(LocalDate.parse(sc.next(),dtfDate));
							
							System.out.print("Enter the type of the ticket: ");
							ticket.get(index).setKindTicket(sc.next());
							System.out.print("Enter the id of the ticket: ");
							ticket.get(index).setId(sc.nextInt());
							
							
							System.out.print("Enter the Price: ");
							ticket.get(index).setPrice(sc.nextInt());
							
							//Code bellow is used for i			
							if(seatType.equals("business")) {
								int temp1=flight.get(index).getFull();
								flight.get(index).setFull(temp1+1);
							}
							
							int temp=flight.get(index).getTakenSeats();
							flight.get(index).setTakenSeats(temp+1);
	
						}
						
						break;
						
//F						
					case 6:
						Found=false;
						System.out.print("Give me the ticket's id: ");
						idChoice=sc.nextInt();
						for(index=0;index<ticket.size();index++) {
							if(idCompare(ticket.get(index).getId(), idChoice)==0) {
								Found=true;
								break;
							}
						}
						if (Found==false){ 
								System.out.println("Id can't be found");
						}
						else{
							ticket.remove(index);
							System.out.println("Succesfully removed ticket");
						}
						break;

//G				
					case 7:
						System.out.print("Give me an the ticket's id: ");
						idChoice=sc.nextInt();
						for(index=0;index<ticket.size();index++) {
							
							if(idCompare(idChoice,ticket.get(index).getId())==0) {
								Found=true;
								break;
							}
							
						}
						if(Found==false){ 
							System.out.println("Id can't be found");
						}
						else if(ticket.get(index).getKindTicket().equals("economy"))
								System.out.println("This is not a business ticket");
						else{
							int i;
							if(menu.size()==0) {
								for(i=0;i<menu.size();i++) {
									System.out.printf("%d.",i+1);
									menu.get(i).getDish();
								}
							
								System.out.print("Select the number of the dish: ");
								ticket.get(index).setDish(menu.get(i).dishes.get(sc.nextInt()-1));
							
								
								for(i=0;i<menu.size();i++) {
									System.out.printf("%d.",i+1);
									menu.get(i).getDesert();
								}
								System.out.print("Select the number of the desert: ");
								ticket.get(index).setDesert(menu.get(i).deserts.get(sc.nextInt()-1));
							
							
								for(i=0;i<menu.size();i++) {
									System.out.printf("%d.",i+1);
									menu.get(i).getDrink();
								}
								System.out.print("Select the number of the drink: ");					
								ticket.get(index).setDrink(menu.get(i).drinks.get(sc.nextInt()-1));
							}
						}
						break;

						}
						
				
		
		}while(choice!=0);

						
						
						
						
								
						
					}




	static private void printListing() {
		System.out.print("The Airplane Project: Java's Second Semester Homework  \nCreated by DimitrisV and dimi1119 \n \n [1] Insert Airplane\n [2] Insert Menu\n [3] Insert Flight\n [4] Cancel Flight\n [5] Book Ticket\n [6] Cancel Ticket\n [7] Order Menu Items (Available only in Business Seats)\n [0] Exit\nEnter the desired number and press Enter: ");
	}
	
	static private int idCompare(int classId,int inputId) {
		if(classId==inputId)
			return 0;
		else
			return 1;
	}
	
	
	static void setRowsColumns(ArrayList<Airplane> airplanes,ArrayList<Flight> flight,int id,int index) {
		for(int i=0;i<airplanes.size();i++) {
			if(airplanes.get(index).getId() ==id) {
				flight.get(index).setRows(airplanes.get(i).getRows());
				flight.get(index).setColums(airplanes.get(i).getColumns());
			}
			
		}
	}
}