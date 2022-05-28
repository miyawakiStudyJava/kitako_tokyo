package test04;

import java.util.Arrays;
import java.util.Random;

//練習問題 4 - 7
//次のプログラムを作成しなさい。
//
//巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//※ 	試合は巨人の先行とする。
//1回表、巨人の得点は？ 0
//1回裏、阪神の得点は？ 0
//2回表、巨人の得点は？ 0
//2回裏、阪神の得点は？ 1
//    ：
//    ：
//    ：
//9回表、巨人の得点は？ 0
//9回裏、阪神の得点は？ 1
//
//巨人：5点, 阪神：6点
//阪神の勝ち
public class Test04_07 {
	public static void main(String[] args) {
		Point0407 pointClass = new Point0407();
		int[] aryKyojin = new int[9];
		int[] aryHanshin = new int[9];

		//点数作成
		for (int i = 0; i < 9; i++) {
			aryKyojin[i] = pointClass.pointMaker();
			aryHanshin[i] = pointClass.pointMaker();
		}
		int sumKyojin = Arrays.stream(aryKyojin).sum();
		int sumHanshin = Arrays.stream(aryHanshin).sum();

		//表示
		for(int i=0;i<9;i++) {
			System.out.println(String.format("%d回表、巨人の得点は？ %d",i,aryKyojin[i]));
			System.out.println(String.format("%d回裏、阪神の得点は？ %d",i,aryHanshin[i]));
		}
		System.out.println();
		System.out.println(String.format("巨人:%02d点、阪神%02d点",sumKyojin,sumHanshin));
		if(sumKyojin>sumHanshin) {
			System.out.println("巨人の勝ち");
		}else {
			System.out.println("阪神の勝ち");
		}
	}
}

class Point0407 {
	Random rnd = new Random();

	int pointMaker() {
		return rnd.nextInt(2);
	}
}