
public class Airplane {
	
//Fields
	private int id;
	private String Description;
	private int rows;
	private int columns;
	private int businessRows;
	
		
//Constructor
	public Airplane(int id, String description, int rows, int columns, int businessRows) {
		
		this.id = id;
		Description = description;
		this.rows = rows;
		this.columns = columns;
		this.businessRows = businessRows;
		}
	
	
//Setters-Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	public int getBusinessRows() {
		return businessRows;
	}
	public void setBusinessRows(int businessRows) {
		this.businessRows = businessRows;
	}
	
	
	
		
}
