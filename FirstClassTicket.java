/**
	@auther Walker Lewery 3617181
	This class defines a First class airline ticket 
*/
public class FirstClassTicket extends Ticket{
	/** The base cost of the first class ticket*/
	double BASECOST=2175;
	
	/**
		This method creates a airline ticket 
		@param String Name of the passenger 
		@param 	int number of checked bags
		@param	int number of drinks on the plane
	*/
	public FirstClassTicket(String nameIn,int bagsIn,int drinksIn){
		super(nameIn,bagsIn,drinksIn);
	}

	/**
		This method claculates the cost of the flight
	*/
	public double calculateFees(){
		double drinkReturn=0;
		if (drinks>2){
			drinkReturn=(drinks-2)*2.5;
		}
		else{drinkReturn=0;}	
		return(2175+(bags*30)+drinkReturn);
	}

	/**
		This method returns the boarding groups, which is always one for first class flyers 
	*/
	public int getBoardingGroup(){
		return(1);
	}
}
