package test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 2 - 3
//int 型の変数 x に数値を入力し、
//x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
public class Test02_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください。");
		int num = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		for (int i = 1; i < 4; i++) {
			System.out.println((int)Math.pow(num, i));
		}
	}
}
