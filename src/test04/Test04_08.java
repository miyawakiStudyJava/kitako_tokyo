package test04;

import java.util.Random;

//練習問題 4 - 8
//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
public class Test04_08 {
	public static void main(String[] args) {
		Random rnd = new Random();

		//ランダム
		int[] numAry2 = rnd.ints(1, 100).limit(10).toArray();
		int maxNum = 0;
		for (int num : numAry2) {
			System.out.println(num);
			maxNum = Math.max(maxNum, num);
		}
		System.out.println();
		System.out.println("最大値："+maxNum);
	}
}
