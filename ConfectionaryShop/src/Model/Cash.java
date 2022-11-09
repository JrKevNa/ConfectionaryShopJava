package Model;

public class Cash{

	public Cash() {
		// TODO Auto-generated constructor stub
	}
	
	public void printPayment(double price)
	{
		System.out.printf("Payment type\t: Cash\n");
		System.out.printf("Price\t\t: $%.1f\n", price);
	}
}
