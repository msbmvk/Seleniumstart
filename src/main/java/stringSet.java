import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class stringSet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String a = "MSB,SURE,NDRA";
		String b = a.substring(0, 3);
		String c = a.substring(3);
		System.out.println("first string :"+b+"  2nd string  :"+c);
		String[] sarry = a.split(",");
		for(int i=0; sarry.length>i; i++) {
			
			if(sarry[i].equalsIgnoreCase("SURE")) {
				sarry[i] ="SURENDRA BABU";
			}
			String print = sarry[i];
			System.out.println(print);
			
		}
		
		LocalDate now = LocalDate.now();
		LocalDate dob = now.minusYears(56);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = dob.format(formatter);
		String RED = "\u001B[31m";String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
		System.out.println("\\u001B[31m*********\\u001B[0m");
		
		   String dateRange = "01JAN2024-10JAN2024";  // Example input range	        
	        // Get a unique date from the range
	        String uniqueDate = getNextUniqueDate(dateRange);
	        System.out.println("Next unique date: " + uniqueDate);
	        
	        String uniqueDate2 = getNextUniqueDate(dateRange);
	        System.out.println("Next unique date 2: " + uniqueDate2);
	        String uniqueDate3 = getNextUniqueDate(dateRange);
	        System.out.println("Next unique date 3: " + uniqueDate3);

	}
	
	public static String getNextUniqueDate(String dateRange) throws Exception {
        // Split the date range into start and end date
        String[] dateParts = dateRange.split("-");
        String startDateStr = dateParts[0];  // Format: DDMMMYYYY
        String endDateStr = dateParts[1];    // Format: DDMMMYYYY

        // Define date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);

        // Parse start and end dates
        Date startDate = dateFormat.parse(startDateStr);
        Date endDate = dateFormat.parse(endDateStr);

        // Get all dates between the start and end dates
        Set<String> availableDates = getDatesBetween(startDate, endDate, dateFormat);

        // Return a unique date and remove it from the available set
        if (!availableDates.isEmpty()) {
            String uniqueDate = availableDates.iterator().next();
            availableDates.remove(uniqueDate);
            return uniqueDate;
        } else {
            return "No more unique dates available";
        }
    }

    // Helper method to get all dates in the range as strings
    private static Set<String> getDatesBetween(Date startDate, Date endDate, SimpleDateFormat dateFormat) {
        Set<String> dateSet = new LinkedHashSet<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (!calendar.getTime().after(endDate)) {
            dateSet.add(dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 1);
        }
        return dateSet;
    }

    

}
