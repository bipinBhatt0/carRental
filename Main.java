/*When customer select the cab type. Then we need to display the per km rate for the cab. 
( Km wise rate for each type cab we need to store somewhere).
 Assuming when any customer book cab means minimum 250 km charge needs to pay.
  Add 5% tax on top of that and calculate the final price of billing.

example
Cars [Baleno, jeep, Alto, innova]
     Kmrate  [12, 15, 11, 17]
     */

package carRental;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] city = { "Denver", "Dallas", "San Fransisco", "Hartford", "Boston" };
		String[] carsList = { "Toyota", "Honda", "BMW", "Ford" };
		int kmRate[] = {12, 15, 11, 17};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your pickup location (city name): ");
		String pickup = sc.nextLine();
		System.out.println("Enter your dropoff location (city name): ");
		String destination = sc.nextLine();

		Rental obj = new Rental();

		System.out.println("\t" + "\t" + "Welcome to car rental services!!!");
		obj.cityName(city, pickup, destination);
		
		
	}

}
