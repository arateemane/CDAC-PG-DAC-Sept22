/*4. Create a base class Automobile. An Automobile contains data members ‘make’, ‘type’, ‘maxSpeed’,
‘price’, ‘mileage’, ‘registrationNumber’ etc. with their reader/writer methods. Now create two sub-classes
Truck and Car. Truck has data members ‘capacity’, ‘hoodType’, ‘noOfWheels’ etc. Car has data
members ‘noOfDoors’, ‘seatingCapacity’ and their reader/writer methods. Create a main() function to
demonstrate this.*/



class Automobile
{
	String make;
	String type;
	double maxSpeed;
	double price;
	double mileage;
	int regNo;
	
	void writer(String make,String type,double maxSpeed,double price,double mileage,int regNo)
	{
		this.make = make;
        this.type = type;
	    this.maxSpeed = maxSpeed;
	    this.price = price;
	    this.mileage = mileage;
	    this.regNo = regNo;
	}
	
	void reader()
	{
		System.out.println("Make = "+make+"\nType = "+type+"\nMaximum Speed = "+maxSpeed+"\nPrice = "+price+"\nMileage = "+mileage+"\nRegNo = "+regNo);
	}
}

class Truck extends Automobile
{
	double capacity;
	String hoodType;
	int noOfWheels;
	
	void setD(double capacity,String hoodType,int noOfWheels)
	{
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	}
	
	void print()
	{
		System.out.println("Capacity = "+capacity+"\nhoodType = "+hoodType+"\nNo Of Wheeles = "+noOfWheels);
	}
}

class Car extends Automobile
{
	double noOfDoors;
	double seatingCapacity;
	
	void setData(double noOfDoors,double seatingCapacity)
	{
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}
	
	void printData()
	{
		System.out.println("No. of Doors = "+noOfDoors+"\nSeating capacity = "+seatingCapacity);
	}
}


class AutomobileCarTruck
{
	public static void main(String[] args)
	{
		Truck b1 = new Truck();
		b1.writer("TATA","Custom",60.0,2000000,65.0,120354);
		b1.setD(3,"Aluminium",8);
		b1.reader();
		b1.print();
		System.out.println("=========================================================================================");
		Car b2 = new Car();
		b2.writer("Nissan","Mercedes",80.0,3000000,75.0,156854);
		b2.setData(4.0,7.0);
		b2.reader();
		b2.printData();
	    System.out.println("=========================================================================================");

	}
}



/*
Make = TATA
Type = Custom
Maximum Speed = 60.0
Price = 2000000.0
Mileage = 65.0
RegNo = 120354
Capacity = 3.0
hoodType = Aluminium
No Of Wheeles = 8
=========================================================================================
Make = Nissan
Type = Mercedes
Maximum Speed = 80.0
Price = 3000000.0
Mileage = 75.0
RegNo = 156854
No. of Doors = 4.0
Seating capacity = 7.0
=========================================================================================
*/