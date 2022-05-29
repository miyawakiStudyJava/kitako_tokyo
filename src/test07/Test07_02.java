package test07;
//練習問題 7 - 2
//前問の Dog クラスに、次の内容を追加しなさい。
//
//年齢を保持する int 型のメンバー変数。
//年齢を設定するメンバー・メソッド、SetAge。
//ShowProfile メソッドで名前、年齢を表示するようにする。
//修正した Dog クラスを使用して次のプログラムを作成しなさい。
//
//Dog クラスのインスタンスを作成する。
//名前、年齢を設定する。
//プロフィールを表示する。
public class Test07_02 {
	public static void main(String[] args) {
		Dog0702 dog = new Dog0702();
		dog.setName("dog");
		dog.setAge(19);
		dog.showProfile();
	}
}
class Dog0702 {
	private String name;
	private int age;

	public void setAge(int num) {
		this.age = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showProfile() {
		System.out.println("名前は、" + this.name + "で、年齢は、"+this.age+"です。");
	}
}