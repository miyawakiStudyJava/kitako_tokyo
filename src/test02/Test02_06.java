package test02;
//練習問題 2 - 6
//年齢を訊ね、生まれてから現在までの、おおよその日数を表示するプログラムを作成しなさい。
//※ 	日数の計算は閏年等を考慮せず、年齢×365とする。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02_06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("年齢を入力してください。");
		int age = Integer.parseInt(br.readLine()); // 1行分の文字列を入力する
		System.out.println("生まれてから"+age*365+"日経過しました。");
	}
}
