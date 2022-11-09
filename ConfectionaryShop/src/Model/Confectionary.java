package Model;

import java.util.ArrayList;
import java.util.Scanner;

import Adapter.CryptoAdapter;
import Adapter.TransferAdapter;
import Factory.PaymentFactory;

public abstract class Confectionary {
	
	private String name;
	private String softness;
	private ArrayList <String> topping;
	private Double price;
	private Cash cash;
	
	public Confectionary() {
		// input name;
		Scanner sc = new Scanner(System.in);
		String name = null;
		do
		{
			System.out.print("Input confectionary name [length between 5 - 15]: ");
			name = sc.nextLine();
		}
		while(name.length() < 5 || name.length() > 15);
		this.name = name;
		
		String softness = null;
		do
		{
			System.out.print("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
			softness = sc.nextLine();
		}
		while(!(softness.equals("Fluffy") || softness.equals("Medium") || softness.equals("Hard")));
		this.softness = softness;
		
		ArrayList <String> topping = new ArrayList<>();
		String toppingOpt = null;
		do
		{
			System.out.print("Addding additional topping [Y | N]: ");
			toppingOpt = sc.nextLine();
		}
		while(!(toppingOpt.equals("Y") || toppingOpt.equals("N")));
		
		if(toppingOpt.equals("Y"))
		{
			for(int i=1; i<=3; i++)
			{
				String toppingName = null;
				do
				{
					System.out.printf("Input topping [length between 1 - 10]: ");
					toppingName = sc.nextLine();
				}
				while(toppingName.length() < 1 || toppingName.length() > 10);
				topping.add(toppingName);
			}
		}
		this.topping = topping;
		
		double price = 0;
		do
		{
			System.out.print("Input confectionary price [10.0 - 50.0]: ");
			price = sc.nextFloat();
			sc.nextLine();
		}
		while(price < 10 || price > 50);
		this.price = price;
		
		String type = null;
		do
		{
			System.out.print("What kind of payment [Cash | Transfer | Crypto]: ");
			type = sc.nextLine();
		}
		while(!(type.equals("Cash") || type.equals("Transfer") || type.equals("Crypto")));
		
		// cara 1
		PaymentFactory paymentFactory = PaymentFactory.getInstance();
		this.cash = paymentFactory.setPayment(type);
		
		// cara 2
//		if(type.equals("Cash"))
//		{
//			this.cash = new Cash();
//		}
//		else if(type.equals("Transfer"))
//		{
//			this.cash = new TransferAdapter();
//		}
//		else if(type.equals("Crypto"))
//		{
//			this.cash = new CryptoAdapter();
//		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSoftness() {
		return softness;
	}
	public void setSoftness(String softness) {
		this.softness = softness;
	}
	public ArrayList<String> getTopping() {
		return topping;
	}
	public void setTopping(ArrayList<String> topping) {
		this.topping = topping;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Cash getCash() {
		return cash;
	}
	public void setCash(Cash cash) {
		this.cash = cash;
	}
	public abstract void printType();
	
	public void printDetail()
	{
		System.out.printf("Name\t\t: %s ", this.name);
		printType();
		System.out.println();
		System.out.printf("Softnesss\t: %s\n", this.softness);
		System.out.printf("Topping\t\t:");
		if(!(this.topping.isEmpty()))
		{
			for(String s : this.topping)
			{
				System.out.printf(" %s", s);
			}
			System.out.println();
		}
		else
		{
			System.out.println(" -");
		}
		this.cash.printPayment(this.price);
		System.out.println();
	}
}
