package test05;

import java.util.Random;

//練習問題 5 - 2
//次のプログラムを作成しなさい。
//
//10 個の数値を入力する。
//入力された順番と逆の順番で 10 個の数値を表示する。
public class Test05_02 {
	public static void main(String[] args) {
		Number0502 number = new Number0502();
		int[] ary = number.makeAry(10);
		for(int n:ary) {
			System.out.print(n+",");
		}
		System.out.println();
		for(int i=ary.length-1;i>-1;i--) {
			System.out.print(ary[i]+",");
		}

	}
}
class Number0502 {
	int[] makeAry(int num) {
		Random rnd = new Random();
		return rnd.ints(1, 100).limit(num).toArray();
	}
}