package test04;

import java.util.Random;

//練習問題 4 - 6
//整数、0 か 1 を 10 回入力する。
//これを対戦成績と考え、0 を負け、1 を勝ちとして、
//勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
public class Test04_06 {
	public static void main(String[] args) {
		Test04NumClass nc = new Test04NumClass();
		int num = -1;
		int winCount = 0;
		int loseCount = 0;
		for (int i = 0; i < 10; i++) {
			num = nc.numMaker();
			if(num==0) {
				winCount+=1;
			}else {
				loseCount+=1;
			}
		}
		System.out.println(String.format("winCount=%d,loseCount=%d",winCount,loseCount));
	}
}

class Test04NumClass {
	int numMaker() {
		Random rnd = new Random();
		return rnd.nextInt(2);
	}
}
