import java.time.LocalDate;
import java.time.LocalTime;

public class workingwithdateandtime{

	public static void main (String[] args){
	
		LocalDate currentdate = LocalDate.now();
		LocalDate mydate = LocalDate.of(2014,5,17);
		LocalDate resumptiondate = LocalDate.parse("2026-06-17");
	
		if(mydate.equals(currentdate)){
			
			System.out.println("Today is your appointment date");
		}
		else{
			System.out.println("your appointment has not reached");	
		} 	
		
		System.out.println("Working with dates");
		System.out.printf("Today's date is %s%n", currentdate);
		System.out.printf("The wedding date is %s%n", mydate);
		System.out.printf("The resumption date is %s%n", resumptiondate);
		System.out.printf("The year is %s%n", currentdate.getYear());
		System.out.printf("The month is %s%n", currentdate.getMonth());
		System.out.printf("Today is %sth%n", currentdate.getDayOfMonth());
		System.out.printf("My exams will be on the %s%n", currentdate.plusDays(7));
		System.out.printf("My exams will be on the %s%n", currentdate.plusYears(2));
	}


}