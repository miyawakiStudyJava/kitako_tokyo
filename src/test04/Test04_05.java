package test04;

import java.util.Random;

//練習問題 4 - 5
//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//
//※ 	計算は整数で行い、小数点以下は切り捨ててよい。
public class Test04_05 {
	public static void main(String[] args) {
		NumClass nc = new NumClass();
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += nc.numMaker();
		}
		System.out.println(total/10);
	}
}

class NumClass {
	int numMaker() {
		Random rnd = new Random();
		return rnd.nextInt(100);
	}
}