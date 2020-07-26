package Assignment2;

public class Book extends Author{
	String bname;
	double price;
	int qty=0;
	
	public Book(String bname,double price,int qty,String name, String email, String gender) {
		super(name, email, gender);
		// TODO Auto-generated constructor stub
		this.bname=bname;
		this.price=price;
		this.qty=qty;
	}
	public void showInfo() {
		System.out.println("Book Information :"+this.bname+","+this.price+","+this.qty);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Java Programming language",20000.00,2,"U Mg","umg@gmail.com","male");
		Book b2=new Book("C# Programming language",15000.00,3,"U Hla","uhla@gmail.com","male");
		Book b3=new Book("Python Programming language",25000.00,1,"Daw Khaing","khaing@gmail.com","female");
		
		b1.showInfo();
		b1.showAuthor();
		
		b2.showInfo();
		b2.showAuthor();
		
		b3.showInfo();
		b3.showAuthor();
	}

}
