package test07;

//練習問題 7 - 1
//以下の Dog クラスを使用して、次のプログラムを作成しなさい。
//
//Dog クラスのインスタンスを作成する。
//SetName メソッドで名前を設定する。
//ShowProfile メソッドで名前を表示する
public class Test07_01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("犬");
		dog.showProfile();
 	}
}

class Dog {
	private String Name;

	public void setName(String nm) {
		Name = nm;
	}

	public void showProfile() {
		System.out.println("名前は、" + Name + "です。");
	}
}