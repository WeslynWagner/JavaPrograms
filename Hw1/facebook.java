import java.math.*;

class facebook{
	public static void main(String[] args){
		
	//Have to convert # users to BigDecimal to be able to multiply by a double
	BigDecimal initUsers = new BigDecimal("1000000000");
	//The growth rate for the first month 
	double rate = 1.02;
	//Multiply the intial # of users by the first months growth rate 
	BigDecimal afterMonthOne = initUsers.multiply(BigDecimal.valueOf(rate));
	System.out.println(afterMonthOne);
	
	//Have to convert target users to BigDecimal to be able to multiply by a double
	BigDecimal target = new BigDecimal("2500000000");
	//The growth rate for every month after the first
	double new_rate = 1.03;
	//The number of months after October 2012 that FB will reach 2.5B users
	int monthsAfter = 1;
	
	//Keep multiplying the number of users by growth rate until the total is greater than 2.5B
	//Use compareTo method to compare BigDecimals
	while(target.compareTo(afterMonthOne)>0){
		afterMonthOne = afterMonthOne.multiply(BigDecimal.valueOf(new_rate));
		System.out.println(afterMonthOne);
		monthsAfter+=1;
	}
	System.out.println("Facebook will reach 2.5B users "+monthsAfter+" months after Oct. 2012");
	}
}