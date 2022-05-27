package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 3 - 3
//int 型の変数 x、y にそれぞれ数値を入力し、
//x が ｙ より大きい場合には“xはyより大きい”、
//x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
public class Test03_03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("１つ目の数字を入力してください。");
		int x = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		System.out.println("２つ目の数字を入力してください。");
		int y = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		if(x>y) {
			System.out.println("xはyより大きい");
		}else {
			System.out.println("xはyより小さい");
		}
	}
}
