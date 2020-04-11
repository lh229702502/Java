package com.lh;
/**
 * 
 * @author lihuan
 * @date   2020年4月11日
 */
public class bus {
	public static void main(String[] args) {
		String drivername = "刘 *"; //司机姓名
		String number = "苏EAE860";//车牌号
		double money = 3.5;//票价
		String from = "苏州市火车站";//出发地
		String to = "甪直镇";//目的地
		int station = 24;//途径站点
		double time = 1.5;//全程用时 
		
		System.out.println("姓名："+drivername);
		System.out.println("车牌号："+number);
		System.out.println("票价："+money+"$");
		System.out.println("出发地："+from);
		System.out.println("目的地："+to);
		System.out.println("途径站点："+station);
		System.out.println("全程用时："+time+"h");
	}
}
