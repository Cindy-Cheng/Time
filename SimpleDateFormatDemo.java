package com.dy.cy.test3;
import java.text.*;
import java.util.*;
public class SimpleDateFormatDemo {
	public static void main(String[] args){
		DateFormat dateFormat = new SimpleDateFormat(
				args.length==0?"EE-MM-dd-yyyy":args[0]
				);
		System.out.println(dateFormat.format(new Date()));
	}
}
