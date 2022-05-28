package test05;

import java.util.Random;

//練習問題 5 - 4
//数値を繰り返して入力し、合計が 100 を超えた場合、
//または入力が 10 回行われた場合、
//入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
public class Test05_04 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] ary = rnd.ints(1, 100).limit(10).toArray();
		int total=0;
		int count=0;
		for(int n:ary) {
			total+=n;
			count++;
			if(total>100) {
				break;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(ary[i]+",");
		}
	}
}
