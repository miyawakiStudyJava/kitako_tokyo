package test05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//練習問題 5 - 3
//次のプログラムを作成しなさい。
//
//10 個の数値を入力する。
//入力された数値を偶数と奇数に分類して表示する。
//表示例：
//偶数：42 54 32 8
//奇数：7 35 71 13 21 45
public class Test05_03 {
	public static void main(String[] args) {
		Number0503 nc = new Number0503();
		int[] ary = nc.makeAry(10);
		int[] evenAry = nc.makeEvenAry(ary);
		int[] oddAry = nc.makeOddAry(ary);
		System.out.println("配列："+Arrays.toString(ary));
		System.out.println("偶数："+Arrays.toString(evenAry));
		System.out.println("奇数："+Arrays.toString(oddAry));
	}
}

class Number0503 {
	int[] makeAry(int num) {
		Random rnd = new Random();
		return rnd.ints(1, 100).limit(num).toArray();
	}

	int[] makeEvenAry(int[] ary) {
		List<Integer> evenList = new ArrayList<>();
		for (int n : ary) {
			if (n % 2 == 0) {
				evenList.add(n);
			}
		}
		return evenList.stream().mapToInt(i -> i).toArray();
	}

	int[] makeOddAry(int[] ary) {
		List<Integer> oddList = new ArrayList<>();
		for (int n : ary) {
			if (n % 2 != 0) {
				oddList.add(n);
			}
		}
		return oddList.stream().mapToInt(i -> i).toArray();
	}
}