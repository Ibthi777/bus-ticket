package BusReser;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
public class Booking {
String passengerName;
int BusNo;
Date date;
Booking(){
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter name of passenger: ");
	passengerName=scanner.next();
	System.out.println("Enter bus no: ");
	BusNo=scanner.nextInt();
	System.out.println("Ente date dd-mm-yyyy");
	String dateInput=scanner.next();
	SimpleDateFormat dateformat= new SimpleDateFormat("dd-MM-yyyy");
	try {
		date= dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	public boolean isAvaialable(ArrayList<Bus>Buses,ArrayList<Booking>Bookings) {
		int capacity=0;
		for(Bus bus:Buses) {
			if(bus.getBusNo()==busNo)
				capacity=bus.getCapacity();
		}
		int booked=0;
		for(Booking b:Bookings) {
			if(b.BusNo==BusNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
}
