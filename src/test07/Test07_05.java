package test07;
//練習問題 7 - 5

import java.util.Random;

//硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
//
//500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
//AddCoins メソッドで硬貨を追加する。
//引数は硬貨の種類（ int ）と枚数（ int ）。
//GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
//引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
//GetAmount メソッドで硬貨の総額を取得する。
//戻り値は硬貨の総額( int )。

//CoinCase クラスを使用して次のプログラムを作成しなさい。
//
//CoinCase クラスのインスタンスを作成する。
//種s類と枚数を入力し、AddCoins メソッドで硬貨を追加することを
//10 回繰り返す。
//各硬貨が何枚あるかを表示する。
//総額を表示する。
//※ 	硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、
//該当しない数が指定された場合には無視する。
public class Test07_05 {
	public static void main(String[] args) {
		CoinCase cc = new CoinCase();
		Random rnd = new Random();
		int[] coinAry = {1,5,10,50,100,500};
		int coinType=0;
		int coinCount=0;
		for(int i=0;i<10;i++) {
			coinType = coinAry[rnd.nextInt(coinAry.length)];
			coinCount = rnd.nextInt(10);
			cc.AddCoins(coinType, coinCount);
		}
		System.out.println(cc);
		System.out.println(cc.getAmount());
	}
}

class CoinCase {
	private int coin500;
	private int coin100;
	private int coin50;
	private int coin10;
	private int coin5;
	private int coin1;

	CoinCase() {
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

	int getAmount() {
		return this.coin500*500
				+coin100*100
				+coin50*50
				+coin10*10
				+coin5*5
				+coin1*1;
	}

	public String toString() {
		return String.format("500:%d,100:%d,50:%d,10:%d,5:%d,1:%d",
				this.coin500,this.coin100,this.coin50,this.coin10,this.coin5,this.coin1);
	}
}