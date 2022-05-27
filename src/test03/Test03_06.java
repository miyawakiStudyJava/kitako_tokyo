package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 練習問題 3 - 6
 * 整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
 * “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
 * ※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 	0 は“正の偶数”であるとする。
 */
public class Test03_06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を入力してください。");
		int num = Integer.parseInt(br.readLine());
		if(num > 0) {
			if (num % 2 == 0) {
				System.out.println(num + "は、正の偶数。");
			} else {
				System.out.println(num + "は、正の奇数。");
			}
		}else {
			num*=-1;
			if (num % 2 == 0) {
				System.out.println(num + "は、負の偶数。");
			} else {
				System.out.println(num + "は、負の奇数。");
			}
		}
	}
}
