package chapter15_02;

import java.util.Calendar;
import java.text.SimpleDateFormat;

class SetDate {

	public static void main(String[] args) {

        Calendar year = Calendar.getInstance();
        
        year.add(Calendar.YEAR, 1);

        SimpleDateFormat dateFormat = new SimpleDateFormat("西暦yyyy年 MM月 dd日");
        
        String nextYearFormat = dateFormat.format(year.getTime());

        System.out.println(nextYearFormat);

	}

}