package test04;

//練習問題 4 - 4
//7 の階乗を計算し、表示するプログラムを作成しなさい。
public class Test04_04 {
	public static void main(String[] args) {
		int num = 7;
		int result = 1;
		for (int i = num; i > 0; i--) {
//			System.out.println(i);
			result *= i;
		}
		System.out.println(result);
	}
}
