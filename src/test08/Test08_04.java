package test08;
//練習問題 8 - 4
//前問で作成したクラスを使用して、次のプログラムを作成しなさい。
//
//Animal クラスの配列を作成する。要素数は 4。
//配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
//配列の総ての要素の Speak メソッドを実行する。
public class Test08_04 {
	public static void main(String[] args) {
		Animal[] animalAry = new Animal[4];
		animalAry[0] = new Cat();
		animalAry[2] = new Cat();
		animalAry[1] = new Dog();
		animalAry[3] = new Dog();
		for(Animal a:animalAry) {
			a.speak();
		}
	}
}
