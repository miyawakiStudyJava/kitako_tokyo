package test04;

import java.util.Random;

//練習問題 4 - 13
//ストライク・カウントを数えるプログラムを作成しなさい。
//
//１球ごとにストライクかボールかを入力する。
//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
//※ 	ストライクの場合は1、ボールの場合は2を入力する。
public class Test04_13 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ballCount = 0;
		int strikeCount = 0;
		int toukyu=0;
		while (strikeCount < 3 && ballCount < 4) {
			toukyu=rnd.nextInt(2)+1;
			switch(toukyu) {
			case 1:
				strikeCount++;
				break;
			case 2:
				ballCount++;
				break;
			}
		}
		System.out.println(String.format("ストライク：%d球、ボール：%d球", strikeCount,ballCount));
	}
}
