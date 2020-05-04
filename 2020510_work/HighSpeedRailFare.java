package com.lh.fare;

public class HighSpeedRailFare {

	public static void main(String[] args) {
		String[] address = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
		String address1 = "上海";
		String seat = "一等座";//可选一等座，二等座
		for(String a:address){
			if(address1.equals("南京")){
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为0￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为0￥");
					break;
				}
			}else if (a.equals("镇江")) {
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为44.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为29.5￥");
					break;
				}
			}else if(a.equals("丹阳")){
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为64.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为39.5￥");
					break;
				}
			}else if(a.equals("常州")){
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为99.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为64.5￥");
					break;
				}
			}else if(a.equals("无锡")){
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为129.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为79.5￥");
					break;
				}
			}else if(a.equals("苏州")){
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为159.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为99.5￥");
					break;
				}
			}else{
				if (seat.equals("一等座")) {
					System.out.println("到"+address1+"的"+seat+"票价为219.5￥");
					break;
				} else {
					System.out.println("到"+address1+"的"+seat+"票价为139.5￥");
					break;
				}
			}
		}
	}

}
