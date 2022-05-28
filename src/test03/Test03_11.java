package test03;

import java.util.Random;

//練習問題 3 - 11
//月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
//
//表示する祝日は以下の日とします。
//
//１月：元日、成人の日
//２月：建国記念の日
//３月：春分の日
//４月：昭和の日
//５月：憲法記念日、みどりの日、こどもの日
//７月：海の日
//９月：敬老の日、秋分の日
//１０月：体育の日
//１１月：文化の日、勤労感謝の日
//１２月：天皇誕生日
public class Test03_11 {
	public static void main(String[] args) {
		Month m = new Month();
		int month = m.monthMaker();
		String holidayTxt = m.monthHoliday(month);
		System.out.println(String.format("%d月の休日は、「%s」",month,holidayTxt));
	}
}

class Month{
	int monthMaker() {
		Random rnd = new Random();
		return rnd.nextInt(12)+1;
	}
	String monthHoliday(int month) {
		String holiday = "";
		switch(month) {
		case 1:
			holiday="元日、成人の日";
			break;
		case 2:
			holiday="建国記念日";
			break;
		case 3:
			holiday="春分の日";
			break;
		case 4:
			holiday="昭和の日";
			break;
		case 5:
			holiday="憲法記念日、みどりの日、こどもの日";
			break;
		case 6:
			holiday="なし";
			break;
		case 7:
			holiday="海の日";
			break;
		case 8:
			holiday="なし";
			break;
		case 9:
			holiday="敬老の日、秋分の日";
			break;
		case 10:
			holiday="体育の日";
			break;
		case 11:
			holiday="文化の日、勤労感謝の日";
			break;
		case 12:
			holiday="天皇誕生日";
			break;
		}
		return holiday;
	}
}