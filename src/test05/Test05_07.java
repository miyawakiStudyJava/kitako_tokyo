package test05;

import java.util.Random;

//練習問題 5 - 7
//1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、
//その積を表示するプログラムを作成しなさい。
//ただし、九九の計算結果が入った配列を
//予め作成して利用すること。（前問を参考に）
public class Test05_07 {
	public static void main(String[] args) {
		SolutionTest0507 st = new SolutionTest0507();
		int x = st.makeNumber();
		int y = st.makeNumber();
		int[][] intAry = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				intAry[i][j] = (i + 1) * (j + 1);
			}
		}
		System.out.printf("x=%02d,y=%02d\n",x,y);
		System.out.println(intAry[x-1][y-1]);
	}
}

class SolutionTest0507 {
	int makeNumber() {
		Random rnd = new Random();
		int n = rnd.nextInt(9) + 1;
		return n;
	}
}