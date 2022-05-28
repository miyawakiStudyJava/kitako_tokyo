package test04;

import java.util.Random;

//練習問題 4 - 19
//数値を繰り返して入力し、0 が入力されたら入力を止め、
//平均値を表示するプログラムを作成しなさい。
//
//※ 	最後に入力された 0 は平均に含めない。
//※ 	少なくとも 1 回は入力が行われるものとする。
//（最初に 0 を入力してはいけない）
public class Test04_19 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intAry = rnd.ints(100, 0, 20).distinct().toArray();
		int total = 0;
		int count = 0;
		for (int n : intAry) {
			if (n != 0) {
				System.out.print(n+",");
				total += n;
				count++;
			} else {
				break;
			}
		}
		System.out.println();
		try {
			System.out.println("average:" + total / count);
		}catch(ArithmeticException e) {
			System.out.println("入力無し");
		}
	}
}
