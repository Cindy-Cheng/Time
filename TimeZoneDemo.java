package com.dy.cy.test3;
import static java.lang.System.out;
import java.util.TimeZone;
public class TimeZoneDemo {
	public static void main(String[] args){
		TimeZone timeZone = TimeZone.getDefault();
		out.println(timeZone.getDisplayName());
		out.println("时区:"+timeZone.getID());
		out.println("日光节约时数:"+timeZone.getDSTSavings());
		out.println("偏移毫秒数:"+timeZone.getRawOffset());
	}
}
