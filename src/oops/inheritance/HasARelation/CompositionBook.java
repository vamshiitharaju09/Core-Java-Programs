package oops.inheritance.HasARelation;

public class CompositionBook {
	String bookTitle;
	double price;
	CompositionAuthor a;
	CompositionBook(String bookTitle,double price,String authorName,int age)
	{
		this.bookTitle=bookTitle;
		this.price=price;
		a=new CompositionAuthor(authorName,age);
	}
	
	public  void displayBook()
	{
		System.out.println("Author Name : "+a.authorName);
		System.out.println("Author Age : "+a.age);
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Book Price : "+price);
		
}
	public static void main(String[]args)
	{
		CompositionBook b1=new CompositionBook("The Birds",298.0,"Saleem",37);
		b1.displayBook();
		System.out.println("-------------------------------");
		CompositionAuthor a=new CompositionAuthor("Saleem",37);
		a.displayAuthor();
	}
}
