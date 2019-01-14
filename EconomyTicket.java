/**
	a class that defines a Economy Airline ticket 
	@auther Walker Lewery
*/
import java.util.Random;
public class EconomyTicket extends Ticket{
	/** Set rate of a econ ticket*/
	double TICKETCOST=1350;
	
	/** 
		creates a economy airline ticket
		@param String nameIn
		@param int amount of checked bags 
		@param int about of drinks on the place	
	*/
	public EconomyTicket(String nameIn,int bagsIn,int drinksIn){
		super(nameIn,bagsIn,drinksIn);
	}
	
	/**
		Calculates the cost of the flight
		@returns the cost of the flight
	*/
	public double calculateFees(){
		double bagCost=50;
		
			if (bags>=1){
				for (int i=2; i<=bags;i++){
					bagCost+=35;
				}
				
			}
			else{bagCost=0;}

		return(1350+(drinks*2.5)+bagCost);
	}
	
	/**
		randomly picks a number between 2-4 and returns it 
		@returns a groups number between 2-4
	*/
	public int getBoardingGroup(){
		Random rand = new Random();
		int group = rand.nextInt(3)+2;
		return(group);
	}
}
