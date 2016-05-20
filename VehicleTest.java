class Vehicle{
   private String vehicleIdNumber ;
   private String vehicleChassisNumber ;
   private String model ;
  public Vehicle(String vin, String vcn, String model){
       vehicleIdNumber = vin;
       vehicleChassisNumber = vcn;
       this.model = model;
   }
    public String toString( ){
       return "Vehicle ID = " + vehicleIdNumber + 
       "\nVehicle  Chassis Number = " + 
            vehicleChassisNumber + "\nVehicle Model = " + model;
     }
     
     public boolean equals(Vehicle vehicle){
         return this.vehicleChassisNumber == 
                                    vehicle.vehicleChassisNumber;
     } 
}
class Bus extends Vehicle{
   private int numberOfPassengers ;
   public Bus(int numPassengers, String vin, String vcn, String model){
              super(vin, vcn, model) ;
              numberOfPassengers = numPassengers ;
    }
  
      public int getNumberOfPassengers( ){
            return numberOfPassengers ;
    }
}
class Truck extends Vehicle{
   private double cargoWeightLimit ;
   public Truck(double weightLimit, String vin, String vcn, String model){
        super(vin, vcn, model) ;
        cargoWeightLimit = weightLimit ;
    }
  
     public double getCargoWeightLimit( ){
         return cargoWeightLimit ;
    }
}
public class VehicleTest{
  public static void main(String[] args){
      Vehicle vehicle = new 
          Vehicle ("QMY 489", "MX-0054322-KJ", "BMW 500");
      Bus bus1 = new  Bus(30, "TMK 321", "AF-987654-WR",
                                 "MERCEDEZ BENZ");
      Bus bus2 = new Bus(30, "2348976", "AF-987654-WR", 
                                 "MERCEDEZ BENZ");
      Truck truck = new 
         Truck(10.0, "DBS 750", "RZ-70002345-PN", "ISUZU");
    
     System.out.println(vehicle) ;
     System.out.println(bus1) ;
     System.out.println(truck) ;
      if(bus1.equals(bus2))
          System.out.println("Bus1 and Bus2 are the same") ;
       else
         System.out.println("Bus1 and Bus2 are not the same") ; 
   }
}
