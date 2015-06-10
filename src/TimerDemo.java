
import java.io.IOException;
import java.util.*;
import java.util.logging.*;



public class TimerDemo {
   public static void main(String[] args) {
	   //Creating the log file, will be dynamic soon
	   Logger logger = Logger.getLogger("MyLog");  
	    FileHandler fh;  

	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("F:/Java/Scheduler/Logs/MyLogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        logger.info("My first log");  

	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }
	    
   // creating timer task, timer
	   
   TimerTask tasknew = new TimerScheduleFixedRate();
   Timer timer = new Timer();
      
   // scheduling the task at fixed rate
   timer.scheduleAtFixedRate(tasknew,new Date(),1000);      
   }
   // this method performs the task
   /*public void run() {
   System.out.println("working at fixed rate");      
   }    */
}


