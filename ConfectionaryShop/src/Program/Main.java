package Program;

import java.util.ArrayList;
import java.util.Scanner;

import Factory.ConfectionaryFactory;
import Model.Confectionary;
import Model.Tart;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	ArrayList <Confectionary> confectionary = new ArrayList<>();
	ConfectionaryFactory cf = ConfectionaryFactory.getInstance();
	public Main() {
		// TODO Auto-generated constructor stub
		
		int opt = 0;
		do
		{
			System.out.println("Nom Nom Co.");
			System.out.println("===========");
			System.out.println("1. Bake confectionary");
			System.out.println("2. View confectionary order");
			System.out.println("3. Exit");
			System.out.print(">> ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt)
			{
			case 1:
				bakeConfectionary();
				break;
			case 2:
				viewConfectionary();
				break;
			}
		}
		while(opt != 3);
	}
	
	public void bakeConfectionary()
	{
		String type = null;
		do
		{
			System.out.print("Input confectionary type [Cupcake | Tart]: ");
			type = sc.nextLine();
		}
		while(!(type.equals("Cupcake") || type.equals("Tart")));
		
		confectionary.add(cf.makeCake(type));
	}
	
	public void viewConfectionary()
	{
		for(Confectionary c : confectionary)
		{
			c.printDetail();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
