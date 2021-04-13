package test;

public class Exam_01 {
	public static void main (String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("================="); // 変数名を指定、数字を入力、出力
		
		int year = 2019;
		int age = 27;
		
		System.out.println(year);
		System.out.println(age);
		
		year = year + 1;
		age = age + 1;
		
		System.out.println("=================");
		System.out.println(year);
		System.out.println(age);
		
		System.out.println("================="); //　変数の数字をTmp変数を使って入れ代わります。
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
		
	}
}
