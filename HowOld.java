package com.dy.cy.test3;
import java.util.*;
import java.text.*;
public class HowOld {
	public static void mian(String[] args) throws Exception{
		System.out.print("�������������(yyyy-mm-dd): ");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
		Date currentDate = new Date();
		long life = currentDate.getTime()-birthDate.getTime();
		System.out.println("����������Ϊ:"+(life/(365*24*60*60*1000L)));
	}
}
