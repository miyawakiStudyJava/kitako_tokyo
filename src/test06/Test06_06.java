package test06;

import java.util.Scanner;

//練習問題 6 - 6
//九九のひとつの段を表示するメソッドを作成しなさい。
//何の段（ 1 ～ 9 ）であるかを引数とします。
//
//このメソッドを使用して、九九表を作成しなさい。
public class Test06_06 {
	public static void main(String[] args) {
		System.out.println("1～9の数字を一つ入力してください。>>");
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		kuku(inputNum);
	}
	public static void kuku(int num) {
		System.out.printf("%02dの段：",num);
		for(int i=0;i<9;i++) {
			System.out.print(num*(i+1)+",");
		}
	}
}
