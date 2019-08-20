
public abstract class Seat {
	
//Fields
	private int id;
	private int row;
	private int column;
	private int ticket;

//Constructor	
	public Seat(int id, int row, int column, int ticket) {
		super();
		this.id = id;
		this.row = row;
		this.column = column;
		this.ticket = ticket;
		}

	
//Getters-Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	
	
}
