package test06;

import java.util.Random;

//練習問題 6 - 4
//サイズを示す数値（int）を引数とし、
//何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
//
//また、このメソッドを使用してサイズ 3、4、5 の
//３つの三角形を表示するプログラムを作成しなさい。
//
//例：
//$		$		$
//$$	$$		$$
//$$$	$$$		$$$
//		$$$$	$$$$
//				$$$$$
public class Test06_04 {
	public static void main(String[] args) {
		int x = rndMake();
		System.out.printf("%d行の三角形\n",x);
		viewTriangle(x);
	}
	public static void viewTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
	public static int rndMake() {
		Random rnd = new Random();
		return rnd.nextInt(5)+1;
	}
}