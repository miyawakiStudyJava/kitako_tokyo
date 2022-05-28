package test05;

import java.util.Random;

//練習問題 5 - 1
//次のプログラムを作成しなさい。
//
//10 個の数値を入力する。
//入力された各々の数値を 2 倍にして表示する。
public class Test05_01 {
	public static void main(String[] args) {
		Number number = new Number();
		int[] ary = number.makeAry(10);
		int[] ary2 = new int[10];
		for (int i = 0; i < 10; i++) {
			ary2[i] = number.doubleNum(ary[i]);
		}
		System.out.println("通常");
		for(int n:ary) {
			System.out.print(n+",");
		}
		System.out.println();
		System.out.println("2倍表示");
		for(int n:ary2) {
			System.out.print(n+",");
		}
	}
}

class Number {
	int[] makeAry(int num) {
		Random rnd = new Random();
		return rnd.ints(1, 100).limit(num).toArray();
	}

	int doubleNum(int num) {
		return num * 2;
	}
}