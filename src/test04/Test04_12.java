package test04;

import java.util.Random;

//練習問題 4 - 12
//数値を繰り返し入力し、合計が 100 を超えたら
//入力を止めて合計を表示するプログラムを作成しなさい。
public class Test04_12 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int total = 0;
		int count = 0;
		while(total<=100) {
			total+=rnd.nextInt(10);
			count++;
			System.out.println(String.format("%02d周目：合計 %03d",count,total));
		}
	}
}
