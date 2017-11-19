package demo04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
	public static void main(String[] args) throws ParseException {
		System.out.println("ÇëÊäÈëÒ»¸öÈÕÆÚ(2010/2/5):");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		try{
			System.out.println(getDate(s));
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	public static Date getDate(String date)throws ParseException{
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		try{
			return new Date(format.parse(date).getTime());
		}catch(ParseException e){
			e.printStackTrace();
			throw e;
		}
	}

}
