import java.util.*;
import java.io.*;

public class Solution9012 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			boolean vps = stack(br.readLine());
			System.out.println(vps ? "YES" : "NO");
		}
		br.close();
	}

	private static boolean stack(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
