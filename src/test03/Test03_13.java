package test03;

import java.util.Random;
//練習問題 3 - 13
//月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
//
//また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
//
//※ 	switch 文を使用すること。

public class Test03_13 {
	public static void main(String[] args) {
		Test03Month m = new Test03Month();
		int month = 0;
		int days = 0;
		for (;;) {
			month = m.monthMaker();
			days = m.monthDays(month);
			if (days != 0) {
				break;
			}
			System.out.println(month + "月はありません。再入力してください。");
		}
		System.out.println(String.format("%d月は、「%d」日", month, days));
	}
}

class Test03Month {
	int monthMaker() {
		Random rnd = new Random();
		return rnd.nextInt(20) + 1;
	}

	int monthDays(int month) {
		int days = 0;
		switch (month) {
		case 1:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 9:
			days = 30;
			break;
		case 10:
			days = 31;
			break;
		case 11:
			days = 30;
			break;
		case 12:
			days = 31;
			break;
		default:
			days = 0;
			break;
		}
		return days;
	}
}
