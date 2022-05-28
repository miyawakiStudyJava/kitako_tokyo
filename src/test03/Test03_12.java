package test03;

import java.util.Random;

//練習問題 3 - 12
//好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
//
//※ 	switch 文を使用する。
//※ 	選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
//※ 	題材は鮨でなくても良い。
public class Test03_12 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(3)+1;
		switch(num){
		case 1:
			System.out.println("１：まぐろ");
			break;
		case 2:
			System.out.println("２：えび");
			break;
		case 3:
			System.out.println("３：こはだ");
			break;
		}
	}
}
