import java.util.*;
import java.io.*;

public class Solution10828 {
	public static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String st1 = st.nextToken();
			if (st1.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
			} else if (st1.equals("pop")) {
				System.out.println(stack.isEmpty() ? "-1" : stack.pop());
			} else if (st1.equals("size")) {
				System.out.println(stack.size());
			} else if (st1.equals("empty")) {
				System.out.println(stack.isEmpty() ? "1" : "0");
			} else if (st1.equals("top")) {
				System.out.println(stack.isEmpty() ? "-1" : stack.peek());
			}
		}
	}
}
