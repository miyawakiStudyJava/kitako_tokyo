package test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//九九表を表示するプログラムを完成させなさい。
public class Test05_06 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int setAryLength = 0;
		try {
			setAryLength = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		int kuku[][] = new int[9][];

		//配列が未定なので設定
		int[] kuku2nd = new int[setAryLength];
		//配列 kuku に値を代入する
		for (int i = 0; i < 9; i++) {
			kuku[i]=kuku2nd;
			for (int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
			kuku2nd = new int[setAryLength];
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.printf(" %2d", kuku[i][j]);
			}
			System.out.println();
		}
	}
}
