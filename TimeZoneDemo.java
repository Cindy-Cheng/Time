package com.dy.cy.test3;
import static java.lang.System.out;
import java.util.TimeZone;
public class TimeZoneDemo {
	public static void main(String[] args){
		TimeZone timeZone = TimeZone.getDefault();
		out.println(timeZone.getDisplayName());
		out.println("ʱ��:"+timeZone.getID());
		out.println("�չ��Լʱ��:"+timeZone.getDSTSavings());
		out.println("ƫ�ƺ�����:"+timeZone.getRawOffset());
	}
}
