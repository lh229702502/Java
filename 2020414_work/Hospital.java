package com.lh.demo;

public class Hospital {

	public static void main(String[] args) {
		hospitalRegistered();
	}

	private static void hospitalRegistered() {
		int number =4;//挂号次数
		if(number==1){
			System.out.println("挂号成功");
		}else if (number==2) {
			System.out.println("挂号成功");
		}else if (number==3) {
			System.out.println("挂号成功");
		}else{
			System.out.println("本人已经是黑名单不能再挂号");
		}
	}
}
