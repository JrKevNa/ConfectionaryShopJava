package Model;

import java.util.Random;

public class Crypto{
	
	String transferAddress;
	
	public Crypto() {
		// TODO Auto-generated constructor stub
		this.transferAddress = setAddress();
	}
	
	private String setAddress() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "1234567890";
		String uniqueId = "";
				
		char[] id = new char[10];
				
		for(int j=0; j<10; j++)
		{
			if(rand.nextInt() % 2 == 0)
			{
				id[j] = numbers.charAt(rand.nextInt(numbers.length()));
			}
			else
			{
				id[j] = characters.charAt(rand.nextInt(characters.length()));
			}
		}
				
		for(int k=0; k<10; k++)
		{
			uniqueId += id[k];
		}
		
		return uniqueId;
	}

	public void printPayment(double price)
	{
		System.out.println("Payment type\t: Crypto");
		System.out.printf("Price\t\t: ADA %.1f with address : %s\n", price/2, this.transferAddress);
	}
}
