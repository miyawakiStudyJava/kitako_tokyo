package test06;

import java.util.ArrayList;
import java.util.List;

//練習問題 6 - 7
//ある数が素数かどうかを判定するメソッドを作成しなさい。
//
//このメソッドを使用して 10000 以上 10100 未満の素数を
//すべて表示するプログラムを作成しなさい。
public class Test06_07 {
	public static void main(String[] args) {
		PrimeNumber0607 pn = new PrimeNumber0607();
		int[] ary = pn.makePrimeNumberAry();
		for (int n : ary) {
			if (n >= 10_000 && n < 10_100) {
				System.out.println(n);
			}
		}
	}
}

class PrimeNumber0607 {
	public int[] makePrimeNumberAry() {
		List<Integer> primeNumberList = new ArrayList<>();
		primeNumberList.add(2);
		primeNumberList.add(3);
		boolean isPrime = true;
		for (int i = 4; i < 20000; i++) {
			for (int n : primeNumberList) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumberList.add(i);
			} else {
				isPrime = true;
			}
		}
		return primeNumberList.stream().mapToInt(i -> i).toArray();
	}
}
