package test04;

//練習問題 4 - 3
//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい
public class Test04_03 {
	public static void main(String[] args) {
		int num = 2;
		for(int i=1;i<9;i++) {
			System.out.println(String.format("%dの%d乗は、「%d」",num,i,(int)Math.pow(num, i)));
		}
	}
}
