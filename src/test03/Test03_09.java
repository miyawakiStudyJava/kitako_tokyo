package test03;
//練習問題 3 - 9

//曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、
//休診であるかを表示するプログラムを作成しなさい。
//
//開いているか、休診であるかは、次の表に従います。
//		日曜	月曜	火曜	水曜	木曜	金曜	土曜
//午前	休診	○		休診 	○		○		休診	○
//午後	休診	○		○	 	○		○		○		休診
//夜間	休診	○		○		休診	○		○		休診
//※ 	曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
//>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
//>0=午前、1=午後、2=夜間

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//日曜は休み
//月、木は診察
//火、金は午前のみ休診
//水は夜間休診
//土は午前のみ診察

public class Test03_09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int weekDay = Integer.parseInt(br.readLine());
		System.out.println("0=午前、1=午後、2=夜間");
		int dayTime = Integer.parseInt(br.readLine());
		boolean isShinsatu = false;

		//日
		if (weekDay == 0) {
			isShinsatu = false;
		}

		//月、木
		if (weekDay == 1 || weekDay == 4) {
			isShinsatu = true;
		}

		//火、金
		if (weekDay == 2 || weekDay == 5) {
			if (dayTime > 0) {
				isShinsatu = true;
			}
		}

		//水
		if (weekDay == 3) {
			if (dayTime < 2) {
				isShinsatu = true;
			}
		}

		//土
		if (weekDay == 6) {
			if (dayTime == 0) {
				isShinsatu = true;
			}
		}

		//print
		if (isShinsatu) {
			System.out.println("診察日");
		} else {
			System.out.println("休診日");
		}

	}
}
