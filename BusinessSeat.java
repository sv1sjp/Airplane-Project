
public class BusinessSeat extends Seat {
	private Menu menu;
	//Constructor from Seat + Menu Field
	public BusinessSeat(int id, int row, int column, int ticket,Menu menu) {
		super(id, row, column, ticket);
		this.menu=menu;
		
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	

}
