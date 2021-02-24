package model;

public class Test {
		
	public static void search(Product p,ShoppingCart s)
	{
		int cost;
		cost = s.searchPriceByTitle(p.getTitle());
		if(cost != -1)
			System.out.println(p.getTitle() + " cost " + p.getPrice() + " yen");
		else
			System.out.println(p.getTitle() + " is not in shoppingCart");
	}
	
	public static void main(String[] args)
	{
		int total =0,cost;
		Product pp = new Product();
		Product p1 = new Product("Book","Java", 100);
		Product p2 = new Product("Book","C++", 150);
		System.out.println("product pp is a " + pp.getType() + " and title is " + pp.getTitle());
		Customer c1 = new Customer();
		Customer c2 = new Customer("jykuo","1234", 0, 1000);
		ShoppingCart s1 = new ShoppingCart(c1);
		s1.buy(p1);
		s1.buy(p2);
		total = s1.getTotal();
		System.out.println(s1.getCustomer().getName() + " has " + s1.getAmount() + " products");	
		search(p1,s1);
		search(pp,s1);
		s1.showCart();
		s1.remove(p1);
		s1.remove(pp);
		total = s1.getTotal();
		System.out.println(s1.getCustomer().getName() + " has " + s1.getAmount() + " products");	
		s1.showCart();
		System.out.println("shoppingcart total cost => " + total);
		c1.pay(20);
		System.out.println("Hello " + c1.getName() + " your pointis " + c1.getPoint());
		System.out.println("your pwd is => " + c1.getPWD());
		System.out.println("your VIP level is => " + c1.getVIP());
		c2.pay(20);
		System.out.println("Hello " + c2.getName() + " your pointis " + c2.getPoint());
		System.out.println("your pwd is => " + c2.getPWD());
		System.out.println("your VIP level is => " + c2.getVIP());
		c2.changeVIP(1);
		System.out.println(c2.getName() + " your VIP level is => " + c2.getVIP());

		
	}
}
