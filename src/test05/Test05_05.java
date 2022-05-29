package test05;
//未回答

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
public class Test05_05 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int value = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		int binary[] = new int[16];

		//配列 binaryに0か1を代入する

		for (int i = 0; i < 16; i++) {
			System.out.print(binary[i]);
		}
	}
}
