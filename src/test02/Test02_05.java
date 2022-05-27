package test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 2 - 5
//２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
//※ 	計算は整数で行い、小数点以下は切り捨ててよい。
public class Test02_05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を2つ入力してください。");
		String text = br.readLine(); // 1行分の文字列を入力する
		String[] strAry = text.split(" ");
		int[] intAry = new int[2];
		for(int i = 0;i<strAry.length;i++) {
			intAry[i] = Integer.parseInt(strAry[i]);
		}
		System.out.println((intAry[1]+intAry[0])/2);
	}
}
