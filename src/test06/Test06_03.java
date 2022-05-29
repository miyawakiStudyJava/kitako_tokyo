package test06;

import java.util.Random;

//練習問題 6 - 3
//２つの整数の大きい方を選ぶメソッドを作成しなさい。
//２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
//
//また、このメソッドを使用して、int 型の変数 x、y、z に
//それぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。
public class Test06_03 {
	public static void main(String[] args) {
		int x = rndMake();
		int y = rndMake();
		System.out.printf("x=%d,y=%d,max=%d",x,y,maxNumber(x,y));
	}
	public static int maxNumber(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static int rndMake() {
		Random rnd = new Random();
		return rnd.nextInt(1000)+1;
	}
}
