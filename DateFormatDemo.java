package com.dy.cy.test3;
import java.util.*;
import static java.lang.System.out;
import static java.text.DateFormat.*;
public class DateFormatDemo {
	public static void main(String[] args){
		Date date = new Date();
		dateInstanceDemo(date);
		timeInstanceDemo(date);
		timeInstanceDemo(date);
		dateInstanceDemo(date);
	}
	static void dateInstanceDemo(Date date){
		out.println("getDateInstance() demo");
		out.println(getDateInstance(LONG).format(date));
		out.println(getDateInstance(SHORT).format(date));
	}
	static void timeInstanceDemo(Date date){
		out.println("gettimeinstance");
		out.println(getTimeInstance(LONG).format(date));
		out.println(getTimeInstance(MEDIUM).format(date));
		out.println(getTimeInstance(SHORT).format(date));
	}
	static void dateTimeInstanceDemo(Date date){
		out.println("getDateTimeIntance() demo");
		out.printf("getDateTimeIntance(LONG,LONG).format(date)");
		out.printf("getDateTimeIntance(SHORT,MEDIUM).format(date)");
		out.printf("getDateTimeInstance(SHORT,SHORT).format(date)");
	}

}
