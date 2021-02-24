package model;

public class Product {
	    private String _type;
	    private String _title;
	    private int _price;
	    
	    public Product()
	    {
	    	_type = "Book";
	    	_title = "C";
	    	_price = 150;
	    }
	    
	    public Product(String type,String title,int price)
	    {
	    	_type = type;
	    	_title = title;
	    	_price = price;
	    }
	    
	    public String getType() { return _type; }
	    public String getTitle() { return _title; }
	    public int getPrice() { return _price; }
	    
}
