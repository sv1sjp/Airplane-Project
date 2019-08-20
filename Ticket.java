import java.time.*; //for localdate

public class Ticket {
	// Fields
	private int id;
	private int FlightId;
	private LocalDate issuance;
	private String kindTicket;
	private String kindClass;
	private int Price;
	private String passengerName;
	private String dish;
	private String desert;
	private String drink;
	
	
//Constructor	
	public Ticket(int id, int flightId, LocalDate issuance, String kindTicket, String kindClass, int price,
			String passengerName, String dish, String desert, String drink) {
		super();
		this.id = id;
		FlightId = flightId;
		this.issuance = issuance;
		this.kindTicket = kindTicket;
		this.kindClass = kindClass;
		Price = price;
		this.passengerName = passengerName;
		this.dish = dish;
		this.desert = desert;
		this.drink = drink;
	}

// Getters-Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public int getFlightId() {
		return FlightId;
	}
	public void setFlightId(int flightId) {
		FlightId = flightId;
	}



	public LocalDate getIssuance() {
		return issuance;
	}
	public void setIssuance(LocalDate issuance) {
		this.issuance = issuance;
	}



	public String getKindTicket() {
		return kindTicket;
	}
	public void setKindTicket(String kindTicket) {
		this.kindTicket = kindTicket;
	}



	public String getKindClass() {
		return kindClass;
	}
	public void setKindClass(String kindClass) {
		this.kindClass = kindClass;
	}



	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}



	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}



	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}



	public String getDesert() {
		return desert;
	}
	public void setDesert(String desert) {
		this.desert = desert;
	}



	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}	
}
