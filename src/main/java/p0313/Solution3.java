package p0313;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution3 {

    //2016년
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();
        //System.out.println(day); //"TUESDAY"

        return day.toString().substring(0, 3);
    }
}//class end
