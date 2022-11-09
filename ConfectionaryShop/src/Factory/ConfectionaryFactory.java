package Factory;

import Model.Confectionary;
import Model.Cupcake;
import Model.Tart;

public class ConfectionaryFactory {
	
	private static ConfectionaryFactory instance;
	
	public static ConfectionaryFactory getInstance() 
	{
		// TODO Auto-generated constructor stub
		if(instance == null)  instance = new ConfectionaryFactory();
		return instance;
	}
	
	public Confectionary makeCake(String type)
	{
		if(type.equals("Cupcake"))
		{
			return new Cupcake();
		}
		else if(type.equals("Tart"))
		{
			return new Tart();
		}
		return null;
	}

}
