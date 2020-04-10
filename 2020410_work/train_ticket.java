package com.lh;
/**
 * 
 * @author lihuan
 * @date   2020年4月10日
 */
public class train_ticket {

	public static void main(String[] args) {
		String passengername = "李 *"; //姓名
		String id = "1234567891011121";//身份证号
		String flight = "Z857U857";//车次
		String date = "2020年4月10日 8：08";//出发时间
		String from = "苏州";//出发的
		String to = "上海";//目的地
		int bdt = 24;//检票口
		String seatNumber = "6车18号";//座位号
		
		System.out.println("姓名："+passengername);
		System.out.println("身份证号："+id);
		System.out.println("车次："+flight);
		System.out.println("出发时间："+date);
		System.out.println("出发地："+from);
		System.out.println("目的地："+to);
		System.out.println("检票口："+bdt);
		System.out.println("座位号："+seatNumber);
	}

}
