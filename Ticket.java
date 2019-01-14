public abstract class Ticket{
	String name;
	int bags, drinks;
	public Ticket(String nameIn,int bagsIn,int drinksIn){
		name=nameIn;
		bags=bagsIn;
		drinks=drinksIn;
	}
	
	abstract double calculateFees();
}
