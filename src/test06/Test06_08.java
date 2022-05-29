package test06;

//練習問題 6 - 8
//メソッドを再帰的に呼び出すことによって、
//フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
//
//最初の２つの項、0 番目を 0、1 番目を 1 とします。
//
//このメソッドを使用して、11 番目から 20 番目までの項を
//表示するプログラムを作成しなさい。
//
//※ 	フィボナッチ数列：
//　それぞれの項がその直前の２つの項の和になっている数列のこと。
//例：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class Test06_08 {
	public static void main(String[] args) {
		int num0 = 0;
		int num1 = 1;
		int num2 = num0 + num1;
//		System.out.print(num0+","+num1+","+num2+",");
		for(int i=0;i<30;i++) {
			num0=num1;
			num1=num2;
			num2=num0+num1;
			if(i>8 && i<19) {
				System.out.print(num2+",");
			}
		}

	}
}
