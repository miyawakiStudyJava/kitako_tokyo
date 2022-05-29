package test07;
//練習問題 7 - 4
//前問の Dog クラスに、次の内容を追加しなさい。
//
//犬種を保持するメンバー変数。（ String 型）
//犬種を設定する引数（ String ）を持つコンストラクタ。
//ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
//修正した Dog クラスを使用して次のプログラムを作成しなさい。
//
//犬種を指定して Dog クラスのインスタンスを作成する。
//名前、年齢を設定する。
//プロフィールを表示する。
public class Test07_04 {
	public static void main(String[] args) {
		Dog0704 dog = new Dog0704("akita");
		dog.setName("inu");
		dog.setAge(20);
		dog.showProfile();
	}
}
class Dog0704 {
	private String dogType;
	private String name;
	private int age;

	Dog0704(String dogType){
		this.dogType = dogType;
	}

	public void setAge(int num) {
		this.age = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showProfile() {
		System.out.println("犬種は、"+this.dogType+"。名前は、" + this.name + "で、年齢は、"+this.age+"です。");
	}
}