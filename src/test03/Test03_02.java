package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 3 - 2
//２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
public class Test03_02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("１つ目の数字を入力してください。");
		int x = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		System.out.println("２つ目の数字を入力してください。");
		int y = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		System.out.println("大きい数字は"+Math.max(x, y));
	}
}
