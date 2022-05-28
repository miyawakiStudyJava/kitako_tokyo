package test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//練習問題 4 - 15
//入力された数が素数かどうかを判定するプログラムを作成しなさい。
//
//※ 	判定する数は 4 以上としてよい。
public class Test04_15 {
	public static void main(String[] args) {
		Random rnd = new Random();
		PrimeNumber pn = new PrimeNumber();
		int num = rnd.nextInt(20) + 1;
		if (pn.check(num)) {
			System.out.println(num + "は、素数。");
		} else {
			System.out.println(num + "は、素数ではない。");
		}
		;
//		pn.viewPrimeNumberList();
	}
}

class PrimeNumber {
	private int[] primeNumberList;

	PrimeNumber() {
		List<Integer> pmList = new ArrayList<>();
		pmList.add(2);
		pmList.add(3);
		boolean isPrime = true;
		for (int i = 4; i < 30; i++) {
			for (int n : pmList) {
				if (i % n == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				pmList.add(i);
			}
			isPrime = true;
		}
		pmList.add(1);
		this.primeNumberList = pmList.stream().mapToInt(i -> i).toArray();
	}

	boolean check(int num) {
		boolean isPrime = false;
		for (int n : this.primeNumberList) {
			if(num==n) {
				isPrime=true;
			}
		}
		return isPrime;
	}

	void viewPrimeNumberList() {
		for (int n : this.primeNumberList) {
			System.out.println(n);
		}
	}
}
