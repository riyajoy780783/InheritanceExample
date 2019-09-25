package booking;

public class Booking {

	int persons;
	int totalDays;
	double tariff;
	String roomType;
	double totalTariff;
	int peakCharge;
	int discount;
	int month;
	
	public int getPeakCharge() {
		return peakCharge;
	}
	public void setPeakCharge(int peakCharge) {
		this.peakCharge = peakCharge;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	
	
	public String getRoomtype() {
		return roomType;
	}
	public void setRoomtype(String roomtype) {
		this.roomType = roomtype;
	}
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	
	public double roomBooking(int persons,int totalDays,double tariff,String roomType) {
		totalTariff = persons * totalDays * tariff;
		
		return totalTariff;
		
	}
}
