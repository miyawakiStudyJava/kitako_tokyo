package test04;

import java.util.Random;

//練習問題 4 - 9
//整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
public class Test04_09 {
	public static void main(String[] args) {
		Random rnd = new Random();

		//ランダム
		int[] numAry2 = rnd.ints(1, 100).limit(10).toArray();
		int maxNum = 0;
		int minNum = 9099;
		for (int num : numAry2) {
			System.out.println(num);
			maxNum = Math.max(maxNum, num);
			minNum = Math.min(minNum,num);
		}
		System.out.println();
		System.out.println("最大値："+maxNum);
		System.out.println("最小値："+minNum);
	}
}
