package test01;

//練習問題 1 - 11
//int 型の変数 x に任意の数値を代入し、
//x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。
import java.util.Random;

public class Test01_11 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int y = rnd.nextInt(10)+10;
		int x = y + rnd.nextInt(10);
		System.out.println("x="+x+",y="+y);
		System.out.println(String.format("x/y=%d,x%%y=%d", ((int)(x/y)),((int)(x%y))));
	}
}
