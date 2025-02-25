import java.io.*;

public class Solution1259 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String str;
		while (!(str = br.readLine()).equals("0")) {
			char[] chars = str.toCharArray();
			boolean isPalindrome = true;
			for (int i = 0; i < chars.length / 2 ; i++) {
				char a = chars[i];
				char b = chars[chars.length - 1 - i];
				if (a != b) {
					isPalindrome = false;
					break;
				}
			}
			bw.write(isPalindrome ? "yes" : "no");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
