package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//練習問題 3 - 10
//整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。
//
//（判定１）x は y より小さく、かつ、x と y は共に偶数である。
//（判定２）x は y より小さい、または、x は偶数である。
//（判定３）x と y は等しく、かつ、負の数である。
//（判定４）x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
//（判定５）x も y も負の数である、ではない。（ x も y も負の数である、の否定）

public class Test03_10 {
	public static void main(String[] args) {
		TestInput ti = new TestInput();
		int x = ti.rndNumMaker(100);
		int y = ti.rndNumMaker(100);
		boolean isEvenX = ti.isEven(x);
		boolean isEvenY = ti.isEven(y);
		System.out.println(String.format("x=%d,y=%d", x, y));
		StringBuilder sb = new StringBuilder("");

		//判定１，２
		if (x < y) {
			sb.append("xはyより小さい。\n");
			if (isEvenX == true) {
				if (isEvenY == true) {
					sb.append("x、yはともに偶数である。\n");
				} else {
					sb.append("xは偶数である。\n");
				}
			}
			//判定３
		} else if (x == y && x < 0) {
			sb.append("x、yは等しく、かつ、負の数である。\n");
		}

		//判定４ xは10以下または100以上で、かつ、yは10以上かつ100以下である。
		if (x < 10 | x >= 100) {
			if (y >= 10 | y <= 100) {
				sb.append("xは10以下または100以上で、かつ、yは10以上かつ100以下である。\n");
			}
		}

		//（判定５）xもyも負の数である、ではない。（xもyも負の数である、の否定）
		if(!(x<0&&y<0)) {
			sb.append("xもyも負の数である、ではない。");
		}else {
			sb.append("xもyも負の数である。");
		}
		System.out.println(sb);
	}
}

class TestInput {
	public int input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		try {
			result = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			result = -1;
		}
		return result;
	}

	public int rndNumMaker(int num) {
		Random rnd = new Random();
		return rnd.nextInt(num);
	}

	public boolean isEven(int num) {
		boolean check = num / 2 == 0;
		return check;
	}
}