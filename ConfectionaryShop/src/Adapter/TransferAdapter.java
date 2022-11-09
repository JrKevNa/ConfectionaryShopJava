package Adapter;

import Model.Cash;
import Model.Transfer;

public class TransferAdapter extends Cash{
	
	private Transfer transfer;
	
	public TransferAdapter() {
		// TODO Auto-generated constructor stub
		this.transfer = new Transfer();
	}
	
	public void printPayment(double price)
	{
		this.transfer.printPayment(price);
	}
}
