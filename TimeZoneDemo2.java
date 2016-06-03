package com.dy.cy.test3;
import java.util.*;

import static java.lang.System.out;
public class TimeZoneDemo2 {
	public static void main(String[] args){
		TimeZone taipeiTe = TimeZone.getTimeZone("Asia/Taipei");
		TimeZone taipeiTz = null;
		Calendar calendar = Calendar.getInstance(taipeiTz);
		showTime(calendar);
		TimeZone copenhagenTz = TimeZone.getTimeZone("Europe/Copenhagen");
		calendar .setTimeZone(copenhagenTz);
		showTime(calendar);
	}
	static void showTime(Calendar  calendar){
		out.print(calendar.getTimeZone().getDisplayName());;
		out.printf(
				calendar.getDisplayName(Calendar.HOUR, 0, null),
				calendar.getDisplayName(Calendar.MINUTE, 0, null));
	}
}
