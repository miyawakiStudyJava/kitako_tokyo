package test04;

import java.util.Random;

//練習問題 4 - 20
//サイズを示す数値を入力し、
//何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//
//サイズ 4 の例
//$
//$$
//$$$
//$$$$
public class Test04_20 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(5)+1;
		for(int i=1;i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
