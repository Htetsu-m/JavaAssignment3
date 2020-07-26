package Assignment2;

public class Author {
	String name;
	String email;
	String gender;
	
	public Author(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public void showAuthor() {
		System.out.println("Author is :"+this.name+","+this.email+","+this.gender);
	}
}
