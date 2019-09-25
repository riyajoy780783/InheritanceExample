package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import booking.Booking;
import leanseason.LeanSeason;
import peakseason.PeakSeason;


public class Main {
	
	public static void main(String[] args) throws IOException {
		int persons;
		int totalDays;
		double tariff;
		String roomType;
		int totalTariff = 0;
		int month;
		int peakCharge;
		int discount;
		Booking book = new Booking();
	    
		System.out.println("Booking");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the number of persons");
		persons = Integer.parseInt(br.readLine());
		book.setPersons(persons);
		System.out.println("Enter the number of days");
		totalDays = Integer.parseInt(br.readLine());
		book.setTotalDays(totalDays);
		System.out.println("Enter the room type");
		roomType = br.readLine();
		book.setRoomtype(roomType);
		System.out.println("Enter the tariff for single person");
		tariff = Integer.parseInt(br.readLine());
		book.setTariff(tariff);
		System.out.println("Enter the month");
		month = Integer.parseInt(br.readLine());
		book.setMonth(month);
		
		if(month==4 ||month==5||month==6||month==9|| month==11|| month==12)
		{
			PeakSeason ps = new PeakSeason();
			System.out.println("Enter the peakCharge");
			peakCharge = Integer.parseInt(br.readLine());
			ps.setPeakCharge(peakCharge);
			
		   double d=ps.roomBooking(persons, totalDays, tariff, roomType,peakCharge);
			System.out.println("Total Tariff : "+ d +"/-");
		}
		
		if(month==1 ||month==2||month==3||month==7|| month==8|| month==9 || month==10)
		{
			LeanSeason ln=new LeanSeason();
			System.out.println("Enter the discount");
			discount = Integer.parseInt(br.readLine());
			ln.setDiscount(discount);
			
			double r=ln.roomBooking(persons, totalDays, tariff, roomType,discount);
			System.out.println("Total Tariff : "+ r +"/-");
		}
		
		//System.out.println("Total Tariff : "+ totalTariff +"/-");
		
		
	}

}
