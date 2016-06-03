package com.dy.cy.test3;
import java.util.*; 
import static java.lang.System.*;
public class DateDemo {
	public static void mian(String[] args){
		Date date1 = new Date(currentTimeMillis());
		Date date2 = new Date();
		out.println(date1.getDate());
		out.println(date2.getDate());
	}
}
