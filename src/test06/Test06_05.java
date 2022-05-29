package test06;

import java.util.Random;

//練習問題 6 - 5
//サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
//
//このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
//
//※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。
//
//import java.util.Random;

public class Test06_05 {
	public static void main(String[] args) {
		int x = rndMake();
		System.out.printf("%d行の三角形\n",x);
		char c = generateString();
		viewTriangle(x,c);
	}
	public static void viewTriangle(int num,char c) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static int rndMake() {
		Random rnd = new Random();
		return rnd.nextInt(5)+1;
	}
    // ランダムな文字列を生成する
    public static char generateString() {
    	StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");                        // 指定した長さの文字列を取得
        Random rand = new Random();
        return sb.charAt(rand.nextInt(sb.length()));
    }
}
