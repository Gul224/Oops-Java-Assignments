package constructorflights;

public class AirIndia  {
     public static void main(String[] args) {
        //invoke parameterized constructors

         InternationalFlights flights1 = new InternationalFlights("India", 123);
         System.out.println("Flightname :" + flights1.country + "  and FlightId: " + flights1.id );
    }
}
