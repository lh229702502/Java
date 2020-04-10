package com.lh;
/**
 * 
 * @author lihuan
 * @date   2020年4月10日
 */
public class jipiao {
	public static void main(String[] args) {
		String passengername = "李**"; //姓名
		String id = "12345678987654321";//身份证号
		String flight = "MU857857";//航班号
		String date = "2020年4月10日";//出发时间
		String from = "苏州";//出发的
		String to = "上海";//目的地
		int bdt = 24;//登机口
		int seatNumber = 18;//座位号
		
		System.out.println("姓名："+passengername);
		System.out.println("身份证号："+id);
		System.out.println("航班号："+flight);
		System.out.println("出发时间："+date);
		System.out.println("出发地："+from);
		System.out.println("目的地："+to);
		System.out.println("登机口："+bdt);
		System.out.println("座位号："+seatNumber);
	}

}
