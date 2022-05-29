package test07;

import java.util.Random;
//練習問題 7 - 6
//前問の CoinCase クラスに、次の内容を追加しなさい。
//
//総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
//指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
//修正した CoinCase クラスを使用して次のプログラムを作成しなさい。
//
//CoinCase クラスのインスタンスを作成する。
//種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
//各硬貨が何枚でいくらあるかを表示する。
//硬貨の総枚数を表示する。
//総額を表示する。
public class Test07_06 {
	public static void main(String[] args) {
		CoinCase0706 cc = new CoinCase0706();
		Random rnd = new Random();
		int[] coinAry = {1,5,10,50,100,500};
		int coinType=0;
		int coinCount=0;
		for(int i=0;i<10;i++) {
			coinType = coinAry[rnd.nextInt(coinAry.length)];
			coinCount = rnd.nextInt(10);
			cc.AddCoins(coinType, coinCount);
		}
		System.out.print("コイン別枚数：");
		System.out.println(cc);
		System.out.print("総合計：");
		System.out.println(cc.getAmount());
		System.out.print("コインタイプ：");
		System.out.println(cc.getAmount(coinAry[rnd.nextInt(coinAry.length)]));
		System.out.print("総枚数：");
		System.out.println(cc.getCount());
	}
}

class CoinCase0706 {
	private int coin500;
	private int coin100;
	private int coin50;
	private int coin10;
	private int coin5;
	private int coin1;

	CoinCase0706() {
		this.coin500 = 0;
		this.coin100 = 0;
		this.coin50 = 0;
		this.coin10 = 0;
		this.coin5 = 0;
		this.coin1 = 0;
	}

	void AddCoins(int num, int count) {
		switch (num) {
		case 500:
			this.coin500 += count;
			break;
		case 100:
			this.coin100 += count;
			break;
		case 50:
			this.coin50 += count;
			break;
		case 10:
			this.coin10 += count;
			break;
		case 5:
			this.coin5 += count;
			break;
		case 1:
			this.coin1 += count;
			break;
		}
	}

	int getCount(int num) {
		switch (num) {
		case 500:
			return this.coin500;
		case 100:
			return this.coin100;
		case 50:
			return this.coin50;
		case 10:
			return this.coin10;
		case 5:
			return this.coin5;
		case 1:
			return this.coin1;
		}
		return -1;
	}

	int getAmount(int num) {
		switch (num) {
		case 500:
			return this.coin500*500;
		case 100:
			return this.coin100*100;
		case 50:
			return this.coin50*50;
		case 10:
			return this.coin10*10;
		case 5:
			return this.coin5*5;
		case 1:
			return this.coin1*1;
		}
		return -1;
	}

	int getAmount() {
		return this.coin500*500
				+coin100*100
				+coin50*50
				+coin10*10
				+coin5*5
				+coin1*1;
	}

	int getCount() {
		return this.coin500+coin100+coin50+coin10+coin5+coin1;
	}

	public String toString() {
		return String.format("500:%d,100:%d,50:%d,10:%d,5:%d,1:%d",
				this.coin500,this.coin100,this.coin50,this.coin10,this.coin5,this.coin1);
	}
}
