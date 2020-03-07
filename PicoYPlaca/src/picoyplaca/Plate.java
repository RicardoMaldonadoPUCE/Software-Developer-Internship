
package picoyplaca;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class Plate {
    String PlateNumber;
    int LastNumber;
    //Here we do the operations to get the las caracter of the plate
    public void DetectLastNumber(String platenumber){
        LastNumber = Integer.parseInt(platenumber.substring(platenumber.length()-1));
    }
    public boolean CompareToActualDay(){
       int DayOfTheWeeK;
       Date Now = new Date();
       Calendar calendar = Calendar.getInstance();
       //Here We assigned the number acording to the day
        switch(LastNumber) {
            case 1:
                LastNumber=2;//Monday
              break;
            case 2:
                LastNumber=2;//Monday
              break;
             case 3:
                 LastNumber=3;//Tuesday
              break;
              case 4:
                  LastNumber=3;//Tuesday
              break;
              case 5:
                  LastNumber=4;//Wenesday
              break;
              case 6:
                  LastNumber=4;//Wenesday
              break;
              case 7:
                  LastNumber=5;//Thursday
              break;
              case 8:
                  LastNumber=5;//Thursday
              break;
             case 9:
                  LastNumber=6;//Friday
              break;
              case 0:
                  LastNumber=6;//Friday
              break;
            default:
        } 
        //Gets the day of the week as a number
        calendar.setTime(Now);
        DayOfTheWeeK = calendar.get(Calendar.DAY_OF_WEEK);
        return DayOfTheWeeK != LastNumber;
    }
    public void CompareToActualTime(){
            int From1 = 700;
            int To1 = 930;
            int From2=1600;
            int To2=1930;
            int Time;
            boolean Time1,Time2;//two times because there are two intervals of time where cars cant drive
            Date date = new Date();
            //Gets the actual time 
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Time = calendar.get(Calendar.HOUR_OF_DAY) * 100 + calendar.get(Calendar.MINUTE);
            //Compare the actual time        
            Time1 = To1 > From1 && Time >= From1 && Time <= To1 || To1 < From1 && (Time >= From1 || Time <= To1);
            Time2 = To2 > From2 && Time >= From2 && Time <= To2 || To2 < From1 && (Time >= From2 || Time <= To2);

            if (Time1||Time2) {
                JOptionPane.showMessageDialog(null, "You are not allowed to drive"); 
            } else {
                JOptionPane.showMessageDialog(null, "You are allowed to drive at this moment, but keep an eye on the time");
            }
            
    }
}
