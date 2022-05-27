package test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題 2 - 1
//String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
public class Test02_01 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        System.out.println("文字を入力してください。");
        String  s = br.readLine();    // 1行分の文字列を入力する
        System.out.println(s);
	}
}
