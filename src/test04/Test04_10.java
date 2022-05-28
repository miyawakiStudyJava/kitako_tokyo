package test04;

import java.util.Random;

//練習問題 4 - 10
//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
public class Test04_10 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int count = rnd.nextInt(10) + 1;
		System.out.println("count:" + count);
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
	}
}
