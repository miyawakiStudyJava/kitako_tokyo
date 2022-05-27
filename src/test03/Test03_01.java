package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 3 - 1
//int 型の変数 x、y にそれぞれ数値を入力し、
//x が y より大きい場合に、“xはyより大きい。”
//という文を表示するプログラムを作成しなさい。
public class Test03_01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("１つ目の数字を入力してください。");
		int x = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		System.out.println("２つ目の数字を入力してください。");
		int y = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		if (x > y) {
			System.out.println("１つめの数字は２つ目より大きい。");
		}else {
			System.out.println("ノーコメント");
		}
	}
}
