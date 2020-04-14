package com.lh.demo;

public class Hospital2 {

	public static void main(String[] args) {
		int number = 2;
		hospitalRegistered(number);
	}
	private static void hospitalRegistered(int number) {
		String prompt = "本人已经是黑名单不能再挂号";
		switch(number){
		case 1:
		case 2:
		case 3:
			prompt = "挂号成功";
			System.out.println(prompt);
			break;
		default:
			System.out.println("本人已经是黑名单不能再挂号");
		}
	}
}
