package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03_08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("中間試験の結果を入力してください。（0～100点）");
		int middleExamResult = Integer.parseInt(br.readLine());
		System.out.println("期末試験の結果を入力してください。（0～100点）");
		int lastExamResult = Integer.parseInt(br.readLine());
		int totalResult = middleExamResult + lastExamResult;
		String resultText = "不合格";

		if (middleExamResult >= 60 && lastExamResult >= 60) {
			resultText = "合格";
		}else if(totalResult >= 130) {
			resultText = "合格";
		}else if(totalResult>=100 && (middleExamResult >= 90 || lastExamResult >= 90)) {
				resultText = "合格";
		}

		System.out.println(resultText);
	}
}
