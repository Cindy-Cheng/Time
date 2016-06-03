package com.dy.cy.test3;
import static java.lang.System.out;
import java.util.Calendar;
public class CalenderUtil {
	public static void main(String[] args){
		Calendar birth = Calendar.getInstance();
		birth.set(1975,Calendar.MAY,26);
		Calendar now = Calendar.getInstance();
		out.printf("����:",yearsBetween(birth,now));
		out.printf("����:",yearsBetween(birth,now));
	}
	public static long yearsBetween(Calendar begin,Calendar end){
		Calendar calendar = (Calendar) begin.clone();
		long years = 0;
		while(calendar.before(end)){
			calendar.add(Calendar.YEAR, 1);
			years++;
		}
		return years - 1;
	}
	public static long dayBetween(Calendar begin,Calendar end){
		Calendar calendar = (Calendar) begin.clone();
		long days = 0;
		while(calendar.before(end)){
			calendar.add(Calendar.DATE,1);
			days++;
		}
		return days - 1;
	}
}
