package leanseason;
import booking.Booking;

public class LeanSeason extends Booking {
	int month;
	int discount;
	double totalTariff;
	double total;
	public double roomBooking(int persons,int totalDays,double tariff,String roomType,int discount) {
		
		total=super.roomBooking(persons, totalDays, tariff, roomType);
		
		totalTariff = total*discount/100;
		return total-totalTariff;
		
	}
	

}
