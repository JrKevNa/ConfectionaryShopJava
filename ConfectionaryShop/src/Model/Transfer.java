package Model;

import java.util.Random;

public class Transfer{
	
	String transferAddress;
	public Transfer() {
		// TODO Auto-generated constructor stub
		this.transferAddress = setAddress();
	}
	
	public void printPayment(double price)
	{
		System.out.println("Payment type\t: Transfer");
		System.out.printf("Price\t\t: $%.1f with address : %s\n", price*1.1, this.transferAddress);
	}
	
	private String setAddress()
	{
		Random rand = new Random();
		
		String numbers = "1234567890";
		String uniqueId = "";
				
		char[] id = new char[10];
				
		for(int j=0; j<10; j++)
		{
			id[j] = numbers.charAt(rand.nextInt(numbers.length()));
		}
				
		for(int k=0; k<10; k++)
		{
			uniqueId += id[k];
		}
		
		return uniqueId;
	}
}
