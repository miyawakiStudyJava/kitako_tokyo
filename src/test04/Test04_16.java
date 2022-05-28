package test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//練習問題 4 - 16
//2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//
//例：
//20100
//2 2 3 5 5 67
public class Test04_16 {
	public static void main(String[] args) {
		MakeNumber mn = new MakeNumber();
		boolean isLoop = true;
		int num = mn.getNum();
		int startNum = num;
		List<Integer> intList = new ArrayList<>();
		int count = 2;
		while (isLoop) {
			if (num % count == 0) {
				intList.add(count);
				num = num / count;
			} else {
				count++;
			}
			if (num < count || count > (int)Math.sqrt(num)) {
				isLoop = false;
				intList.add(num);
			}
		}
		System.out.println(startNum+"を素因数分解すると");
		if (intList.size()==1) {
			System.out.println("素数なので素因数分解できない。");
		}else {
			for (int n : intList) {
				System.out.print(n + ",");
			}
		}
	}
}

class MakeNumber {
	private int num;

	MakeNumber() {
		Random rnd = new Random();
		this.num = rnd.nextInt(20) + 10;
	}

	int getNum() {
		return this.num;
	}
}