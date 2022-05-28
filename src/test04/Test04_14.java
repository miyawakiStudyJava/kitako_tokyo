package test04;

import java.util.Random;

//練習問題 4 - 14
//前の問題に次の修正を加えなさい。
//
//１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
//ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
public class Test04_14 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ballCount = 0;
		int strikeCount = 0;
		int toukyu = 0;
		int count = 0;
		while (strikeCount < 3 && ballCount < 4) {
			toukyu = rnd.nextInt(3) + 1;
			count++;
			System.out.print(count + "球目の投球：");
			switch (toukyu) {
			case 2:
				System.out.println("ボール");
				ballCount++;
				break;
			case 1:
				System.out.println("ファール");
				if (strikeCount < 2) {
					strikeCount++;
				}
				break;
			case 3:
				System.out.println("ストライク");
				strikeCount++;
				break;
			}
		}
		System.out.println(String.format("ストライク：%d球、ボール：%d球", strikeCount, ballCount));
	}

}
