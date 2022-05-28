package test04;

import java.util.Random;

//練習問題 4 - 11
//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
//
//例：
//14
//01234567890123
public class Test04_11 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int count = rnd.nextInt(100);
		for(int i = 0;i<count;i++) {
			System.out.print(i%10+",");
		}
	}
}
