

package carRental;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;


public class Rental {
	private String cars;
	private String cities;
	private int rate;
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	
	
	public void cityName(String[] city, String initialCity, String dest) {
		for (String arr : city) {
			if (initialCity.equals(arr)) {
				System.out.println("The pickup location is:-> " + initialCity);
				// String[] arr1 = {initialCity};
				if (initialCity.equals(dest)) {
					System.out.println("Destination can not be same as pickup location. ");
				} else {
					System.out.println("The destination is:-> " + dest);
					System.out.println("Please select the car type: choose options 1,2,3,or 4" + "\n" + 
					"Select " + "\n" + "1 for toyota" + "\n" + "2 for honda." + "\n" + 
							"3 for bmw." + "\n" + "4 for ford.");
					
					Scanner scanner = new Scanner(System.in);
					int choice = scanner.nextInt();
					if (choice == 1) {
						System.out.println("Congratulations you have selected Toyota.");
					}
					else if (choice == 2) {
						System.out.println("Congratulations you have selected Honda.");
					}
					else if (choice == 3) {
						System.out.println("Congratulations you have selected BMW.");
					}
					else if (choice == 4) {
						System.out.println("Congratulations you have selected Ford.");
					}
					else {
						System.out.println("Incorrect choice: ");
					}
					
					System.out.println("Select pickup date for your for your rental: ");
					 System.out.println("dd-mm-yyyy");
					 Scanner scan = new Scanner(System.in);
					 String date = scan.nextLine();
					 System.out.println("You have selected pickup: " + date);
				      Date date1;
					try {
						date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
						System.out.println(date1);
					      System.out.println("The pickup date you have selected is: " + date1);
						 
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						System.out.println("wronng entry: ");
						e.printStackTrace();
					}  
					 System.out.println("Please enter dropoff date: ");
					String Date = scan.nextLine();
					System.out.println("You have selected dropoff date: " + Date);
				      Date date2;
					try {
						date2 = new SimpleDateFormat("dd-MM-yyyy").parse(Date);
						System.out.println(date2);
					      System.out.println("The dropoff date you have selected is: " + date2);
						 
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						System.out.println("wronng entry: ");
						e.printStackTrace();
					} 
					
					System.out.println("Total how many days? ");
					Scanner s = new Scanner(System.in);
					int days = s.nextInt();
					System.out.println("You have selected to book the car for " + days + " days?");
					
//					String[] carsList = { "Toyota", "Honda", "BMW", "Ford" };
//					int kmRate[] = {12, 15, 11, 17};
					
					int carRate = 0;
					if (choice == 1) {
						carRate = 12;
					}
					else if (choice == 2) {
						carRate = 15;
					}
					else if (choice == 3) {
						carRate = 11;
					}
					else if (choice == 4) {
						carRate = 17;
					}
					int cost = 250 * days *carRate;
					System.out.println("The cost without tax is: " + cost);
					System.out.println("The final cost with 5% tax is: "  + (cost + (0.05 * cost) ));
		
					
					}
			}
		}
	}
	
}
