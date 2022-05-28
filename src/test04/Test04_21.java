package test04;
//解けず　05/28


import java.util.Random;

//練習問題 4 - 21
//サイズを示す数値を入力し、
//そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
//
//サイズ 3 の例
//X X
// X
//X X
//サイズ 4 の例
//X  X
// XX
// XX
//X  X
//サイズ 5 の例
//X   X
// X X
//  X
// X X
//X   X
public class Test04_21 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(5)+1;
		for(int i=0;i<num;i++) {
			System.out.println("X");
		}
	}
}
class MakeX{
	void make(int num){
		System.out.println("サイズ"+num+"の例");
	}
}