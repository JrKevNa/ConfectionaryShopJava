package Adapter;

import Model.Cash;
import Model.Crypto;

public class CryptoAdapter extends Cash{
	
	private Crypto crypto;
	
	public CryptoAdapter() {
		// TODO Auto-generated constructor stub
		this.crypto = new Crypto();
	}
	
	public void printPayment(double price)
	{
		this.crypto.printPayment(price);
	}
}
