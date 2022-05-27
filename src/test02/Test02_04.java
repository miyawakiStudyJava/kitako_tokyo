package test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 2 - 4
//int 型の変数 x、y にそれぞれ数値を入力し、
//x と y の和、差（x－y）、積、商と余り(x÷y)、を表示するプログラムを作成しなさい。
public class Test02_04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を2つ入力してください。");
		String text = br.readLine(); // 1行分の文字列を入力する
		String[] strAry = text.split(" ");
		int[] intAry = new int[2];
		for(int i = 0;i<strAry.length;i++) {
			intAry[i] = Integer.parseInt(strAry[i]);
		}
		System.out.println(intAry[1]+intAry[0]);
		System.out.println(intAry[1]-intAry[0]);
		System.out.println(intAry[1]*intAry[0]);
		System.out.println(intAry[1]/intAry[0]);
		System.out.println(intAry[1]%intAry[0]);

	}
}
