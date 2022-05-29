package test05;

import java.util.Arrays;
import java.util.Random;

//練習問題 5 - 8
//整数を 10 回入力し、小さい順に並べ替えて表示する
//プログラムを作成しなさい。
public class Test05_08 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intAry = new int[10];
		for(int i=0;i<intAry.length;i++) {
			intAry[i]=rnd.nextInt(100);
		}
		System.out.print("作成された配列　　：");
		for(int n:intAry) {
			System.out.print(n+",");
		}
		System.out.println();
		Arrays.sort(intAry);
		System.out.print("並び替えられた配列：");
		for(int n:intAry) {
			System.out.print(n+",");
		}
	}
}
