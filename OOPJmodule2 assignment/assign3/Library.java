/*1. Create an abstract class Publication with data members ‘noOfPages’, ‘price’, ‘publisherName’ etc. with
their accessor/modifier functions. Now create two sub-classes Book and Journal. Create a class
Library that contains a list of Publications. Write a main() function and create three Books and two
Journals, add them to library and print the details of all publications.*/


abstract class Publication
{
	public int noOfPages;
	protected int price;
	String publisherName;
	
	abstract void printDetails();
	
	void setD(int noOfPages, int price, String publisherName)
	{
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
}

class Book extends Publication
{
	String book;
	Book()
	{
		book = null;
	}
	
	Book(String book, int noOfPages, int price, String publisherName)
	{
		super.setD(noOfPages, price, publisherName);
		this.book = book;
	}
	
	void printDetails()
	{
		System.out.println("Book name = "+book+"\nNo of pages = "+noOfPages+"\nPrice = "+price+"\nPublisher name = "+publisherName);
	}
	
}

class Journal extends Publication
{
	String journal;
	Journal()
	{
		journal = null;
	}
	Journal(String journal, int noOfPages, int price, String publisherName)
	{
		super.setD(noOfPages, price, publisherName);
		this.journal = journal;
	}
	
	void printDetails()
	{
		System.out.println("Journal name = "+journal+"\nNo.of pages = "+noOfPages+"\nPrice = "+price+"\nPublisher name = "+publisherName);
	}
}
class Library
{
	public static void main(String args[])
	{
		Book b1 = new Book("History",250,300,"Bipin chandra");
		b1.printDetails();
		System.out.println("===================================================");
		Book b2 = new Book("Science",350,600,"Anil Kolte");
		b2.printDetails();
		System.out.println("===================================================");
		Book b3 = new Book("Polity",150,200,"Ranjan Kolambe");
		b3.printDetails();
		System.out.println("===================================================");
		Journal j1 = new Journal("Biology",124,250,"abc");
		j1.printDetails();
		System.out.println("===================================================");
		Journal j2 = new Journal("Physics",225,300,"dbc");
		j2.printDetails();
		System.out.println("===================================================");
		
		
	}
}



/*
Book name = History
No of pages = 250
Price = 300
Publisher name = Bipin chandra
===================================================
Book name = Science
No of pages = 350
Price = 600
Publisher name = Anil Kolte
===================================================
Book name = Polity
No of pages = 150
Price = 200
Publisher name = Ranjan Kolambe
===================================================
Journal name = Biology
No.of pages = 124
Price = 250
Publisher name = abc
===================================================
Journal name = Physics
No.of pages = 225
Price = 300
Publisher name = dbc
===================================================
*/