import java.io.*;
import java.util.*;

public class Solution2164 {
	public static void run() throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 1; i <= N; i++) {
			deque.addLast(i);
		}

		while (deque.size() > 1) {
			deque.pollFirst();
			deque.addLast(deque.pollFirst());
		}
		System.out.println(deque.peekFirst());
		br.close();
	}
}
