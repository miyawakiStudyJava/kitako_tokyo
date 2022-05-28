package test04;

//練習問題 4 - 2
//九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
public class Test04_02 {
	public static void main(String[] args) {
		int num = 3;
		for (int i = 1; i < 10; i++) {
			System.out.println(String.format("%d*%d=%d", num, i, num * i));
		}
	}
}
