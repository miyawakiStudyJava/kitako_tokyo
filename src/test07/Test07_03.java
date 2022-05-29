package test07;
//練習問題 7 - 3
//前問の Dog クラスを使用して次のプログラムを作成しなさい。
//
//Dog クラスのインスタンスを２つ作成する。
//１つ目のインスタンスに、名前、年齢を設定する。
//２つ目のインスタンスに、名前、年齢を設定する。
//１つ目のインスタンスの、プロフィールを表示する。
//２つ目のインスタンスの、プロフィールを表示する。
public class Test07_03 {
	public static void main(String[] args) {
		Dog0703 dog01 = new Dog0703();
		Dog0703 dog02 = new Dog0703();
		dog01.setName("inu01");
		dog02.setName("inu02");
		dog01.setAge(2);
		dog02.setAge(3);
		dog01.showProfile();
		dog02.showProfile();
	}
}
class Dog0703 {
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