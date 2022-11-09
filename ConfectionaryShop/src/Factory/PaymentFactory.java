package Factory;

import Adapter.CryptoAdapter;
import Adapter.TransferAdapter;
import Model.Cash;

public class PaymentFactory {
	
	private static PaymentFactory instance;
	
	public static PaymentFactory getInstance() 
	{
		// TODO Auto-generated constructor stub
		if(instance == null)  instance = new PaymentFactory();
		return instance;
	}
	
	public Cash setPayment(String type) {
		// TODO Auto-generated constructor stub
		if(type.equals("Cash"))
		{
			return new Cash();
		}
		else if(type.equals("Transfer"))
		{
			return new TransferAdapter();
		}
		else if(type.equals("Crypto"))
		{
			return new CryptoAdapter();
		}
		return null;
	}

}
