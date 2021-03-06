//A PROGRAM THAT TELLS THE TIME


import java.sql.Date;

public class Time{
    

    protected Date cDate = new Date(System.currentTimeMillis());
    protected String createdDate = cDate.toString();

    protected long totalMill    = System.currentTimeMillis(); //TIME IN MILLISECONDS
    protected long totalSec     = totalMill / 1000;           //TOTAL SECONDS SINCE 1970
    protected long currentSec   = totalSec % 60;              //CURRENT SECOND
    protected long totalMin     = totalSec / 60;              //TOTAL MINUTES SINCE 1970
    protected long currentMin   = totalMin % 60;              //CURRENT MINUTE
    protected long totalHour    = totalMin / 60;
    protected long dayOrNight = totalHour/24;              //TOTAL HOURS SINCE 1970
    protected long currentHour  = totalHour % 12 + 3;     //CURRENT HOUR
    protected String M = "AM";

    protected String currentTime =  currentHour + ":" + currentMin + ":" + currentSec + " " + M;
   
    {if (dayOrNight >= 12) {
            this.M= "PM";
         }}
         
         
         //CONVERTING GMT TO LOCAL TIMEZONE
                                                    //DISPLAY THE TIME IN HOUR:MINUTE:SECOND FORMAT
    // System.out.println("\n\nThe TIME is " + currentHour + ":" + currentMin + ":" + currentSec + "\n")

        public String getTime(){
                return currentTime;
            }

        public String getDate(){
                return createdDate;
            }

        public String getCreated(){
            return (createdDate + "|" + currentTime);
        }
        

}