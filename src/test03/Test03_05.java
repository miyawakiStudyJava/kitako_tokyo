package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 3 - 5
//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//※ 	奇数、偶数の判定には除算の余りを利用する。
public class Test03_05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を入力してください。");
		int num = Integer.parseInt(br.readLine());
		if (num % 2 == 0) {
			System.out.println(num + "は、偶数。");
		} else {
			System.out.println(num + "は、奇数。");

		}
	}
}
