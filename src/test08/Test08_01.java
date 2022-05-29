package test08;

//練習問題 8 - 1
//以下の Animal クラスを継承したクラス（派生クラス）、Cat を作成しなさい。
//
//Cat はメンバー・メソッド Sleep を持つ。
//Sleep を実行すると“スースー”という文字列を表示する。
//次のプログラムを作成しなさい。
//
//Cat クラスのインスタンスを作成する。
//public のメンバー変数、Name、Age に名前、年齢を設定する。
//ShowProfile を実行する。
//Sleep を実行する。
public class Test08_01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("NAME");
		cat.setAge(5);
		cat.showProfile();
		cat.sleep();
	}
}

class Cat extends Animal{
	public void sleep() {
		System.out.println("スースー");
	}
	@Override
	public void speak() {
		System.out.println("ニャー");
	}
}

abstract class Animal implements thing {
	private String name;
	private int age;
	Animal(){
		this.name = "nanashi";
		this.age = 0;
	}
	public String toString() {
		return "name:"+this.name+",age:"+this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void showProfile() {
		System.out.println("名前は、" + this.name + "、" + this.age + "歳です。");
	}
}