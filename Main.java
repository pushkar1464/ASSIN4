
class Vehicle{
	String make;
	String model;
	int year;
	String color;
	
	Vehicle() {
		
	}

	Vehicle(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color="unknown";
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ",\n model=" + model + ",\n year=" + year + ",\n color=" + color + "]";
	}

	
}

class Car extends Vehicle{
	int numDoors;
	boolean automatic;
	
	Car() {
		super();
	}

	Car(String make, String model, int year, String color, int numDoors, boolean automatic) {
		super(make, model, year, color);
		this.numDoors = numDoors;
		this.automatic = automatic;
	}
	
	Car(String make, String model, int year){
		super(make, model, year);		
	}

	@Override
	public String toString() {
		return "Car [numDoors=" + numDoors + ",\n automatic=" + automatic + ",\n make=" + make + ",\n model=" + model
				+ ",\n year=" + year + ",\n color=" + color + "]";
	}
	
	
}

class Truck extends Vehicle{
	double payloadCapacity;
	double towingCapacity;
	
	Truck() {
		super();
	}

	public Truck(String make, String model, int year, String color, double payloadCapacity, double towingCapacity) {
		super(make, model, year, color);
		this.payloadCapacity = payloadCapacity;
		this.towingCapacity = towingCapacity;
	}

	public Truck(String make, String model, int year) {
		super(make, model, year);
	}

	@Override
	public String toString() {
		return "Truck [payloadCapacity=" + payloadCapacity + ",\n towingCapacity=" + towingCapacity + ",\n make=" + make
				+ ",\n model=" + model + ",\n year=" + year + ",\n color=" + color + "]";
	}
	
}

public class Main {
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car.toString());
		System.out.println();
		
		Car c1=new Car("TATA", "NANO", 2000,"YELLOW", 4, true);
		System.out.println(c1.toString());
		System.out.println();
		
		Car c2=new Car("TATA", "NEXON", 2010);
		System.out.println(c2.toString());
		System.out.println();
		
		Truck truck=new Truck();
		System.out.println(truck.toString());
		System.out.println();
		
		Truck t1=new Truck("BALERO", "PICKUP", 1998);
		System.out.println(t1.toString());
		System.out.println();
		
		Truck truck2=new Truck("TATA", "PRIMA", 2004, "RED", 10.2, 4.3);
		System.out.println(truck2.toString());
	}
}