package test05;

public class Test05_00 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if(x%10==0)return;
	}
}

class Solution {
	public void reverseWords(char[] str) {
		int len = str.length;
		if (len == 0)
			return;
		int start = 0;
		int end = 0;
		for (; end < len; end++) {
			while (end < len && str[end] != ' ')
				end++;
			if (end < len) {
				reverse(str, start, end - 1);
			}
		}
	}

	private void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
		}
	}
}