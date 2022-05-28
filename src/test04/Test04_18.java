package test04;

import java.util.Random;

//練習問題 4 - 18
//数値を繰り返して入力し、0が入力されたら入力を止め、
//それまでの合計を表示するプログラムを作成しなさい。
public class Test04_18 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intAry = rnd.ints(100, 0, 20).distinct().toArray();
		int total = 0;
		for(int n:intAry) {
			System.out.println(n);
			if(n!=0) {
				total+=n;
			}else {
				break;
			}
		}
		System.out.println("total:"+total);
	}
}
