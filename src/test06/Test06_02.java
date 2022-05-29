package test06;

import java.util.Random;

//練習問題 6 - 2
//２つの整数の平均を計算するメソッドを作成しなさい。
//２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//
//また、メソッドの動作を検証できるようにプログラムを作成しなさい。
//
//※ 	平均の計算は整数で行い、小数点以下は切り捨ててよい。
public class Test06_02 {
	public static void main(String[] args) {
		int x = rndMake();
		int y = rndMake();
		System.out.printf("x=%d,y=%d,ave=%d",x,y,average(x,y));
	}
	public static int average(int num1,int num2) {
		return (num1+num2)/2;
	}
	public static int rndMake() {
		Random rnd = new Random();
		return rnd.nextInt(1000)+1;
	}
}
