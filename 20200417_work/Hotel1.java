package com.lh.demo;
/**
 * 酒店对应价格
 * @author lihuan
 * @date   2020年4月19日
 */
public class Hotel1 {

	public static void main(String[] args) {
		hotels();
	}
	public static void hotels() {
		String[] names ={"格林豪泰苏州火车站南广场拙政园商务酒店",
				"格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		for (String n: names) {
			String name1 ="格林豪泰苏州火车站南广场拙政园商务酒店";
			String room = "标间";//可选大床房，标间，豪华双床房
			String member1 ="会员";
			if (n.equals(name1)) {
			}else if (room.equals("大床房")) {
				if (member1.equals("会员")) {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:161");
					break;
				}else {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:189");
				}	
			}else if (room.equals("标间")) {
				if (member1.equals("会员")) {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:149");
					break;
				}else {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:169");
				}	
			}else if (room.equals("豪华双床房")) {
				if (member1.equals("会员")) {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:190");
					break;
				}else {
					System.out.println(name1+"地址：江苏省苏州市姑苏区人民路2156号"+room+"价格:290");
				}	
			}
			String name2 ="格雅苏州工业园区金鸡湖东方之门酒店";
			String room2 = "豪华双床房";
			String member2 ="会员";
			if (n.equals(name2)) {
			}else if (room2.equals("豪华双床房")) {
				if (member2.equals("非会员")) {
					System.out.println(name2+"地址：江苏省苏州工业园区星海街169号"+room2+"价格:339");
					break;
				}else {
					System.out.println(name2+"地址：江苏省苏州工业园区星海街169号"+room2+"价格:399");
				}
			}
			String name3 ="格林豪泰苏州漕湖工业园智选酒店";
			String room3 = "高级大床房";
			String member3 ="会员";
			if (n.equals(name3)) {
			}else if (room3.equals("高级大床房")) {
				if (member3.equals("会员")) {
					System.out.println(name3+"地址：江苏省苏州市相城区黄畦路3号"+room3+"价格:161");
					break;
				}else {
					System.out.println(name3+"地址：江苏省苏州市相城区黄畦路3号"+room3+"价格:189");
				}
			}
		}
	}
}
