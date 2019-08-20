import java.time.*;

public class Flight {
	//fields
	private int n,m;//To set the rows and columns
	private int id;
	private LocalDate depDate;
	private LocalTime depTime;
	private String depAirport;
	private String destAirport;
	private String aircraft;
	private Seat[][] seats = new Seat[n][m];
	private int menuId;
	private int allSeats;
	private int takenSeats;
	private int full; //variable to utilize i
	
	//getters-setters	
	public int getFull() {
		return full;
	}
	public void setFull(int full) {
		this.full = full;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public LocalDate getDepDate() {
		return depDate;
	}
	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}
	
	
	public LocalTime getDepTime() {
		return depTime;
	}
	public void setDepTime(LocalTime depTime) {
		this.depTime = depTime;
	}
	
	
	public String getDepAirport() {
		return depAirport;
	}
	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}
	
	
	public String getDestAirport() {
		return destAirport;
	}
	public void setDestAirport(String destAirport) {
		this.destAirport = destAirport;
	}
	
	
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	
	
	public Seat[][] getSeats() {
		return seats;
	}
	public void setSeats(Seat[][] seats) {
		this.seats = seats;
	}
	
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	
	
	public int getAllSeats() {
		return allSeats;
	}
	public void setAllSeats(int allSeats) {
		this.allSeats = allSeats;
	}
	
	
	public int getTakenSeats() {
		return takenSeats;
	}
	public void setTakenSeats(int takenSeats) {
		this.takenSeats = takenSeats;
	}
	
//For rows and columns of seats	
	public int getRows() {
		return n;
	}
	public void setRows(int n) {
		this.n = n;
	}
	
	
	public int getColums() {
		return m;
	}
	public void setColums(int m) {
		this.m = m;
	}
	
	
}
