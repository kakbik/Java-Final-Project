package warProject;

public class Card {
	
	//fields
	private int value;
	private String name;
	
	
	//constructor
	public Card() {
		
		
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void describe () {
		
		System.out.println("This Card has the value: "+ value);
		System.out.println("This card has the name of: "+ name);
	}
}
