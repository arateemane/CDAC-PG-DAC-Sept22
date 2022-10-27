/*OOPJ Assignment
1. Implement a class for a Book. Book contains a title (a String), a list of authors (array of authors), number of
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and
accessor/modifier methods. Implement a class for Library. A library contains a list of books (array of Book).
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a
Library and add five Book to library. Print the total price of all books.*/

import java.util.Scanner;
class Book
{
	String title;
	String author;
	int pages;
	float price;
	String publisher;
	double totalp;
	
	Book()
	{
		String title = "Agnipankh";
		String author = "Kalam" ;
		String publisher = "Arun Tivari";
		int Pages = 256;
		float price =542.32f;
		
	}
	
	Book(String t,String a,String p,int pg,float pr)
	{
		//this.title = title;                      //non-static variable this cannot be referenced from a static context
		title = t;
		author = a;
		publisher = p;
		pages = pg;
		price = pr;
	
	}
    
	
	void printDetails()
	{
		System.out.println("\nTitle = "+title+"\nAuthor = "+author+"\nPublisher = "+publisher+"\nNo of Pages = "+pages+"\nPrice = "+price);
	} 
	
	static int add(int s)
	{
		int size = s;
		return size;
	}
	
	static int remove(int s, int size)
	{
	    size = size - s;
		return s;
	}
}

class Library
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books = ");
		int size = sc.nextInt();
		
		
   outer:do
		{
			Book[] b1 = new Book[size];
			double totalp = 0;
			for(int i=0; i<size; i++)
			{
				sc.nextLine();
				System.out.print("Enter book name = ");
				String title = sc.nextLine();
				
				System.out.print("Enter author name = ");
				String author = sc.nextLine();
				
				System.out.print("Enter publisher name = ");
				String publisher = sc.nextLine();
				
				System.out.print("Enter number of pages = ");
				int pages = sc.nextInt();
				System.out.print("Enter price of book = ");
				float price = sc.nextFloat();
				b1[i] = new Book(title,author,publisher,pages,price);
				totalp = totalp + price;
				
			}
			System.out.println("=======================================================================================");
			
			System.out.println("Entered book deatails are = ");
			for(int i=0; i<size; i++)
			{
				b1[i].printDetails();
			   // System.out.println("Total price = "+totalp);
			}
			System.out.println("Total price = "+totalp);
			
			System.out.println("=======================================================================================");
			
	        System.out.println("1.add book");
			System.out.println("2.remove book");
			System.out.println("If you do not want to add or remove then enter any number ");
			System.out.println("Enter Your choice = ");
			int ch = sc.nextInt();
			
			switch (ch)
			{
				
				case 1:
					System.out.println("How many number of books you want to add = ");
					int c = sc.nextInt();
					int a = Book.add(c);
					size = a;
					break ;
				case 2:
					System.out.println("How many you want to remove = ");
					int d = sc.nextInt();
					int b = Book.remove(d,size);
					size = size - d;
					b1[size].printDetails();
					double price = b1[d].price;
					totalp = totalp - price;
				    break outer;
				    
				default:
					break;
			}
			
		}while(size>0);
		
	}
}




/*
Enter number of books =
2
Enter book name = a
Enter author name = c
Enter publisher name = d
Enter number of pages = 25
Enter price of book = 45
Enter book name = d
Enter author name = g
Enter publisher name = n
Enter number of pages = 25
Enter price of book = 45
=======================================================================================
Entered book deatails are =

Title = a
Author = c
Publisher = d
No of Pages = 25
Price = 45.0

Title = d
Author = g
Publisher = n
No of Pages = 25
Price = 45.0
Total price = 90.0
=======================================================================================
1.add book
2.remove book
If you do not want to add or remove then enter any number
Enter Your choice =
2
How many you want to remove =
1

Title = d
Author = g
Publisher = n
No of Pages = 25
Price = 45.0

C:\CDAC\modul2\assign2>java Library
Enter number of books =
1
Enter book name = q
Enter author name = w
Enter publisher name = r
Enter number of pages = 56
Enter price of book = 45.5
=======================================================================================
Entered book deatails are =

Title = q
Author = w
Publisher = r
No of Pages = 56
Price = 45.5
Total price = 45.5
=======================================================================================
1.add book
2.remove book
If you do not want to add or remove then enter any number
Enter Your choice =
1
How many number of books you want to add =
1
Enter book name = f
Enter author name = h
Enter publisher name = k
Enter number of pages = 54
Enter price of book = 72.25
=======================================================================================
Entered book deatails are =

Title = f
Author = h
Publisher = k
No of Pages = 54
Price = 72.25
Total price = 72.25
=======================================================================================


*/























































