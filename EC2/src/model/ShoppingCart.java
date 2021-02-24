package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ShoppingCart {
	private Customer customer;
	private ArrayList<Product> products = new ArrayList<>();
	
	public ShoppingCart(Customer c)
	{
		customer = c;
	}
	
	public Customer getCustomer() { return customer; }
	
	public void buy(Product p)
	{
		products.add(p);
	}
	
	public void remove(Product p)
	{
		System.out.println("remove product " + p.getTitle() + " " + p.getType() + " " + p.getPrice());
		try
		{
			if(!products.remove(p))
			{
				System.out.println("this product is not in your shoppingCart");
				throw new FileNotFoundException();
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void showCart()
	{
		Product p;
		for(int i=0;i<products.size();i++)
		{
			p=products.get(i);
			System.out.println(i + ". " + p.getTitle() + " " + p.getType() + " " + p.getPrice());
		}
	}
	
	public int getAmount() { return products.size(); }
	
	public int getTotal()
	{
		Product p;
		int total = 0;
		for(int i=0;i<products.size();i++)
		{
			p = products.get(i);
			total += p.getPrice();
		}
		return total;
	}
	
	public int searchPriceByTitle(String title)
	{
		for(Product p:products)
		{
			if(title == p.getTitle())
				return p.getPrice();
		}
		return -1;
	}
	
}
