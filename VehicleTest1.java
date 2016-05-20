class Vehicle1{
   public String vehicleIdNumber ;
   public String vehicleChassisNumber ;
   public String model ;
   public Vehicle1(String vehicleIdNumber, String vehicleChassisNumber, String model){
   	this.vehicleChassisNumber=vehicleChassisNumber;
   	this.vehicleIdNumber=vehicleIdNumber;
   	this.model=model;
   }
   public boolean equals(Vehicle1 vehicle){
       return this.vehicleChassisNumber == vehicle.vehicleChassisNumber;
   } 
}
class Bus1 extends Vehicle1{
   public int numberOfPassengers;
   public Bus1(int numberOfPassengers, String model, String vehicleIdNumber, String vehicleChassisNumber){
   	super(vehicleIdNumber,vehicleChassisNumber,model);
   }
}
class Truck1 extends Vehicle1{
   public double cargoWeightLimit;
   public Truck1(double cargoWeightLimit, int numberOfPassengers, String model, String vehicleIdNumber, String vehicleChassisNumber){
   	super(vehicleIdNumber,vehicleChassisNumber,model);
   }
}
public class VehicleTest1{
  public static void main(String[] args){
  Vehicle1 vehicle1= new Vehicle1("2345","536596560ygg","corolla");
  Vehicle1 vehicle2= new Vehicle1("2345","536596560yg","corolla");
  Bus1 bus1=new Bus1(80,"235","5365965bnhnhd","Hiace");
  Bus1 bus2=new Bus1(80,"245","5365965bnhd","Hiace");
  Truck1 truck1= new Truck1(30.90,10,"23498","5365965bnhn45","Hilux");
  Truck1 truck2= new Truck1(30.90,10,"23498","5365965bnhn45","Hilux");
boolean x = vehicle1.equals(vehicle2);
boolean y = bus1.equals(bus2);
boolean z = truck1.equals(truck2);
 System.out.println(x);
 System.out.println(y);
 System.out.println(z);
}
}
