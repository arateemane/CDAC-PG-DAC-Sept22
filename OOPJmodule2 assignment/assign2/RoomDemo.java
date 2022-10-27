/*4. Create a class Room which will hold the height, width and breadth of the room in three fields. This class
also has a method volume() to calculate the volume of this room. Create another class RoomDemo which will
use the earlier class, create instances of rooms, and display the volume of room.*/


import java.util.Scanner;
class Room
{
	double v, h, w, b;                       	// volume, height, width, breadth
	
	double volume(double h, double w, double b)
	{
		v = h * w * b;
		return v;
	}
}

class RoomDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height = ");
		double h = sc.nextDouble();
		System.out.println("Enter width = ");
		double w = sc.nextDouble();
		System.out.println("Enter breadth = ");
		double b = sc.nextDouble();
		Room r = new Room();
		double x = r.volume(h,w,b);
		System.out.println("Volume of Room = "+x);
	}
}

/*
Enter height =
42
Enter width =
51
Enter breadth =
36
Volume of Room = 77112.0
*/