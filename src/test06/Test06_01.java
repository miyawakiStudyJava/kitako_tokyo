package test06;

import java.util.Random;

//練習問題 6 - 1
//整数の 2 乗を計算するメソッドを作成しなさい。
//１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//
//また、メソッドの動作を検証できるようにプログラムを作成しなさい。
public class Test06_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int mainNum = rnd.nextInt(1000)+1;
		System.out.printf("数字：%04d、%07d",mainNum,calc(mainNum));
	}
	public static int calc(int num) {
		return (int)Math.pow(num, 2);
	}
}
