package peakseason;

import booking.Booking;

public class PeakSeason extends Booking {
	int month;
	int peakCharge;
	double totalTariff;
	double total;
	public double roomBooking(int persons,int totalDays,double tariff,String roomType,int peakCharge) {
		
		total=super.roomBooking(persons, totalDays, tariff, roomType);
		
		totalTariff = total*peakCharge;
		
		return totalTariff;
		
	}

}
