package test08;
//練習問題 8 - 2
//前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
//
//Dog はメンバー・メソッドRunを持つ。
//Run を実行すると“トコトコ”という文字列を表示する。
//次のプログラムを作成しなさい。
//
//Cat クラスと Dog クラスのインスタンスを作成する。
//それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
//それぞれの ShowProfile を実行する。
//Cat のインスタンスの Sleep を実行する。
//Dog のインスタンスの Run を実行する。
public class Test08_02 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.setName("neko");
		dog.setName("inu");
		cat.setAge(1);
		dog.setAge(2);
		cat.showProfile();
		cat.sleep();
		dog.showProfile();
		dog.run();
	}
}
class Dog extends Animal{
	public void run() {
		System.out.println("トコトコ");
	}
	@Override
	public void speak() {
		System.out.println("ワンワン");
	}
}