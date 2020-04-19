package com.lh.demo;
/**
 * @author lihuan
 * @date   2020年4月19日
 */
public class Hospital2 {
	static String userName = "lihuan";
	static String passWord = "123456";
	static String inPutPassWord ="133456";
	static double time = 11.00;
	public static void main(String[] args) {
		time(inPutPassWord);
		int number = 6;
		hospitalRegistered(number);
	}
	public static void time(String inPutPassWord){
		System.out.println("请输入用户名");
		System.out.println("请输入密码");
		if (inPutPassWord==passWord) {
			System.out.println("登录成功");
		}
		if ((passWord !=inPutPassWord)&time<time+1) {
			System.out.println("登录失败");
			System.out.println("请于1小时后登录");
		}
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
