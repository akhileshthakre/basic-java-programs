import java.util.*;
import java.text.*;
import java.time.*;
import java.util.concurrent.TimeUnit;



class DateDifference {
	

	public static void main(String[] args) {

			SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");

			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   			LocalDate now = LocalDate.now();  
			String inputString1 = now.toString();
			String inputString2 = "2018-08-10";

			try {
    			Date date1 = myFormat.parse(inputString1);
    			Date date2 = myFormat.parse(inputString2);
    			long diff = date2.getTime() - date1.getTime();
    			//System.out.println ("Days: left for Birthday is:" + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    			long a = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    			if(a<7) {
				System.out.println("Happy Birthday in advance");
				}else {
					System.out.println(a+" Days left for Birthday");
				}
			} catch (ParseException e) {
    			e.printStackTrace();
			}


	}
 
    
}