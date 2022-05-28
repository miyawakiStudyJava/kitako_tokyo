package test04;

//練習問題 4 - 17
//九九表（一の段～九の段）を表示するプログラムを作成しなさい。
//
//※ 	System.out.printfを使用する。
//System.out.printf(" %2d", x );のように、
//%2dと記述すると表示が2桁に揃う。
public class Test04_17 {
	public static void main(String[] args) {
		Kuku kuku = new Kuku();
		kuku.viewKuku();
	}
}

class Kuku {
	void viewKuku() {
		int x = 10;
		int y = 10;

		for (int i = 1; i < x; i++) {
			System.out.print(i+"の段：");
			for (int j = 1; j < y; j++) {
				System.out.print(String.format("%02d,", i*j));
			}
			System.out.println();
		}

	}
}