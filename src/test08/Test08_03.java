package test08;
//練習問題 8 - 3
//前問の Animal クラスに以下のメンバー・メソッドを追加しなさい。
//
//public void Speak()
//{
//    System.out.println( "......" );
//}
//Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
//
//次のプログラムを作成しなさい。
//
//Cat クラスと Dog クラスのインスタンスを作成する。
//それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
//それぞれの ShowProfile を実行する。
//それぞれの Speak を実行する。
public class Test08_03 {
	public static void main(String[] args) {
		Cat cat =new Cat();
		Dog dog = new Dog();
		cat.speak();
		dog.speak();
	}
}

interface thing {
	void speak();
}